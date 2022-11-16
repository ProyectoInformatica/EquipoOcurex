package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Ocurex");
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml"));
			ControladorOcurex controlador = new ControladorOcurex();
			loader.setController(controlador);
			Parent root = loader.load();
			
			
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

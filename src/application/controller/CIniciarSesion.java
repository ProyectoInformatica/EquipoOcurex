package application.controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;

public class CIniciarSesion {

    @FXML
    private JFXTextArea usuario;

    @FXML
    private JFXTextArea password;

    @FXML
    private JFXButton btnIniciarSesion;

    @FXML
    private JFXButton btnRegistrarse;

    @FXML
    void iniciarSesion(ActionEvent event) {

    }

    @FXML
    void registrarse(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    	try {
 
			FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseMenu.fxml")); //Cargo el loader
			
			CRegistrarMenu controlador2 = new CRegistrarMenu(); //creo el controlador
			
			loader2.setController(controlador2); //seteo el controlador con el loader que cree antes.
			
			Parent root2 = loader2.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root2));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
}
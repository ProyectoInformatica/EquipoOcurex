package application.controller;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CRegistrarMenu {

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    private JFXButton btnDirector;

    @FXML
    private JFXButton btnDoctor;

    @FXML
    private JFXButton btnSeguridad;

    @FXML
    void registrarDirector(ActionEvent event) {
	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    	try {
 
			FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseDirector.fxml")); //Cargo el loader
			
			CRegistrarDirector controlador3 = new CRegistrarDirector(); //creo el controlador
			
			loader3.setController(controlador3); //seteo el controlador con el loader que cree antes.
			
			Parent root3 = loader3.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root3));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    @FXML
    void registrarDoctor(ActionEvent event) {
	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    	try {
 
			FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseDoctor.fxml")); //Cargo el loader
			
			CRegistrarDoctor controlador4 = new CRegistrarDoctor(); //creo el controlador
			
			loader4.setController(controlador4); //seteo el controlador con el loader que cree antes.
			
			Parent root4 = loader4.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root4));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    @FXML
    void registrarSeguridad(ActionEvent event) {
	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    	try {
 
			FXMLLoader loader5 = new FXMLLoader(getClass().getResource("/application/view/RegistrarseSeguridad.fxml")); //Cargo el loader
			
			CRegistrarSeguridad controlador5 = new CRegistrarSeguridad(); //creo el controlador
			
			loader5.setController(controlador5); //seteo el controlador con el loader que cree antes.
			
			Parent root5 = loader5.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root5));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

    @FXML
    void volverAlMenu(ActionEvent event) {
	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
		
    	try {
 
			FXMLLoader loader6 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador6 = new CIniciarSesion(); //creo el controlador
		
			loader6.setController(controlador6); //seteo el controlador con el loader que cree antes.
			
			Parent root6 = loader6.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root6));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }

}

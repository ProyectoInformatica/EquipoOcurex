package application.controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CRegistrarSeguridad {

    @FXML
    private JFXTextArea jfxSexo;

    @FXML
    private JFXTextArea jfxEmail;

    @FXML
    private JFXTextArea jfxNombre;

    @FXML
    private JFXTextArea jfxTelefono;

    @FXML
    private JFXTextArea jfxApellido;

    @FXML
    private JFXTextArea jfxDomicilio;

    @FXML
    private JFXButton btnContinuar;

    @FXML
    private JFXButton btnVolverAlMenu;

    @FXML
    void continuar(ActionEvent event) {

    }

    @FXML
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	
    	try {
 
			FXMLLoader loader9 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador9 = new CIniciarSesion(); //creo el controlador
		
			loader9.setController(controlador9); //seteo el controlador con el loader que cree antes.
			
			Parent root9 = loader9.load(); //lo pongo como parent
			
			Stage stage = new Stage();
			
			stage.setScene(new Scene(root9));//lo seteo como primary stage
						
			stage.initModality(Modality.WINDOW_MODAL);//para poder abrir solo una ventana.
						
			stage.initOwner(((Node) (event.getSource())).getScene().getWindow()); //para poder abrir solo una ventana, seteo el owner.
			
			stage.show();//muestro la el archivo.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
}
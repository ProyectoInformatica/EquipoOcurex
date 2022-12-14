package application.controller;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;

//json
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

//jfoenix
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

//javafx
import application.model.Director;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CRegistrarDirector {

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
    void volverAlMenu(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	
    	try {
 
			FXMLLoader loader7 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador7 = new CIniciarSesion(); //creo el controlador
		
			loader7.setController(controlador7); //seteo el controlador con el loader que cree antes.
			
			Parent root7 = loader7.load(); //lo pongo como parent
			
			Scene scene = new Scene( root7 );
			
			stage.setScene( scene );
									
			stage.show();//muestro la el archivo.
			
			priorStage.close();			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
    
    @FXML
    void continuar(ActionEvent event) {
    	// ---------------------------Forma generica de llamar a una nueva ventana desde otra, es lo mismo siempre, tengo que cambiar los nombre de los paramentos nada mas, y el path del get source.---------------------------
       	//Registrar al cliente, y mandarlo al iniciar sesion asi puede entrar.
    	
    	Stage priorStage = (Stage)btnVolverAlMenu.getScene().getWindow();
    	Stage stage = new Stage();

    	try {
 
			FXMLLoader loader8 = new FXMLLoader(getClass().getResource("/application/view/IniciarSesion.fxml")); //Cargo el loader
			
			CIniciarSesion controlador8 = new CIniciarSesion(); //creo el controlador
		
			loader8.setController(controlador8); //seteo el controlador con el loader que cree antes.
			
			Parent root8 = loader8.load(); //lo pongo como parent
			
			Scene scene = new Scene( root8 );
			
			stage.setScene(scene);
			
			stage.show();
			
			//serializar_Array_A_Json_Director();
						
			priorStage.close();	

			
		} catch(Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }	
    
	public void serializar_Array_A_Json_Director() {
		//Director director = new Director("Hola","Hola","Hola",1,"Hola","Hola",LocalDate.now());
		Vector<Director> directores = new Vector<Director>();
		directores.add(new Director("Hola","Hola","Hola",1,"Hola","Hola",LocalDate.now()));

		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String representacionBonita = prettyGson.toJson(directores);
		System.out.println(representacionBonita);
		
		try(FileWriter writer = new FileWriter("dirdirdirdir.json")){
			prettyGson.toJson(directores, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
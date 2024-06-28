package fes.aragon.controlador;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class JuegoAventuraController implements Initializable{

    @FXML
    private Button btnRegresar;

    @FXML
    private Canvas cvsLienzo;
    
    private GraphicsContext graficos;
    String preguntas[] = { "Aventura1","Aventura2","Aventura3" };
	int numPregunta = (int) (Math.random() * 3);
	String pregunta = preguntas[numPregunta];

    @FXML
    void accionRegresar(ActionEvent event) {
    	try {
    		FXMLLoader alta = new FXMLLoader(getClass().getResource("/fes/aragon/fxml/Inicio.fxml"));
    		Parent parent=(Parent)alta.load();			
    		Scene scene = new Scene(parent);
    		scene.getStylesheets().add(getClass().getResource("/fes/aragon/css/application.css").toExternalForm());
    		Stage escenario = new Stage();
    		escenario.setScene(scene);			
    		escenario.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	Stage stage = (Stage) btnRegresar.getScene().getWindow();
    	stage.close();
    }
    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cvsLienzo.setWidth(600);
		cvsLienzo.setHeight(600);
		graficos=cvsLienzo.getGraphicsContext2D();
		cvsLienzo.setFocusTraversable(true);
		pintar();
		
	}
    private void pintar() {
    	graficos.drawImage(new Image("/fes/aragon/recursosAventura/"+pregunta+".png"), 0, 0);
    }
}

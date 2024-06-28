package fes.aragon.controlador;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class InicioController {
    @FXML
    private Button btnAccion;
    
    @FXML
    private Button btnArcade;

    @FXML
    private Button btnAventura;

    @FXML
    private Button btnEstrategia;

    @FXML
    void accionAccion(ActionEvent event) {
    	try {
    		FXMLLoader alta = new FXMLLoader(getClass().getResource("/fes/aragon/fxml/JuegoAccion.fxml"));
    		Parent parent=(Parent)alta.load();			
    		Scene scene = new Scene(parent);
    		scene.getStylesheets().add(getClass().getResource("/fes/aragon/css/application.css").toExternalForm());
    		Stage escenario = new Stage();
    		escenario.setScene(scene);			
    		escenario.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	Stage stage = (Stage) btnAccion.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void accionArcade(ActionEvent event) {
    	try {
    		FXMLLoader alta = new FXMLLoader(getClass().getResource("/fes/aragon/fxml/JuegoArcade.fxml"));
    		Parent parent=(Parent)alta.load();			
    		Scene scene = new Scene(parent);
    		scene.getStylesheets().add(getClass().getResource("/fes/aragon/css/application.css").toExternalForm());
    		Stage escenario = new Stage();
    		escenario.setScene(scene);			
    		escenario.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	Stage stage = (Stage) btnAventura.getScene().getWindow();
    	stage.close();

    }

    @FXML
    void accionAventura(ActionEvent event) {
    	try {
    		FXMLLoader alta = new FXMLLoader(getClass().getResource("/fes/aragon/fxml/JuegoAventura.fxml"));
    		Parent parent=(Parent)alta.load();			
    		Scene scene = new Scene(parent);
    		scene.getStylesheets().add(getClass().getResource("/fes/aragon/css/application.css").toExternalForm());
    		Stage escenario = new Stage();
    		escenario.setScene(scene);			
    		escenario.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	Stage stage = (Stage) btnAventura.getScene().getWindow();
    	stage.close();
    }

  

    @FXML
    void accionEstrategia(ActionEvent event) {
    	try {
    		FXMLLoader alta = new FXMLLoader(getClass().getResource("/fes/aragon/fxml/JuegoEstrategia.fxml"));
    		Parent parent=(Parent)alta.load();			
    		Scene scene = new Scene(parent);
    		scene.getStylesheets().add(getClass().getResource("/fes/aragon/css/application.css").toExternalForm());
    		Stage escenario = new Stage();
    		escenario.setScene(scene);			
    		escenario.show();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
    	Stage stage = (Stage) btnAventura.getScene().getWindow();
    	stage.close();
    }
	
}

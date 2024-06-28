package fes.aragon.controlador;

import fes.aragon.modelo.Gerente;
import fes.aragon.modelo.Hotel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GerenteController {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRfc;

    @FXML
    private TextField txtTelefono;

    @FXML
    void cancelarGerente(ActionEvent event) {
    	this.cerrar();
    }

    @FXML
    void nuevoGerente(ActionEvent event) {
    	Hotel hotel=Hotel.getHotel ();
    	/*Gerente gerente=new Gerente();
    	gerente.setNombre(this.txtNombre.getText());
    	gerente.setApellidoPaterno(this.txtApellidoPaterno.getText());
    	gerente.setApellidoMaterno(this.txtApellidoMaterno.getText());
    	gerente.setRfc(this.txtRfc.getText());
    	gerente.setCorreo(this.txtCorreo.getText());
    	gerente.setTelefono(this.txtTelefono.getText());
    	hotel.setGerente(gerente);*/
    	hotel.getGerente().setNombre(this.txtNombre.getText());
    	hotel.getGerente().setApellidoPaterno(this.txtApellidoPaterno.getText());
    	hotel.getGerente().setApellidoMaterno(this.txtApellidoMaterno.getText());
    	hotel.getGerente().setRfc(this.txtRfc.getText ());
    	hotel.getGerente().setCorreo(this.txtCorreo.getText());
    	hotel.getGerente().setTelefono(this.txtTelefono.getText ());
    	
    	System.out.println(hotel.getGerente());
    	this.cerrar();
    }
    private void cerrar() {
    	Stage stage=(Stage)btnCancelar.getScene().getWindow();
    	stage.close();
    }

}

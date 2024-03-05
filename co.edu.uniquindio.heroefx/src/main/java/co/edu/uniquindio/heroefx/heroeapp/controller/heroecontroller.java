package co.edu.uniquindio.heroefx.heroeapp.controller;

import co.edu.uniquindio.heroefx.heroeapp.heroe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class heroecontroller {

    @FXML
    private Button btnAgregarHeroe;

    @FXML
    private AnchorPane txt;

    @FXML
    private TextField txtArmamento;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtVehiculo;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarHeroe(ActionEvent event) {
        agregarHeroe();

    }

    private void agregarHeroe() {
        heroe Heroe = new heroe();

        Heroe.setNombre(txtNombre.getText());
        Heroe.setCodigo(txtCodigo.getText());
        Heroe.setPoder(txtPoder.getText());
        Heroe.setColor(txtColor.getText());
        Heroe.setArmamento(txtArmamento.getText());
        Heroe.setVehiculo(txtVehiculo.getText());
        txtResultado.setText(Heroe.toString());

    }
}


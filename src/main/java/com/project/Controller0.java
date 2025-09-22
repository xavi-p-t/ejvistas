package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller0 {

    @FXML
    private Button button1;
    @FXML
    private AnchorPane container;

    @FXML
    private TextField nombre,edad;

    @FXML
    private Label textoError;

    

    @FXML
    private void animateToView1(ActionEvent event) {
        if (nombre.getText().isEmpty()) {
            textoError.setText("Nombre esta vacio");
        } else if (edad.getText().isEmpty() ) {
            textoError.setText("Edad esta vacio");
        } else if (!edad.getText().matches("\\d+")) {
            textoError.setText("La edad tiene que ser un numero");
        } else if (nombre.getText().matches(".*\\d.*")) {
            textoError.setText("Nombre no puede contener numeros");
        } else{
            Main.nombre = nombre.getText();
            Main.edad = edad.getText();

            Controller1 ctrl1 = (Controller1) UtilsViews.getController("View1");
            ctrl1.actualizarMensaje();

            UtilsViews.setViewAnimating("View1");
        }  
    }

    
}
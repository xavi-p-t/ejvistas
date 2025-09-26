package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller1 {

    @FXML
    private Button buttonback;
    @FXML
    private AnchorPane container;
    @FXML
    private Label textoFinal;


    
    public void actualizarMensaje() {

        textoFinal.setText("Hola "+Main.nombre+", tienes "+Main.edad+" años");
    }
        
    
   
    @FXML
    private void animateToView0(ActionEvent event) {
        UtilsViews.setViewAnimating("View0");
    }

    

}
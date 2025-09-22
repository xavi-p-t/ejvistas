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


    
    public void setTexto(String nombre, String edad){
        this.textoFinal.setText("Hola "+nombre+", tu edad es "+edad);
    }
   
    @FXML
    private void animateToView0(ActionEvent event) {
        UtilsViews.setViewAnimating("View0");
    }

    

}
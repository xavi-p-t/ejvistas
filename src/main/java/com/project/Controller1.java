package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller1 {

    @FXML
    private Button buttonback;
    @FXML
    private AnchorPane container;
    @FXML
    private Text textoFinal;

    
    
    
   
    @FXML
    private void animateToView0(ActionEvent event) {
        UtilsViews.setViewAnimating("View0");
    }

    

}
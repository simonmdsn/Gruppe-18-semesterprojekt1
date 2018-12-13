/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui.map;


import geosimui.FXMLStateButtonsController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.Initializable;


/**
 * FXML Controller class
 *
 * @author Lukas
 */

public class FXMLArizonaMapController implements Initializable{
    @FXML
    private Label gamePointsLabel;
    @FXML
    private Button arizSouthButton;
    @FXML
    private Button arizNorthButton;
    @FXML
    private Button arizEastButton;
    @FXML
    private Button arizWestButton;
    @FXML
    private Button arizPlayButton;
    @FXML
    private Label mapLabel;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }    


 
    @FXML
    private void handleArizPlayButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("../question/FXMLArizona.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        window.setTitle("Arizona");
        window.setScene(gameScene);
        window.show();
    }


    @FXML
    private void handleArizSouthButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }

    @FXML
    private void handleArizEastButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }

    @FXML
    private void handleArizWestButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }
        

    @FXML
    private void handleArizNorthButton(ActionEvent event) throws IOException{
        Parent game = FXMLLoader.load(getClass().getResource("FXMLUtahMap.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        window.setTitle("Arizona");
        window.setScene(gameScene);
        window.show();
    }
}

 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui.map;

import geosimui.FXMLStateButtonsController;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author madsm
 */
public class FXMLCaliforniaMapController implements Initializable {

    @FXML
    private ImageView california;
    @FXML
    private Label mapLabel;
    @FXML
    private Button caliSouthButton;
    @FXML
    private Button caliNorthButton;
    @FXML
    private Button caliEastButton;
    @FXML
    private Button caliWestButton;
    @FXML
    private Label gamePointsLabel;
    @FXML
    private Button caliPlayButton;
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleCaliSouthButton(ActionEvent event)throws IOException {
    }

    @FXML
    private void handleCaliNorthButton(ActionEvent event)throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLOregonMap.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Utah");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleCaliEastButton(ActionEvent event)throws IOException {
    }

    @FXML
    private void handleCaliWestButton(ActionEvent event)throws IOException {
    }

    @FXML
    private void handleCaliPlayButton(ActionEvent event)throws IOException {
    }

    

     

    
}

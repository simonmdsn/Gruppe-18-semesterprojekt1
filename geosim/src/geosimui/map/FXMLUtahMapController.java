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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lukas
 */
public class FXMLUtahMapController implements Initializable {
    @FXML
    private Button utahSouthButton;
    @FXML
    private Button utahNorthButton;
    @FXML
    private Button utahEastButton;
    @FXML
    private Button utahWestButton;
    @FXML
    private Button utahPlayButton;
    @FXML
    private Label gamePointsLabel;
    @FXML
    private Label mapLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gamePointsLabel.setText("Points: "+Integer.toString(geosimExtensions.Questions.gamepoints));
    }    

    @FXML
    private void handleUtahSouthButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLArizonaMap.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //("Arizona");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleUtahNorthButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }

    @FXML
    private void handleUtahEastButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }

    @FXML
    private void handleUtahWestButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLNevadaMap.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //("Arizona");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleUtahPlayButton(ActionEvent event) throws IOException {
        if(geosimExtensions.Questions.utah== 0) {
        Parent game = FXMLLoader.load(getClass().getResource("../question/FXMLUtah.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


        window.setScene(gameScene);
        window.show();
    } else{
            mapLabel.setText("You have already answered the questions in this state.");
        }
    }
    
}

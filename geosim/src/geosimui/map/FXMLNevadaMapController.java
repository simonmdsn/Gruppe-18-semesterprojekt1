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
public class FXMLNevadaMapController implements Initializable {
    @FXML
    private Button nevaSouthButton;
    @FXML
    private Button nevaNorthButton;
    @FXML
    private Button nevaEastButton;
    @FXML
    private Button nevaWestButton;
    @FXML
    private Button nevaPlayButton;
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
    private void handleNevaSouthButton(ActionEvent event) {
        mapLabel.setText("You can't go in that direction!");
    }

    @FXML
    private void handleNevaNorthButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLIdahoMap.fxml"));
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
    private void handleNevaEastButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLUtahMap.fxml"));
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
    private void handleNevaWestButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLCaliforniaMap.fxml"));
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
    private void handleNevaPlayButton(ActionEvent event) throws IOException {
        if(geosimExtensions.Questions.nevada == 0) {
        Parent game = FXMLLoader.load(getClass().getResource("../question/FXMLNevada.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //("Arizona");
        window.setScene(gameScene);
        window.show();
    } else{
            mapLabel.setText("You have already answered the questions in this state.");
        }
    }
    
}

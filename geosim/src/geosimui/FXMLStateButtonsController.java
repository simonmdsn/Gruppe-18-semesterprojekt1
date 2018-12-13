/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bruger
 */
public class FXMLStateButtonsController implements Initializable {

    @FXML
    public Button californiaButton;
    @FXML
    public Button oregonButton;
    @FXML
    public Button washingtonButton;
    @FXML
    public Button idahoButton;
    @FXML
    public Button nevadaButton;
    @FXML
    public Button arizonaButton;
    @FXML
    public Button utahButton;
    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public static void disableButton(Button button){
        button.setDisable(true);
    }

    @FXML
    private void handleCaliforniaButton(ActionEvent event) throws IOException {

        Parent game = FXMLLoader.load(getClass().getResource("map/FXMLCaliforniaMap.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("California");
        window.setScene(gameScene);
        window.show();

    }
    
    @FXML
    private void handleOregonButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLOregon.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Oregon");
        window.setScene(gameScene);
        window.show();

    }

    @FXML
    private void handleWashingtonButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLWashington.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Washington");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleIdahoButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLIdaho.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Idaho");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleNevadaButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLNevada.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Nevada");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleArizonaButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLArizona.fxml"));
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
    private void handleUtahButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLUtah.fxml"));
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
    private void handleBackButtonAction(ActionEvent event)throws IOException {
                Parent game = FXMLLoader.load(getClass().getResource("FXMLStartMenu.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Utah");
        window.setScene(gameScene);
        window.show();
    }

}

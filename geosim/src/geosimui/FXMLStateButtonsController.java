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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public static void disableButton(Button button){
        button.setDisable(true);
    }

    @FXML
    private void handleCaliforniaButton(ActionEvent event) throws IOException {

        Parent game = FXMLLoader.load(getClass().getResource("question/FXMLCalifornia.fxml"));
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

        window.setTitle("California");
        window.setScene(gameScene);
        window.show();

    }

}

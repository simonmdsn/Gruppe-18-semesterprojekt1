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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author madsm
 */
public class FXMLCaliforniaMapController implements Initializable {

    @FXML
    private ImageView california;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleCaliMapEnter(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.ENTER) {

            Parent game = FXMLLoader.load(getClass().getResource("question/FXMLCalifornia.fxml"));
            Scene gameScene = new Scene(game);
            gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
            System.out.println(gameScene.getStylesheets());
            //This line gets the Stage information
            Stage window = (Stage) ((Node) keyEvent.getSource()).getScene().getWindow();

            window.setTitle("California");
            window.setScene(gameScene);
            window.show();

        }
    }

    @FXML
    private void handleCaliMapUp(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.UP) {

            Parent game = FXMLLoader.load(getClass().getResource("map/FXMLOregonMap.fxml"));
            Scene gameScene = new Scene(game);
            gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
            System.out.println(gameScene.getStylesheets());
            //This line gets the Stage information
            Stage window = (Stage) ((Node) keyEvent.getSource()).getScene().getWindow();

            window.setTitle("Oregon");
            window.setScene(gameScene);
            window.show();

        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui.question;

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
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLCaliforniaController implements Initializable, MethodInterface {

    @FXML
    private GridPane gridPaneOne, gridPaneTwo, gridPaneThree;
    @FXML
    private Label caliFirstQuestionLabel, caliSecondQuestionLabel, caliThirdQuestionLabel;
    @FXML
    private Button caliFirstA, caliFirstB, caliFirstC;
    @FXML
    private Button caliSecondA, caliSecondB, caliSecondC;
    @FXML
    private Button caliThirdA, caliThirdB, caliThirdC;
    @FXML
    private Label caliFirstQuestion, caliSecondQuestion, caliThirdQuestion;
    private Text californiaFinishText;
    @FXML
    private Label gamePointsLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
        // TODO
    }

    //First question handles
    @FXML
    private void handleCaliFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

        geosimExtensions.Questions.gamepoints++;
        update();

    }

    @FXML
    private void handleCaliFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

    }

    @FXML
    private void handleCaliFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

    }

    //Second question handles
    @FXML
    private void handleCaliSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleCaliSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        geosimExtensions.Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleCaliSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);

    }

    //Third question handles
    @FXML
    private void handleCaliThirdA(ActionEvent event) throws IOException {
        geosimExtensions.Questions.gamepoints++;
        update();
        gridPaneThree.setVisible(false);
        //californiaFinishText.setVisible(true);
        update();

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLCaliforniaMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleCaliThirdB(ActionEvent event) throws IOException {
        gridPaneThree.setVisible(false);

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLCaliforniaMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleCaliThirdC(ActionEvent event) throws IOException {
        gridPaneThree.setVisible(false);

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLCaliforniaMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();

    }

    //Map handler button
    private void handleMapButton(ActionEvent event) throws IOException {

        Parent game = FXMLLoader.load(getClass().getResource("FXMLMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();

    }

    //Gamepoints updater
    @Override
    public void update() {
        gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }

}

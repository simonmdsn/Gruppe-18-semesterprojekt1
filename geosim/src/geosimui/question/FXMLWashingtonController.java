/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui.question;

import geosimExtensions.Questions;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author simon
 */
public class FXMLWashingtonController implements Initializable, MethodInterface {

    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private Button washSecondA;
    @FXML
    private Button washSecondB;
    @FXML
    private Button washSecondC;
    @FXML
    private Label washSecondQuestionLabel;
    @FXML
    private Label washSecondQuestion;
    @FXML
    private Button washThirdA;
    @FXML
    private Button washThirdB;
    @FXML
    private Button washThirdC;
    @FXML
    private Label washThirdQuestionLabel;
    @FXML
    private Label washThirdQuestion;
    @FXML
    private Button washFirstA;
    @FXML
    private Button washFirstB;
    @FXML
    private Button washFirstC;
    @FXML
    private Label washFirstQuestionLabel;
    @FXML
    private Label washFirstQuestion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }

    @FXML
    private void handleOregSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleWashSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleWashSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleWashThirdA(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLWashingtonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleWashThirdB(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLWashingtonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleWashThirdC(ActionEvent event) throws IOException {
        Questions.gamepoints++;
        update();

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLWashingtonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleWashFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleWashFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleWashFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @Override
    public void update() {
        gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }

}

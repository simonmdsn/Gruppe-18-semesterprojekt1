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
public class FXMLUtahController implements Initializable, MethodInterface {

    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private Button utahSecondA;
    @FXML
    private Button utahSecondB;
    @FXML
    private Button utahSecondC;
    @FXML
    private Label utahSecondQuestionLabel;
    @FXML
    private Label utahSecondQuestion;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private Button utahThirdA;
    @FXML
    private Button utahThirdB;
    @FXML
    private Button utahThirdC;
    @FXML
    private Label utahThirdQuestionLabel;
    @FXML
    private Label utahThirdQuestion;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private Button utahFirstA;
    @FXML
    private Button utahFirstB;
    @FXML
    private Button utahFirstC;
    @FXML
    private Label utahFirstQuestionLabel;
    @FXML
    private Label utahFirstQuestion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleUtahSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleUtahSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleUtahSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleUtahThirdA(ActionEvent event) throws IOException {
        Questions.gamepoints++;
        update();

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLUtahMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleUtahThirdB(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLUtahMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleUtahThirdC(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLUtahMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleUtahFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleUtahFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleUtahFirstC(ActionEvent event) {
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

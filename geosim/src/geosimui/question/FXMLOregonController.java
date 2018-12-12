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
public class FXMLOregonController implements Initializable, MethodInterface {

    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private Button orgFirstA;
    @FXML
    private Button oregFirstB;
    @FXML
    private Button oregiFirstC;
    @FXML
    private Label oregFirstQuestionLabel;
    @FXML
    private Label oregFirstQuestion;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private Button oregSecondA;
    @FXML
    private Button oregSecondB;
    @FXML
    private Button oregSecondC;
    @FXML
    private Label oregSecondQuestionLabel;
    @FXML
    private Label oregSecondQuestion;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private Button oregThirdA;
    @FXML
    private Button oregThirdB;
    @FXML
    private Button oregThirdC;
    @FXML
    private Label oregThirdQuestionLabel;
    @FXML
    private Label oregThirdQuestion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }

    @FXML
    private void handleOregFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleOregFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleOregFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleOregSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);

    }

    @FXML
    private void handleOregSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleOregSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();

    }

    @FXML
    private void handleOregThirdA(ActionEvent event) throws IOException {
        Questions.gamepoints++;
        update();

        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLOregonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleOregThirdB(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLOregonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @FXML
    private void handleOregThirdC(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLOregonMap.fxml"));

        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Map");
        window.setScene(gameScene);
        window.show();
    }

    @Override
    public void update() {
        gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }

}

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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author simon
 */
public class FXMLCaliforniaController implements Initializable {

    @FXML
    private Label caliFirstQuestionLabel;
    private Button caliSecondQuestionFirstButton;
    @FXML
    private Label caliFirstQuestionLabel2;
    @FXML
    private AnchorPane anchorPaneCaliforniaFirstQuestions;
    @FXML
    private AnchorPane anchorPaneCaliforniaSecondQuestions;
    @FXML
    private AnchorPane anchorPaneCaliforniaThirdQuestions;
    @FXML
    private Label caliFirstQuestionLabel1;
    @FXML
    private Button caliFirstA;
    @FXML
    private Button caliFirstC;
    @FXML
    private Button caliFirstB;
    @FXML
    private Button caliSecondA;
    @FXML
    private Button caliSecondC;
    @FXML
    private Button caliSecondB;
    @FXML
    private Button caliThirdA;
    @FXML
    private Button caliThirdC;
    @FXML
    private Button caliThirdB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleCaliFirstA(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);

        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);

    }

    @FXML
    private void handleCaliFirstC(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);

        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliFirstB(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);

        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliSecondA(ActionEvent event) {
        anchorPaneCaliforniaSecondQuestions.setDisable(true);
        anchorPaneCaliforniaSecondQuestions.setVisible(false);

        anchorPaneCaliforniaThirdQuestions.setDisable(false);
        anchorPaneCaliforniaThirdQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliSecondC(ActionEvent event) {
        anchorPaneCaliforniaSecondQuestions.setDisable(true);
        anchorPaneCaliforniaSecondQuestions.setVisible(false);

        anchorPaneCaliforniaThirdQuestions.setDisable(false);
        anchorPaneCaliforniaThirdQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliSecondB(ActionEvent event) {
        anchorPaneCaliforniaSecondQuestions.setDisable(true);
        anchorPaneCaliforniaSecondQuestions.setVisible(false);

        anchorPaneCaliforniaThirdQuestions.setDisable(false);
        anchorPaneCaliforniaThirdQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliThirdA(ActionEvent event) throws IOException {

        Parent game = FXMLLoader.load(getClass().getResource("FXMLCaliforniaMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("California");
        window.setScene(gameScene);
        window.show();

    }

    @FXML
    private void handleCaliThirdC(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLCaliforniaMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("California");
        window.setScene(gameScene);
        window.show();

    }

    @FXML
    private void handleCaliThirdB(ActionEvent event) throws IOException {

        Parent game = FXMLLoader.load(getClass().getResource("FXMLCaliforniaMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("California");
        window.setScene(gameScene);
        window.show();

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author simon
 */
public class FXMLGameController implements Initializable {

    @FXML
    private Button caliFirstQuestionThirdButton;
    @FXML
    private Button caliFirstQuestionFirstButton;
    @FXML
    private Button caliFirstQuestionSecondButton;
    @FXML
    private Label caliFirstQuestionLabel;
    private Button caliSecondQuestionFirstButton;
    @FXML
    private Button caliFirstQuestionThirdButton1;
    @FXML
    private Button caliFirstQuestionFirstButton1;
    @FXML
    private Button caliFirstQuestionSecondButton1;
    @FXML
    private Label caliFirstQuestionLabel2;
    @FXML
    private Button caliFirstQuestionThirdButton2;
    @FXML
    private Button caliFirstQuestionFirstButton2;
    @FXML
    private Button caliFirstQuestionSecondButton2;
    @FXML
    private AnchorPane anchorPaneCaliforniaFirstQuestions;
    @FXML
    private AnchorPane anchorPaneCaliforniaSecondQuestions;
    @FXML
    private AnchorPane anchorPaneCaliforniaThirdQuestions;
    @FXML
    private Label caliFirstQuestionLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCaliFirstQuestionFirstAnswerButton(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);
        
        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);
        
    }

    @FXML
    private void handleCaliFirstQuestionThirdAnswerButton(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);
        
        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);
    }

    @FXML
    private void handleCaliFirstQuestionSecondAnswerButton(ActionEvent event) {
        anchorPaneCaliforniaFirstQuestions.setDisable(true);
        anchorPaneCaliforniaFirstQuestions.setVisible(false);
        
        anchorPaneCaliforniaSecondQuestions.setDisable(false);
        anchorPaneCaliforniaSecondQuestions.setVisible(true);
    }

    
}

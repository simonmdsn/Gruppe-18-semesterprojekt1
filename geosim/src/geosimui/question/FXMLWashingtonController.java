/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui.question;

import geosimExtensions.Questions;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

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
    @FXML
    private Label incorrectLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }    
    @FXML
    private void handleWashSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        incorrectLabel.setText("Incorrect, Washington is named after former president George Washington!");
    }

    @FXML
    private void handleWashSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        incorrectLabel.setText("Incorrect, Washington is named after former president George Washington!");
    }

    @FXML
    private void handleWashSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();
        
        incorrectLabel.setText("");
    }

    @FXML
    private void handleWashThirdA(ActionEvent event) {
        incorrectLabel.setText("Incorrect, the correct answer is Seattle");
    }

    @FXML
    private void handleWashThirdB(ActionEvent event) {
        incorrectLabel.setText("Incorrect, the correct answer is Seattle");

    }

    @FXML
    private void handleWashThirdC(ActionEvent event) {
        Questions.gamepoints++;
        update();
        incorrectLabel.setText("");
    }

    @FXML
    private void handleWashFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
        
        incorrectLabel.setText("");
    }

    @FXML
    private void handleWashFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        incorrectLabel.setText("Wrong, there is about 7.4 million people in Washington");
    }

    @FXML
    private void handleWashFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        
        incorrectLabel.setText("Wrong, there is about 7.4 million people in Washington");
    }

    @Override
    public void update() {
       gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }
    
}

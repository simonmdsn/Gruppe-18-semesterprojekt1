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
    private void handleOregThirdA(ActionEvent event) {
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleOregThirdB(ActionEvent event) {
    }

    @FXML
    private void handleOregThirdC(ActionEvent event) {
    }

    @Override
    public void update() {
        gamePointsLabel.setText(Integer.toString(geosimExtensions.Questions.gamepoints));
    }

}

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
public class FXMLNevadaController implements Initializable, MethodInterface {
    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private Button nevaSecondB;
    @FXML
    private Button nevaSecondC;
    @FXML
    private Label nevaSecondQuestionLabel;
    @FXML
    private Label nevaSecondQuestion;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private Button nevaThirdA;
    @FXML
    private Button nevaThirdB;
    @FXML
    private Button nevaThirdC;
    @FXML
    private Label nevaThirdQuestionLabel;
    @FXML
    private Label nevaThirdQuestion;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private Button nevaFirstA;
    @FXML
    private Button nevaFirstB;
    @FXML
    private Button nevaFirstC;
    @FXML
    private Label nevaFirstQuestionLabel;
    @FXML
    private Label nevaFirstQuestion;
    @FXML
    private Button nevaSecondA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }    

    @FXML
    private void handleNevaSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleNevaSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleNevaSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleNevaThirdA(ActionEvent event) {
    }

    @FXML
    private void handleNevaThirdB(ActionEvent event) {
    }

    @FXML
    private void handleNevaThirdC(ActionEvent event) {
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleNevaFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleNevaFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleNevaFirstC(ActionEvent event) {
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

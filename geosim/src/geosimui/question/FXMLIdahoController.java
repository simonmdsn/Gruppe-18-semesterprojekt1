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
public class FXMLIdahoController implements Initializable, MethodInterface {
    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private Button idahSecondB;
    @FXML
    private Button idahThirdC;
    @FXML
    private Label idahThirdQuestion;
    @FXML
    private Button idahFirstA;
    @FXML
    private Button idahFirstB;
    @FXML
    private Button idahFirstC;
    @FXML
    private Label idahFirstQuestion;
    @FXML
    private Label idahThirdQuestionLabel;
    @FXML
    private Label idahFirstQuestionLabel;
    @FXML
    private Button idahSecondA;
    @FXML
    private Button idahSecondC;
    @FXML
    private Label idahSecondQuestionLabel;
    @FXML
    private Label idahSecondQuestion;
    @FXML
    private Button idahThirdA;
    @FXML
    private Button idahThirdB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }    

    @FXML
    private void handleIdahSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleIdahSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
    }

    @FXML
    private void handleIdahSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleIdahThirdA(ActionEvent event) {
    }

    @FXML
    private void handleIdahThirdB(ActionEvent event) {
    }
    
    @FXML
    private void handleIdahThirdC(ActionEvent event) {
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleIdahFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
    }

    @FXML
    private void handleIdahFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
    }

    @FXML
    private void handleIdahFirstC(ActionEvent event) {
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

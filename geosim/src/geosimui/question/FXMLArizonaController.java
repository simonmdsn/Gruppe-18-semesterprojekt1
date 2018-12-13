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
import javafx.event.Event;
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
public class FXMLArizonaController implements Initializable, MethodInterface {

    @FXML
    private Label gamePointsLabel;
    @FXML
    private GridPane gridPaneTwo;
    @FXML
    private Button arizSecondA;
    @FXML
    private Button arizSecondB;
    @FXML
    private Button arizSecondC;
    @FXML
    private Label arizSecondQuestionLabel;
    @FXML
    private Label arizSecondQuestion;
    @FXML
    private GridPane gridPaneThree;
    @FXML
    private Button arizThirdA;
    @FXML
    private Button arizThirdB;
    @FXML
    private Button arizThirdC;
    @FXML
    private Label arizThirdQuestionLabel;
    @FXML
    private Label arizThirdQuestion;
    @FXML
    private GridPane gridPaneOne;
    @FXML
    private Button arizFirstA;
    @FXML
    private Button arizFirstB;
    @FXML
    private Button arizFirstC;
    @FXML
    private Label arizFirstQuestionLabel;
    @FXML
    private Label arizFirstQuestion;
    @FXML
    private Label incorrectLabel;
    @FXML
    private GridPane gridPaneFour;
    @FXML
    private Button arizMapButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update();
    }

    @FXML
    private void handleArizSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        incorrectLabel.setText("Incorrect, the answer is Colorado River.");
    }

    @FXML
    private void handleArizSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        incorrectLabel.setText("Incorrect, the answer is Colorado River.");
    }

    @FXML
    private void handleArizSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        Questions.gamepoints++;
        update();
        incorrectLabel.setText("");
    }

    @FXML

    private void handleArizThirdA(ActionEvent event) {
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        incorrectLabel.setText("Incorrect, Phoenix is the capital of Arizona.");
        
        geosimExtensions.Questions.arizona++;
    }

    @FXML
    private void handleArizThirdB(ActionEvent event) {
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        incorrectLabel.setText("Incorrect, Phoenix is the capital of Arizona.");
        
        geosimExtensions.Questions.arizona++;
    }

    @FXML
    private void handleArizThirdC(ActionEvent event) {
        Questions.gamepoints++;
        update();
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);

        incorrectLabel.setText("");
        
        geosimExtensions.Questions.arizona++;
    }

    @FXML
    private void handleArizFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

        incorrectLabel.setText("Incorrect, Utah is north of Arizona.");

    }

    @FXML
    private void handleArizFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
        
        incorrectLabel.setText("");
    }

    @FXML
    private void handleArizFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        incorrectLabel.setText("Incorrect, Utah is north of Arizona.");
    }

    @Override
    public void update() {
        gamePointsLabel.setText("Points: "+Integer.toString(geosimExtensions.Questions.gamepoints));
    }

    @FXML
    private void handleArizMapButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLArizonaMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


        window.setScene(gameScene);
        window.show();
    }

    
}




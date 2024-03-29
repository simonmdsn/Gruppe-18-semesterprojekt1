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
    @FXML
    private Label incorrectLabel;
    @FXML
    private GridPane gridPaneFour;
    @FXML
    private Button oregMapButton;

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
        
        incorrectLabel.setText("Unfortunately, the capital of Oregon is Salem..");
    }

    @FXML
    private void handleOregFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();
        
        incorrectLabel.setText("");
    }

    @FXML
    private void handleOregFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        
        incorrectLabel.setText("Unfortunately, the capital of Oregon is Salem..");
    }

    @FXML
    private void handleOregSecondA(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        Questions.gamepoints++;
        update();
        
        incorrectLabel.setText("");

    }

    @FXML
    private void handleOregSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        incorrectLabel.setText("Incorrcet, Oregon can be divided into 6 areas!");
    }

    @FXML
    private void handleOregSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        
        incorrectLabel.setText("Incorrcet, Oregon can be divided into 6 areas!");

    }

    @FXML
    private void handleOregThirdA(ActionEvent event) {
        Questions.gamepoints++;
        update();

        incorrectLabel.setText("");
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.oregon++;
    }

    @FXML
    private void handleOregThirdB(ActionEvent event) {
        incorrectLabel.setText("Wrong, Snake River is one of the major rivers in Oregon.");
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.oregon++;
    }

    @FXML
    private void handleOregThirdC(ActionEvent event) {
        incorrectLabel.setText("Wrong, Snake River is one of the major rivers in Oregon.");
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.oregon++;
    }



    @Override
    public void update() {
        gamePointsLabel.setText("Points: "+Integer.toString(geosimExtensions.Questions.gamepoints));
    }

    @FXML
    private void handleOregMapButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLOregonMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(gameScene);
        window.show();
    }

}

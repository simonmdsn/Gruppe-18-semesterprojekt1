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
    @FXML
    private Label incorrectLabel;
    @FXML
    private GridPane gridPaneFour;
    @FXML
    private Button idahMapButton;

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

        incorrectLabel.setText("Incorrect, Idaho borders 6 states!");
    }

    @FXML
    private void handleIdahSecondB(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);

        incorrectLabel.setText("Incorrect, Idaho borders 6 states!");
    }

    @FXML
    private void handleIdahSecondC(ActionEvent event) {
        gridPaneTwo.setDisable(true);
        gridPaneTwo.setVisible(false);

        gridPaneThree.setDisable(false);
        gridPaneThree.setVisible(true);
        Questions.gamepoints++;
        update();

        incorrectLabel.setText("");
    }

    @FXML
    private void handleIdahThirdA(ActionEvent event) {
        incorrectLabel.setText("Wrooong! The largest city in Idaho is Boise!");

        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.idaho++;
    }

    @FXML
    private void handleIdahThirdB(ActionEvent event) {
        incorrectLabel.setText("Wrooong! The largest city in Idaho is Boise!");
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.idaho++;
    }

    @FXML
    private void handleIdahThirdC(ActionEvent event) {
        Questions.gamepoints++;
        update();

        incorrectLabel.setText("");
        
        gridPaneThree.setDisable(true);
        gridPaneThree.setVisible(false);

        gridPaneFour.setDisable(false);
        gridPaneFour.setVisible(true);
        
        geosimExtensions.Questions.idaho++;
    }

    @FXML
    private void handleIdahFirstA(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

        incorrectLabel.setText("Incorrect, Idaho is the 14th largest state in the US!");
    }

    @FXML
    private void handleIdahFirstB(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);
        Questions.gamepoints++;
        update();

        incorrectLabel.setText("");
    }

    @FXML
    private void handleIdahFirstC(ActionEvent event) {
        gridPaneOne.setDisable(true);
        gridPaneOne.setVisible(false);

        gridPaneTwo.setDisable(false);
        gridPaneTwo.setVisible(true);

        incorrectLabel.setText("Incorrect, Idaho is the 14th largest state in the US!");
    }

    @Override
    public void update() {
        gamePointsLabel.setText("Points: "+Integer.toString(geosimExtensions.Questions.gamepoints));
        
        
    }

    @FXML
    private void handleIdahMapButton(ActionEvent event) throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("/geosimui/map/FXMLIdahoMap.fxml"));
        Scene gameScene = new Scene(game);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(gameScene);
        window.show();
    }

}

package geosimui.map;

import geosimui.FXMLStateButtonsController;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLGameEndController {

    @FXML
    private Button returnBtn;
    
    
        @FXML
    private void handleReturnButtonAction(ActionEvent event)throws IOException {
        Parent game = FXMLLoader.load(getClass().getResource("FXMLStartMenu.fxml"));
        Scene gameScene = new Scene(game);
        gameScene.getStylesheets().add(FXMLStateButtonsController.class.getResource("mapStylesheet.css").toExternalForm());
        System.out.println(gameScene.getStylesheets());
        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


        window.setScene(gameScene);
        window.show();
    }

}

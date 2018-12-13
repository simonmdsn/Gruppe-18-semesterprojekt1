/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geosimui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import geosimExtensions.Questions;
import javafx.scene.image.Image;


public class GeosimUI extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLStartMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        
        stage.getIcons().add(new Image(GeosimUI.class.getResourceAsStream("images/AmericaMapreal.png")));
        stage.setTitle("geosim"); 
        stage.setScene(scene);
        stage.show();
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

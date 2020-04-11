package hello;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {
    
    Stage window;
    Scene scene1, scene2;
    Button btn1, btn2, btn3;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        window.setTitle("Title of the Window");
        
        // Create a label and a button for the first scene
        Label label1 = new Label("Hello FX, Welcome to the first scene!");
        btn1 = new Button("Go to Scene 2!");
        btn1.setOnAction(e -> window.setScene(scene2));
        
        // Setup Layout 1, Scene 1 - VBox (vertical column)
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, btn1);
        layout1.setAlignment(Pos.CENTER);
        scene1 = new Scene(layout1, 300, 200);
       
        // Add a button for scene 2. 
        btn2 = new Button("Go back to Scene 1!");
        btn3 = new Button("Open a new window!");
        btn2.setOnAction(eh -> window.setScene(scene1));
        btn3.setOnAction(e -> new AlertBox("Title", "In YO FACE!").display());

        // Setup Layout 2, Scene 2 - VBox
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(btn2, btn3);
        layout2.setAlignment(Pos.CENTER);
        scene2 = new Scene(layout2, 200,200);
        
        // Set the initial Scene:
        window.setScene(scene1);
        window.show();
       
    }
    
    
          
    public static void main(String[] args) {
        launch(args);
    }
    
}
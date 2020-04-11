/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author WNeill
 */
public class AlertBox {
    
    private static Stage window;
    private static String title;
    private static String message;
    private static int width; 
    private static int  height;
    
    public AlertBox(String alertTitle, String alert){
        this.title = alertTitle;
        this.message = alert;
        this.width = 200;
        this.height = 100;
    }
    
    public void display(){
        setSceneLayout();
        window.showAndWait();
    }
    
    public void setAlertTitle(String t){
        title = t;
    }
    
    public void setAlertMessage(String m){
        message = m;
    }
    
    public void setDims(int x, int y){
        width = x;
        height = y;
    }
    
    public void setSceneLayout(){
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        
        Label label = new Label(message);
        Button btn = new Button("Make me go away");
        btn.setOnAction(eh -> window.close());
        
        VBox layout = new VBox(10);
        layout.getChildren().setAll(label, btn);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, width, height);
        window.setScene(scene);
    }
    
    
}

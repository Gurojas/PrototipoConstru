/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipoconstru;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PrototipoConstru extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));
        
        double w = 150;
        double h = 100;
        int fontSize = 16; // 
        
        VBox panelCenter = new VBox(20);
        panelCenter.setAlignment(Pos.CENTER);
        Text textPanelCenter = new Text("Mapa terminal");
        textPanelCenter.setFont(new Font(20));
        
        HBox panelAnden1 = new HBox(20);
        panelAnden1.setAlignment(Pos.CENTER);
        HBox panelAnden2 = new HBox(20);
        panelAnden2.setAlignment(Pos.CENTER);
        HBox panelAnden3 = new HBox(20);
        panelAnden3.setAlignment(Pos.CENTER);
        
   
        Button anden1 = new Button("Anden 1");
        anden1.setPrefSize(w, h);
        anden1.setId("andenOcupado");
        
        Button anden2 = new Button("Anden 2");
        anden2.setPrefSize(w, h);
        anden2.setId("andenDisponible");
        
        Button anden3 = new Button("Anden 3");
        anden3.setPrefSize(w, h);
        anden3.setId("andenDisponible");
        
        Button anden4 = new Button("Anden 4");
        anden4.setPrefSize(w, h);
        anden4.setId("andenDisponible");
        
        Button anden5 = new Button("Anden 5");
        anden5.setPrefSize(w, h);
        anden5.setId("andenDisponible");
        
        Button anden6 = new Button("Anden 6");
        anden6.setPrefSize(w, h);
        anden6.setId("andenDisponible");
        
        panelAnden1.getChildren().addAll(anden1,anden2);
        panelAnden2.getChildren().addAll(anden3,anden4);
        panelAnden3.getChildren().addAll(anden5,anden6);
        
        BorderPane.setAlignment(panelCenter, Pos.CENTER);

        panelCenter.getChildren().addAll(textPanelCenter,panelAnden1,panelAnden2,panelAnden3);
        root.setCenter(panelCenter);
        
        
        VBox panelRight = new VBox(10);
        panelRight.setAlignment(Pos.CENTER);
        
        HBox panelTextoRight = new HBox(10);      
        
        Text textoNotitificacion = new Text("Notificaciones");
        
        ImageView logoNotificacion = new ImageView("/source/bell.png");
        logoNotificacion.setFitWidth(20);
        logoNotificacion.setFitHeight(20);
        
        panelTextoRight.getChildren().addAll(textoNotitificacion, logoNotificacion);
              
        ListView<String> listaNotificaciones = new ListView();

        listaNotificaciones.setPrefHeight(200);
        listaNotificaciones.setPrefWidth(200);
        
        String not1 = "Notifacion 1";
        String not2 = "Notifacion 2";
        String not3 = "Notifacion 3";
        listaNotificaciones.getItems().addAll(not1,not2,not3);
                
        panelRight.getChildren().addAll(panelTextoRight,listaNotificaciones);
        
        
        VBox panelMensaje = new VBox(10);     
        
        Text textoMensaje = new Text("Mensaje");
             
        Text textoPara = new Text("Para");
        
        TextField fieldCorreo = new TextField();
        fieldCorreo.setPromptText("lalalala@gmail.com");
        
        
        Text textoAsunto = new Text("Asunto");
        
        TextField fieldAsunto = new TextField();
        fieldAsunto.setPromptText("Asunto");
        
        TextArea areaAsunto = new TextArea();
        areaAsunto.setPromptText("Escribir asunto .............");
        areaAsunto.setPrefHeight(100);
        areaAsunto.setPrefWidth(300);
        
        Button botonEnviar = new Button("Enviar");
        Button botonCancelar = new Button("Cancelar");
        
        HBox panelBotones = new HBox(10);
        panelBotones.setAlignment(Pos.CENTER_RIGHT);
        panelBotones.getChildren().addAll(botonEnviar,botonCancelar);
        
        
        panelMensaje.getChildren().addAll(textoMensaje,textoPara,fieldCorreo,textoAsunto,fieldAsunto,areaAsunto,panelBotones);
        
        panelRight.getChildren().addAll(panelMensaje);        
        root.setRight(panelRight);
        
        
        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add("/source/estilos.css");

        primaryStage.setTitle("Ventana encargado terminal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

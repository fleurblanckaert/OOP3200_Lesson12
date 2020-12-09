package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Main extends Application {

    public static int WIDTH= 640;
    public static int HEIGHT= 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        /*primaryStage.setOpacity(0.5);
        primaryStage.setWidth(300.0);
        primaryStage.setHeight(300.0);
        primaryStage.setMaxHeight(600.0);
        primaryStage.setMaxHeight(600.0);
        primaryStage.setMinHeight(200.0);
        primaryStage.setMinHeight(200.0);
           */

        //Step 1 - Create a control
        Label helloLabel = new Label("Hello World");

        //Step 2 - Create a container
        HBox hbox = new HBox(helloLabel);


        //Scene scene = new Scene(primaryStage, WIDTH, HEIGHT);

        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

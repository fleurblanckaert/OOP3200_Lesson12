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

        //Step 1 - Create one or more control
        Label helloLabel = new Label("Hello World");
        Label goodByeLabel = new Label("Good Bye!");
        Button clickMeButton = new Button("Click me");

        //Step 1.1 - Configure controls
        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setFont(font);

        //Step 1.2 - Set the event for button control 
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");

                helloLabel.setText("Clicked!");
            }
        });

        //Step 2 - Create a container
        //HBox hbox = new HBox(helloLabel, clickMeButton);
        //VBox vbox = new VBox(helloLabel, clickMeButton);
        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);


        //Step 3 - add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        //Step 4 - add scene to stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

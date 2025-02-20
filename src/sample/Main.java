package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // ustawienie czcionki
        Font.loadFont(getClass().getResourceAsStream("DS-DIGIT.TTF"), 16);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Panel radia");
        Scene scene=new Scene(root,1175,352);
        scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.setOnHidden(e -> Controller.shutdown());
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

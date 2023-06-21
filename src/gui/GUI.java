package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sexyyyyy Blaackkk");

        // Opret knappen
        Button armonyButton = new Button("TRYK HER");
        armonyButton.setOnAction(event -> {
            // Vis billedet af Armony
            Image armonyImage = new Image("C:/Users/JohnL/OneDrive/Skrivebord/Armony.jpg");
            ImageView armonyImageView = new ImageView(armonyImage);
            StackPane pane = new StackPane(armonyImageView);
            Scene scene = new Scene(pane, 750, 750);
            primaryStage.setScene(scene);
        });

        // Opret layout og tilføj knappen
        StackPane root = new StackPane();
        root.getChildren().add(armonyButton);

        // Opret scene og vis startgrænsefladen
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

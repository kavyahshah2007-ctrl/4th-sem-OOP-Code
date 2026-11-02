import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        // Add an action to the button
        btn.setOnAction(event -> System.out.println("Hello World!"));

        // Use a layout pane to hold the button
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        
        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

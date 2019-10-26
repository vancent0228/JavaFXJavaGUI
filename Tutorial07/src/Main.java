import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tutorial07");

        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });


        button = new Button("Close Program");
        button.setOnAction(e -> {
            closeProgram();

         });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        boolean result = ConfirmBox.display("Asking", "Are you sure Want to exit?");
        if ( result ) {
            System.out.println("File is saved!");
            window.close();
        }

    }
}

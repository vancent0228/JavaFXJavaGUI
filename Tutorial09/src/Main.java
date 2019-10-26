import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Tutorial09");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        // name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel,0,0);

        //name input
        TextField nameInput = new TextField("Bucky");
        GridPane.setConstraints(nameInput,1,0);

        // Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel,0,1);

        //name input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput,1,1);

        Button btnLogin = new Button("Login");
        GridPane.setConstraints(btnLogin,1,2);

        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, btnLogin);

        Scene scene = new Scene(grid,500,500);
        window.setScene(scene);

        window.show();
    }
}

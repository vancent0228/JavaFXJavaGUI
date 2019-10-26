import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Tutorial08");

        HBox topMenu = new HBox(5);
        Button btnFile = new Button("File");
        Button btnEdit = new Button("Edit");
        Button btnView = new Button("View");
        topMenu.getChildren().addAll(btnFile, btnEdit, btnView);
        //topMenu.setAlignment(Pos.CENTER);

        VBox leftMenu = new VBox();
        Button btnD = new Button("D");
        Button btnE = new Button("E");
        Button btnF = new Button("F");
        leftMenu.getChildren().addAll(btnD,btnE,btnF);
        //leftMenu.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();

    }
}

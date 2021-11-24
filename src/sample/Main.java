package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author jerome
 */
public class Main extends Application {

    private Parent createContent(){
        return new StackPane(new Text("Code Book"));
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("MyCodeBook");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
        primaryStage.setTitle("MyCodeBook");
        primaryStage.setScene(new Scene(createContent(),300,300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

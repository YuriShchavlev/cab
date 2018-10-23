package cap;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args)

    {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = FXMLLoader.load(
                getClass().getResource("/cap/Main.fxml"));


                /*new VBox();
       // Button btn =new Button("OK");
        Label lbl=new Label("It's JavaFX!");
        TextField txt =new TextField();

       *//* btn.setOnAction(event -> {
           lbl.setText("Hello, "+txt.getText()+" !");
        });*//*

       lbl.textProperty().bind(
               Bindings.concat("Hello, ",txt.textProperty()," !"));

        root.getChildren().addAll(lbl,txt);*/


        Scene scene =new Scene(root,500,300);

        primaryStage.setTitle("Cows and bulls");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

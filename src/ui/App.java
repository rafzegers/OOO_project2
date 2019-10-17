package ui;

import domain.Caesar;
import domain.Context;
import domain.Spiegel;
import domain.Strategy;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage){
        final Button VertaalKnop;

        VBox root = new VBox();
        Scene scene = new Scene(root, 300, 250);


        VertaalKnop = new Button("Encrypteer");


        Label tekstlabel = new Label("Geef de tekst");
        TextField tekst = new TextField();


        root.getChildren().add(tekstlabel);
        root.getChildren().add(tekst);

        TextField resultaatvak = new TextField();

        final ObservableList<Strategy> items =
                FXCollections.observableArrayList(
                        new Caesar(),
                        new Spiegel());
        final ComboBox keuzevak = new ComboBox(items);

        root.getChildren().add(keuzevak);
        root.getChildren().add(VertaalKnop);
        root.getChildren().add(resultaatvak);

        VertaalKnop.setOnAction(eventIngaveInvoer -> {
            Context context = new Context(tekst.getText());
            context.setStrategy((Strategy)keuzevak.getValue());
            resultaatvak.setText(context.encrypteer());
        });


        primaryStage.setScene(scene);
        primaryStage.setTitle("VertaalApp");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

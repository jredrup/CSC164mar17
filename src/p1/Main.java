package p1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

     public void start (Stage primaryStage) throws Exception{
         BorderPane pane = new BorderPane();
         pane.setTop(getHBox());
         pane.setLeft(getVBox());
         /*pane.setTop (new CustomPane("Top"));
         pane.setBottom (new CustomPane("Bottom"));
         pane.setLeft (new CustomPane("Left"));
         pane.setCenter (new CustomPane("Center"));
         pane.setRight (new CustomPane("Right"));*/

         Scene scene = new Scene(pane);
         primaryStage.setScene (scene);
         primaryStage.setTitle("Hbox project");
         primaryStage.show();
    }

    private VBox getVBox() {
        VBox vbox = new VBox(15);
        vbox.setPadding(new Insets (15, 5, 5, 5));
        vbox.setStyle("-fx-background-color: green");
        vbox.getChildren().add (new Label ("Courses"));
        Label[] courses = {new Label ("CSC 114"), new Label ("CSC 164"), new Label ("CSC 214")};
        for (Label each: courses){
            VBox.setMargin(each, new Insets (0, 0, 0, 15));
            vbox.getChildren().add(each);
        }
        return vbox;
    }

    private HBox getHBox() {
        HBox hbox = new HBox(15);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setStyle("-fx-background-color: gold");
        hbox.getChildren().addAll(new Label("Pick a Button"), new Button ("one"), new Button ("two"), new Button ("three"));
        return hbox;
    }


}


/*class CustomPane extends StackPane {
    public CustomPane (String title){
        getChildren().add(new Label(title));
        setStyle ("-fx-border-color: red");
        setPadding(new Insets(10,10,10,10));

    }
}*/
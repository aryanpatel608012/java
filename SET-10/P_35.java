import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        HBox h = new HBox(10);

        Rectangle r1 = new Rectangle(50, 100, Color.RED);
        Rectangle r2 = new Rectangle(50, 50, Color.BLUE);
        Rectangle r3 = new Rectangle(50, 150, Color.GREEN);
        Rectangle r4 = new Rectangle(50, 200, Color.ORANGE);

        h.getChildren().addAll(r1, r2, r3, r4);

        stage.setScene(new Scene(h, 400, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

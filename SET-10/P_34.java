import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        GridPane gp = new GridPane();

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();
        Button btn = new Button("Submit");

        gp.add(new Label("Roll"), 0, 0);
        gp.add(roll, 1, 0);
        gp.add(new Label("Name"), 0, 1);
        gp.add(name, 1, 1);
        gp.add(new Label("Age"), 0, 2);
        gp.add(age, 1, 2);
        gp.add(new Label("Email"), 0, 3);
        gp.add(email, 1, 3);
        gp.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                Integer.parseInt(roll.getText());
                Integer.parseInt(age.getText());

                if (!email.getText().contains("@") || !email.getText().contains(".")) {
                    throw new Exception("Invalid Email");
                }

                Alert a = new Alert(Alert.AlertType.INFORMATION, "Success!");
                a.show();

            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        stage.setScene(new Scene(gp, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

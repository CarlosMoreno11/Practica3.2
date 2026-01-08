package smartHome;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        SmartLightControl light = new SmartLightControl();

        light.addEventHandler(CambioLuz.LUZ_CAMBIADA, event -> {
            System.out.println("La intensidad de la SmartHome ha cambiado a: " + event.getIntensity());
        });

        VBox root = new VBox(light);
        root.setStyle("-fx-alignment: center; -fx-padding: 50; -fx-background-color: #1a1a1a;");
        
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.setTitle("Smart Home Control");
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
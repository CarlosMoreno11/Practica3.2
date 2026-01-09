package smartHome;
import org.testfx.framework.junit5.ApplicationTest;
import org.junit.jupiter.api.Test;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartLightControlTest extends ApplicationTest {
    private SmartLightControl light;

    @Override
    public void start(Stage stage) {
        light = new SmartLightControl();
        stage.setScene(new Scene(new StackPane(light), 200, 200));
        stage.show();
    }

    @Test
    void testLogic() {
        light.setIntensity(1.0);
        assertEquals(1.0, light.getIntensity()); 
    }

    @Test
    void testInteraction() {
        clickOn(light);
        assertEquals(1.0, light.getIntensity()); 
    }
}
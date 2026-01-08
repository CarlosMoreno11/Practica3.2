package smartHome;

import javafx.animation.FillTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class SmartLightControl extends StackPane {
    private final DoubleProperty intensity = new SimpleDoubleProperty(0.0);

    public SmartLightControl() {
        Circle circle = new Circle(60, Color.web("#333333")); 
        getChildren().add(circle);

        this.setOnMouseClicked(e -> {
            double newIntensity = (intensity.get() == 0.0) ? 1.0 : 0.0;
            intensity.set(newIntensity);

            Color targetColor = (newIntensity > 0) ? Color.web("#FFD700") : Color.web("#333333");

            FillTransition ft = new FillTransition(Duration.millis(400), circle);
            ft.setToValue(targetColor);
            ft.play();

            fireEvent(new CambioLuz(newIntensity));
        });
    }

    public double getIntensity() { return intensity.get(); }
    public void setIntensity(double value) { intensity.set(value); }
    public DoubleProperty intensityProperty() { return intensity; }
}
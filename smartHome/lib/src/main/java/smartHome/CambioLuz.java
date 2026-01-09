package smartHome;

import javafx.event.Event;
import javafx.event.EventType;

public class CambioLuz extends Event {
    public static final EventType<CambioLuz> LUZ_CAMBIADA = new EventType<>(ANY, "LUZ_CAMBIADA");

    private final double intensity;

    public CambioLuz(double intensity) {
        super(LUZ_CAMBIADA);
        this.intensity = intensity;
    }

    public double getIntensity() { return intensity; }
}
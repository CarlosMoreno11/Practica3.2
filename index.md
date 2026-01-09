# SmartLightControl - Componente Smart Home

Bienvenido a la documentación oficial de SmartLightControl, un componente futurista diseñado para el control de iluminación en entornos domóticos.

## Instalación
Para utilizar este componente en tu proyecto JavaFX, añade el archivo `.jar` de la última release a tus dependencias de proyecto o utiliza Gradle:
```gradle
dependencies {
    implementation files('libs/SmartLightControl-1.0.jar')
}
``` 

## Uso del Componente
Es muy sencillo de implementar. Aquí tienes un ejemplo rápido:
```java
SmartLightControl light = new SmartLightControl();
light.addEventHandler(LightChangeEvent.LIGHT_CHANGED, e -> {
    System.out.println("Nueva intensidad: " + e.getIntensity());
});
``` 

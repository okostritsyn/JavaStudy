package main.java.patterns.builder.builders;

import main.java.patterns.builder.cars.CarType;
import main.java.patterns.builder.components.Engine;
import main.java.patterns.builder.components.GPSNavigator;
import main.java.patterns.builder.components.Transmission;
import main.java.patterns.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
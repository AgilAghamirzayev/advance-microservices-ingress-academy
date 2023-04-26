package creation.builders.refactoring_guru.builders;

import creation.builders.refactoring_guru.car.CarType;
import creation.builders.refactoring_guru.components.Engine;
import creation.builders.refactoring_guru.components.GPSNavigator;
import creation.builders.refactoring_guru.components.Transmission;
import creation.builders.refactoring_guru.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

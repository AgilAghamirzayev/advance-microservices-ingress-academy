package creation.builders.guru.builders;

import creation.builders.guru.car.CarType;
import creation.builders.guru.components.Engine;
import creation.builders.guru.components.GPSNavigator;
import creation.builders.guru.components.Transmission;
import creation.builders.guru.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

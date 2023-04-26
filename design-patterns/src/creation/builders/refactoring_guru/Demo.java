package creation.builders.refactoring_guru;

import creation.builders.refactoring_guru.builders.CarBuilder;
import creation.builders.refactoring_guru.builders.CarManualBuilder;
import creation.builders.refactoring_guru.car.Car;
import creation.builders.refactoring_guru.car.Manual;
import creation.builders.refactoring_guru.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
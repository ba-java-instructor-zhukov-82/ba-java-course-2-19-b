package ood.tasks.coupling;

import ood.tasks.coupling.cars.Car;
import ood.tasks.coupling.cars.EngineBuilder;

public class CouplingTaskMain {

    public static void main(String[] args) {
        EngineBuilder builder = new EngineBuilder()
                                    .setSerial(12345L)
                                    .setCapacity(1.6f)
                                    .setCylinders(4);
        Car car = new Car("626", builder);
        System.out.println(car);
    }
}

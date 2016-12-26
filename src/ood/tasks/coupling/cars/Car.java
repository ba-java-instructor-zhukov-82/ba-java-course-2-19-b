package ood.tasks.coupling.cars;

public class Car {

    private String model;
    private Engine engine;

    public Car(String model, EngineBuilder builder) {
        this.model = model;
        this.engine = builder.build();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

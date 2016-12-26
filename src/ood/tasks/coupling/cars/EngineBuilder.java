package ood.tasks.coupling.cars;

public class EngineBuilder {

    private static EngineBuilder builder = new EngineBuilder();
    private Engine engine;

    public EngineBuilder() {
        engine = new Engine();
    }

    public EngineBuilder setSerial(long serial) {
        builder.engine.setSerial(serial);
        return builder;
    }

    public EngineBuilder setCapacity(float capacity) {
        builder.engine.setCapacity(capacity);
        return builder;
    }

    public EngineBuilder setCylinders(int cylinders) {
        builder.engine.setCylinders(cylinders);
        return builder;
    }

    public Engine build() {
        return builder.engine;
    }
}

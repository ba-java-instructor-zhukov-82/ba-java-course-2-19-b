package ood.tasks.coupling.cars;

class Engine {

    private long serial;
    private float capacity;
    private int cylinders;

    long getSerial() {
        return serial;
    }

    void setSerial(long serial) {
        this.serial = serial;
    }

    float getCapacity() {
        return capacity;
    }

    void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    int getCylinders() {
        return cylinders;
    }

    void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    Engine() {
    }

    Engine(long serial, float capacity, int cylinders) {
        this.serial = serial;
        this.capacity = capacity;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "serial=" + serial +
                ", capacity=" + capacity +
                ", cylinders=" + cylinders +
                '}';
    }
}

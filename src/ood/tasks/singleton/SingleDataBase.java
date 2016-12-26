package ood.tasks.singleton;

public class SingleDataBase {

    private static SingleDataBaseBuilder builder;

    private SingleDataBase() {
    }

    public static SingleDataBase getInstance() {
        if (builder == null)
            builder = new SingleDataBaseBuilder();
        synchronized (builder) {
            if (builder.instance == null) {
                builder.instance = new SingleDataBase();
                System.out.println("Single DataBase created successfully!");
            }
        }
        return builder.instance;
    }

    public synchronized void connect() {
        System.out.println("Successfully connected to Single DataBase!");
    }

    private static class SingleDataBaseBuilder {

        SingleDataBase instance;
    }
}

package ood.tasks.singleton;

public class FixedManagersState {

    private static final int NUMBER_OF_MANAGERS = 3;
    private static FixedManagersStateBuilder builder;

    private String name;

    private FixedManagersState(String name) {
        this.name = name;
    }

    public static FixedManagersState getInstance(ManagerId id) {
        if(builder == null)
            builder = new FixedManagersStateBuilder();
        synchronized (builder) {
            if(builder.instances == null) {
                builder.instances = new FixedManagersState[NUMBER_OF_MANAGERS];
                for(int i = 0; i < builder.instances.length; ++i)
                    builder.instances[i] = new FixedManagersState("manager #" + (i + 1));
                System.out.println("Managers are available now!");
            }
        }
        return builder.instances[id.getId()];
    }

    @Override
    public String toString() {
        return name;
    }

    private static class FixedManagersStateBuilder {

        FixedManagersState[] instances;
    }

    public enum ManagerId {
        FIRST(0), SECOND(1), THIRD(2);

        private int id;

        public int getId() {
            return id;
        }

        private ManagerId(int id) {
            this.id = id;
        }
    }
}

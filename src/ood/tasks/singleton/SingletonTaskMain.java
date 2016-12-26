package ood.tasks.singleton;

import static ood.tasks.singleton.FixedManagersState.ManagerId.*;

public class SingletonTaskMain {

    public static void main(String[] args) {
        //dataBaseTest();
        fixedManagersStateTest();
    }

    private static void dataBaseTest() {
        SingleDataBase dataBase1 = SingleDataBase.getInstance();
        dataBase1.connect();

        SingleDataBase dataBase2 = SingleDataBase.getInstance();
        dataBase2.connect();

        System.out.format("%d == %d is %s%n",
                dataBase1.hashCode(), dataBase2.hashCode(),
                dataBase1.hashCode() == dataBase2.hashCode());
    }

    private static void fixedManagersStateTest() {
        FixedManagersState first = FixedManagersState.getInstance(FIRST);
        System.out.println(first);
        FixedManagersState second = FixedManagersState.getInstance(SECOND);
        System.out.println(second);
        FixedManagersState third = FixedManagersState.getInstance(THIRD);
        System.out.println(third);
    }
}

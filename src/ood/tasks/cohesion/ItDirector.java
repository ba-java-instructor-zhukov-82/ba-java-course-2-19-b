package ood.tasks.cohesion;

public class ItDirector implements Encryptor {
    @Override
    public void countSalary() {

        System.out.format("%s: Salary counted!%n", getClass().getSimpleName());
    }

    @Override
    public void encrypt() {

        System.out.format("%s: Documents encrypted!%n", getClass().getSimpleName());
    }
}

package ood.tasks.cohesion;

public class TransportDirector implements Manager {
    @Override
    public void countSalary() {

        System.out.format("%s: Salary counted!%n", getClass().getSimpleName());
    }
}

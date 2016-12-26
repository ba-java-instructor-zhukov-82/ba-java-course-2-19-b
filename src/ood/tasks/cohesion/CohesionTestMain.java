package ood.tasks.cohesion;

public class CohesionTestMain {

    public static void main(String[] args) {
        Manager transporter = new TransportDirector();
        Encryptor encryptor1 = new ItDirector();
        Encryptor encryptor2 = new ItDirector();

        System.out.println("\n\tManager TEST:\n");

        for(Manager manager : new Manager[] { transporter, encryptor1 })
            manager.countSalary();

        System.out.println("\n\tEncryptor TEST:\n");

        for(Encryptor encryptor : new Encryptor[] { encryptor1, encryptor2 }) {
            encryptor.countSalary();
            encryptor.encrypt();
        }
    }
}

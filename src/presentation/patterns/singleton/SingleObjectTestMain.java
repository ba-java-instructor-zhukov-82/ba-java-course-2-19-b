package presentation.patterns.singleton;

public class SingleObjectTestMain {

    public static void main(String[] args) {

        //illegal construct
        //SingleObject obj = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}

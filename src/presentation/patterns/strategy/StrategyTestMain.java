package presentation.patterns.strategy;

public class StrategyTestMain {

    public static void main(String[] args) {
        Context context = new Context();
        context.setContext(new AddOperation());
        System.out.println("33 + 22 = " + context.executeStrategy(33, 22));
        context.setContext(new SubOperation());
        System.out.println("33 - 22 = " + context.executeStrategy(33, 22));
        context.setContext(new MultOperation());
        System.out.println("33 * 22 = " + context.executeStrategy(33, 22));
    }
}

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("10 + 5 = " + addition.operation(10, 5));
        System.out.println("10 * 5 = " + multiplication.operation(10, 5));
    }
}

interface Calculator{
    double add(double a,double b);
    double sub(double a,double b);
    double mul(double a,double b);
    double div(double a,double b);
}
class DemoCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}

public class interfacecalculator {
    public static void main(String[] args) {
        DemoCalculator calculator = new DemoCalculator();
        System.out.println();
        double sum = calculator.add(5, 3);
        double difference = calculator.sub(5, 3);
        double product = calculator.mul(5, 3);
        double quotient = calculator.div(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }
}

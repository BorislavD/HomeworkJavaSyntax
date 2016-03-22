import java.util.Scanner;

public class Problem4CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double resultBaseOne = (a*a + b*b) / (a*a - b*b);
        double powerOne = (a+b+c) / Math.sqrt(c);
        double resultBaseTwo = a*a + b*b - c*c*c;
        double powerTwo = a - b;
        double resultOne = Math.pow(resultBaseOne, powerOne);
        double resultTwo = Math.pow(resultBaseTwo, powerTwo);
        double averageABC = (a+b+c)/3;
        double averageResults = (resultOne + resultTwo) / 2;
        double difference = Math.abs(averageABC - averageResults);
        System.out.printf("F1 result: %.2f; F1 result: %.2f; Diff: %.2f", resultOne, resultTwo, difference);
    }
}

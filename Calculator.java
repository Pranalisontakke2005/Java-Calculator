import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator App");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.printf("Sum: %.2f\n", sum);

        double difference = num1 - num2;
        System.out.printf("Difference: %.2f\n", difference);

        double product = num1 * num2;
        System.out.printf("Product: %.2f\n", product);

        double quotient = num1/num2;
        System.out.printf("Quotient: %.2f\n", quotient);



    }
}

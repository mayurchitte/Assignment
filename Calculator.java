





import java.util.Scanner;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input 1st Number: ");
        double num1 = scanner.nextDouble();

        
        System.out.print("Input 2nd Number: ");
        double num2 = scanner.nextDouble();

        
        System.out.print("Enter the operation to be performed (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is undefined.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator");
            return; 
        }

        System.out.println("Result: " + num1 + operator + num2 + " = " + result);
    }
}





  
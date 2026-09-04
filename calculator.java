import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java Calculator");
        System.out.println("Enter q at any prompt to quit.");

        while (true) {
            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                if (scanner.next().equalsIgnoreCase("q")) {
                    break;
                }
                System.out.println("Please enter a valid number.");
                continue;
            }
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = scanner.next();
            if (operator.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                if (scanner.next().equalsIgnoreCase("q")) {
                    break;
                }
                System.out.println("Please enter a valid number.");
                continue;
            }
            double secondNumber = scanner.nextDouble();
            double result;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Unknown operator. Use +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}

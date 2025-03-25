import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.print("Enter the first operand: ");
            double operand1 = scanner.nextDouble();

            System.out.print("Enter the second operand: ");
            double operand2 = scanner.nextDouble();

             System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Takeaway");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Enter your choice (1/2/3/4): ");

            int choice = scanner.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result  = operand1 + operand2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = operand1 - operand2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = operand1 * operand2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (operand2 == 0) {
                        System.out.println("Error:Division by zero");
                    } else {
                        result = operand1 / operand2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next();

            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;

            }
        }

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}


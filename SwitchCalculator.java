import java.util.Scanner;

public class SwitchCalculator {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Calculator \n a. Addition \n b. Subtraction \n c. Multiplication \n d. Division\n\n Enter choice:");
        char ch = sc.next().charAt(0);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int result = 0;
        switch (ch) {
            case 'a':
                result = addition(a, b);
                break;
            case 'b':
                result = subtraction(a, b);
                break;
            case 'c':
                result = multiplication(a, b);
                break;
            case 'd':
                result = division(a, b);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                return; // Exit the program as the choice was invalid.
        }

        System.out.println("The result is: " + result);
    }
}

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Print result
        System.out.println("The sum is: " + sum);

        // Close Scanner
        sc.close();
    }
}

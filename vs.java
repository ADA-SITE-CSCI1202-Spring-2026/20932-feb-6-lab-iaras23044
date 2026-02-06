public class Calc {
    public static void main(String[] args) {
        // Ensure two arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java Calc <num1> <num2>");
            return;
        }

        // Parse integers from command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform operations
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;       // integer division
        int remainder = num1 % num2;      // remainder

        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Integer Division: " + division);
        System.out.println("Remainder: " + remainder);
    }
}

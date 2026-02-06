import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        // Calculate nth harmonic number
        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        // Print result
        System.out.println("The " + n + "th harmonic number is: " + harmonic);

        sc.close();
    }
}

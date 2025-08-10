import java.util.Scanner;

public class class06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);

        input.close();
    }
}

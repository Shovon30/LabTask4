import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Calculating sum
        double sum = num1 + num2;

        // Printing result
        System.out.println("The sum is: " + sum);

        input.close();
    }
}

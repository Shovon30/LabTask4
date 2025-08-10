import java.util.Scanner;

public class class05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking string input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Printing reversed string
        System.out.println("Reversed string: " + reversed);

        input.close();
    }
}

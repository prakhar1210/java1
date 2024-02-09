import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Uncomment this block if you want to perform arithmetic operations
        /*
         * int a = 20;
         * int b = 15;
         * int sum = a + b;
         * int multiply = a * b;
         * double div = (double) a / b; // Casting one operand to double for correct
         * division result
         * System.out.println("sum = " + sum);
         * System.out.println(multiply);
         * System.out.println(div);
         */

        // Uncomment this block if you want to print numbers from 1 to a
        /*
         * int a = 10;
         * for (int i = 1; i <= a; i++) {
         * System.out.print(i);
         * }
         */

        // Taking input in Java from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the name input
        String name = scanner.nextLine();

        // Print the entered name
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}

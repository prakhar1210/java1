import java.util.Scanner;

public class IfElse {
    // if-else, else-if, break and switch stmts.
    public static void main(String[] args) {
        // int a = 5;
        // int b = 4;
        // if (a > b) {
        // System.out.println("a is elder");
        // } else {
        // System.out.println("b is elder");
        // }
        // Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("User is Adult");
        // } else {
        // System.out.println("User is Minor");
        // }

        // sc.close();
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("User is Adult");
            } else {
                System.out.println("User is Minor");
            }
        } else {
            System.out.println("Please enter a valid integer for age.");
        }

        sc.close();
    }
}

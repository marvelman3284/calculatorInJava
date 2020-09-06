/*
Math operands like addition, subtraction, multiplication, and division
 */

package Calculator;
import java.util.Scanner;

public class BasicMath {
    public static void add() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to add? ");
        int num1 = sc.nextInt();

        // Asking for the second addend
        System.out.println("What is the second number you would like to add? ");
        int num2 = sc.nextInt();

        int solution = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + solution);
    }

    public static void subtract() {
        // Initializing  Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to subtract? ");
        int num1 = sc.nextInt();

        // Asking for the second addend
        System.out.println("What is the second number you would like to subtract? ");
        int num2 = sc.nextInt();

        int solution = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + solution);
    }

    public static void multiply() {
        // Initializing  Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to multiply? ");
        int num1 = sc.nextInt();

        // Asking for the second addend
        System.out.println("What is the second number you would like to multiply? ");
        int num2 = sc.nextInt();

        int solution = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + solution);
    }

    public static void divide() {
        // Initializing  Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to divide? ");
        int num1 = sc.nextInt();

        // Asking for the second addend
        System.out.println("What is the second number you would like to divide? ");
        int num2 = sc.nextInt();

        int solution = num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + solution);
    }
}

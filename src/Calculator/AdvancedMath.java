package Calculator;
import java.lang.Math;
import java.util.Scanner;

public class AdvancedMath {
    public static void AbsoluteValue() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What number would you like to find the absolute value of? ");
        int num1 = sc.nextInt();

        int solution = Math.abs(num1);

        System.out.println("|" + num1 + "|" + " = "  + solution);
    }

    public static void AbsoluteValueAdd() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to add to before finding the absolute value? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number you would like to add to before finding the absolute value? ");
        int num2 = sc.nextInt();

        int solution = Math.abs(num1 + num2);

        System.out.println("|" + num1 + " + " + num2 + "|" + " = "  + solution);
    }

    public static void AbsoluteValueSub() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to subtract to before finding the absolute value? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number you would like to subtract to before finding the absolute value? ");
        int num2 = sc.nextInt();

        int solution = Math.abs(num1 - num2);

        System.out.println("|" + num1 + " - " + num2 + "|" + " = "  + solution);
    }

    public static void AbsoluteValueMul() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to multiply to before finding the absolute value? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number you would like to multiply to before finding the absolute value? ");
        int num2 = sc.nextInt();

        int solution = Math.abs(num1 * num2);

        System.out.println("|" + num1 + " * " + num2 + "|" + " = "  + solution);
    }

    public static void AbsoluteValueDiv() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to divide to before finding the absolute value? ");
        int num1 = sc.nextInt();

        System.out.println("What is the second number you would like to divide to before finding the absolute value? ");
        int num2 = sc.nextInt();

        int solution = Math.abs(num1 / num2);

        System.out.println("|" + num1 + " / " + num2 + "|" + " = " + solution);
    }

    public static void Pow() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is the first number you would like to square? ");
        int num1 = sc.nextInt();


        double solution = Math.pow(num1, 2);

        System.out.println(num1 + " to the second power is " + solution);
    }

    public static void Sqrt() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What number would you like to find the square root of? ");
        int num1 = sc.nextInt();


        double solution = Math.sqrt(num1);

        System.out.println("The square root of " + num1 + " is " + solution);
    }


}

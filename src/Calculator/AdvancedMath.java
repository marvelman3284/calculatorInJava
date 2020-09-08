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

        System.out.println("The sqaure root of " + num1 + " is " + solution);

    }

    public static void Exponent() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is your base? ");
        int num1 = sc.nextInt();

        System.out.println("What is your power? ");
        int num2 = sc.nextInt();

        double solution = Math.pow(num1, num2);

        System.out.println(num1 + " to the" +  num2 + " power is " + solution);
    }

    public static void distance() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is x of 1? ");
        int num1 = sc.nextInt();

        System.out.println("What y of 1? ");
        int num2 = sc.nextInt();

        System.out.println("What x of 2? ");
        int num3 = sc.nextInt();

        System.out.println("What y of 2? ");
        int num4 = sc.nextInt();

        // sqrt(x1 -x2)^2 + (y2-y1)^2
        double solutionX = num3 - num1;
        double solutionY = num4 - num2;
        double solutionX2 = Math.pow(solutionX, 2);
        double solutionY2 = Math.pow(solutionY, 2);
        double solutionXY = solutionX2 + solutionY2;
        double solution = Math.sqrt(solutionXY);

        System.out.println("The distance between Point A(" + num1 + "," + num2 + ") and Point B(" + num3 + "," + num4 + ") is " + solution);
    }

    public static void midpoint() {
        // Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for the first addend
        System.out.println("What is x of 1? ");
        int num1 = sc.nextInt();

        System.out.println("What y of 1? ");
        int num2 = sc.nextInt();

        System.out.println("What x of 2? ");
        int num3 = sc.nextInt();

        System.out.println("What y of 2? ");
        int num4 = sc.nextInt();

        // sqrt(x1 -x2)^2 + (y2-y1)^2
        double solutionX = num3 + num1;
        double Xsolution = solutionX /2;
        double solutionY = num4 - num2;
        double Ysolution = solutionY / 2;

        System.out.println("The midpoint of Point A(" + num1 + "," + num2 + ") and Point B(" + num3 + "," + num4 + ") is Point(" + Xsolution + "," + Ysolution + ")");
    }



}

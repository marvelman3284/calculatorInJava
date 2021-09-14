package Calculator;
import java.lang.Math;
import java.util.Scanner;
import java.util.*;

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
    // ax^2 + bx + c = 0
    public static void Quadratic() {


        //Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for a
        System.out.println("What is 'a': ");
        float a = sc.nextInt();

        // Asking for b
        System.out.println("What is b: ");
        float b = sc.nextInt();

        // Asking for c
        System.out.println("What is 'c': ");
        float c = sc.nextInt();

        double quad = Math.sqrt(Math.pow(b, 2) - (4*a*c));
        System.out.println(quad);
        double quad_0 = -b + quad;
        double quad_1 = -b - quad;
        double quad_2 = quad_0 / (2*a);
        double quad_3 = quad_1 / (2*a);
        System.out.println("The exact answers are: " + quad_2 + " and " + quad_3);
    }

    public static void Quadratic_graph() {
        //Initializing List
        List<String> cords = new ArrayList<>();

        //Initializing Scanner
        Scanner sc = new Scanner(System.in);

        // Asking for a
        System.out.println("What is 'a': ");
        float a = sc.nextInt();

        // Asking for b
        System.out.println("What is b: ");
        float b = sc.nextInt();

        // Asking for c
        System.out.println("What is 'c': ");
        float c = sc.nextInt();

        for (float i=-10; i<=10; i++) {
            double y = Math.pow((a*i),2) + (b*i) + c;
            String x = Float.toString(i);
            String str_y = Double.toString(y);
            String pair = "(" + x + ", " + str_y + ")";
            cords.add(pair);
        }
        for (String s : cords){
            System.out.println(s + "\n");
        }
    }
}

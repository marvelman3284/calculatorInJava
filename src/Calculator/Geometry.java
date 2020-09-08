package Calculator;

import java.util.Scanner;
import java.math.*;

public class Geometry {
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
        double solutionY = num4 + num2;
        double Ysolution = solutionY / 2;

        System.out.println("The midpoint of Point A(" + num1 + "," + num2 + ") and Point B(" + num3 + "," + num4 + ") is Point(" + Xsolution + "," + Ysolution + ")");
    }

    public static void slope() {
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

        // y2-y1/x2-x1
        double solutionX = num3 - num1;
        double solutionY = num4 - num2;
        double slope = solutionY / solutionX;

        System.out.println("The slope of the line with Point A(" + num1 + "," + num2 + ") and Point B(" + num3 + "," + num4 + ") is a slope of " + slope);
    }
}

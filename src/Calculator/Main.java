package Calculator;
import java.util.Scanner;

public class Main {

    // color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_ORANGE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(ANSI_ORANGE + "What would you like to do?" + ANSI_RESET + ANSI_CYAN + "\n1.Add"  + ANSI_RESET + ANSI_RED + "\n2.Subtract"  + ANSI_RESET + ANSI_GREEN + "\n3.Multiply"  + ANSI_RESET + ANSI_YELLOW + "\n4.Divide"  + ANSI_RESET + ANSI_PURPLE + "\n5.Absolute Value"  + ANSI_RESET + ANSI_CYAN + "\n6.Addition then Absolute Value"  + ANSI_RESET + ANSI_WHITE + "\n7.Subtraction then Absolute Value"  + ANSI_RESET + ANSI_ORANGE + "\n8.Multiplication then Absolute Value"  + ANSI_RESET + ANSI_YELLOW + "\n9.Division then Absolute Value" + ANSI_RESET + ANSI_RED + "\n10.Squaring" + ANSI_RESET + ANSI_GREEN + "\n11.Square Root" + ANSI_RESET + ANSI_YELLOW + "\n12.Exponents" + ANSI_RESET + ANSI_ORANGE + "\n13.Distance between two Points" + ANSI_RESET + ANSI_PURPLE + "\n14.Midpoint between two points" + ANSI_RESET + ANSI_CYAN + "\n15.Slope" + ANSI_RESET + ANSI_GREEN + "\n16.Quadratic" + ANSI_RESET + ANSI_YELLOW + "\n17.Quadratic Graph");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> BasicMath.add();
            case 2 -> BasicMath.subtract();
            case 3 -> BasicMath.multiply();
            case 4 -> BasicMath.divide();
            case 5 -> AdvancedMath.AbsoluteValue();
            case 6 -> AdvancedMath.AbsoluteValueAdd();
            case 7 -> AdvancedMath.AbsoluteValueSub();
            case 8 -> AdvancedMath.AbsoluteValueMul();
            case 9 -> AdvancedMath.AbsoluteValueDiv();
            case 10 -> AdvancedMath.Pow();
            case 11 -> AdvancedMath.Sqrt();
            case 12 -> AdvancedMath.Exponent();
            case 13 -> Geometry.distance();
            case 14 -> Geometry.midpoint();
            case 15 -> Geometry.slope();
            case 16 -> AdvancedMath.Quadratic();
            case 17 -> AdvancedMath.Quadratic_graph();
        }
    }
}

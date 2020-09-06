package Calculator;
import java.util.Scanner;

public class Main {
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
	// write your code here


        Scanner sc = new Scanner(System.in);

        System.out.println(ANSI_ORANGE + "What would you like to do?" + ANSI_RESET + ANSI_BLACK + "\n1.Add"  + ANSI_RESET + ANSI_RED + "\n2.Subtract"  + ANSI_RESET + ANSI_GREEN + "\n3.Multiply"  + ANSI_RESET + ANSI_YELLOW + "\n4.Divide"  + ANSI_RESET + ANSI_PURPLE + "\n5.Absolute Value"  + ANSI_RESET + ANSI_CYAN + "\n6.Addition then Absolute Value"  + ANSI_RESET + ANSI_WHITE + "\n7.Subtraction then Absolute Value"  + ANSI_RESET + ANSI_ORANGE + "\n8.Multiplication then Absolute Value"  + ANSI_RESET + ANSI_BLACK + "\n9.Division then Absolute Value" + ANSI_RESET + ANSI_RED + "\n10.Squaring" + ANSI_RESET + ANSI_GREEN + "\n11.Square Root" + ANSI_RESET + ANSI_YELLOW + "\n.12.Exponents");
        int choice = sc.nextInt();

        if (choice == 1) {
            BasicMath.add();
        } else if (choice == 2) {
            BasicMath.subtract();
        } else if (choice == 3) {
            BasicMath.multiply();
        } else if (choice == 4) {
            BasicMath.divide();
        } else if (choice == 5) {
            AdvancedMath.AbsoluteValue();
        } else if (choice == 6) {
            AdvancedMath.AbsoluteValueAdd();
        } else if (choice == 7) {
            AdvancedMath.AbsoluteValueSub();
        } else if (choice == 8) {
            AdvancedMath.AbsoluteValueMul();
        } else if (choice == 9) {
            AdvancedMath.AbsoluteValueDiv();
        } else if (choice == 10) {
            AdvancedMath.Pow();
        } else if (choice == 11) {
            AdvancedMath.Sqrt();
        } else if (choice == 12) {

        }


    }
}

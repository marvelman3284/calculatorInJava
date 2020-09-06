package Calculator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What would you like to do? \n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            BasicMath.add();
        } else if (choice == 2) {
            BasicMath.subtract();
        } else if (choice == 3) {
            BasicMath.multiply();
        } else if (choice == 4) {
            BasicMath.divide();
        }

    }
}

package Day1Assign;
import java.util.Scanner;
//    Swap two number with and without using third variable. 

public class Q1Swapnumbers {
	
	
	public static void swapWithoutVariable(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    
	}
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input for the two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.println("\nSwapping without a third variable:");
            swapWithoutVariable(num1, num2);

            scanner.close();   
        }
	
	
}
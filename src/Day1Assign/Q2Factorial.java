package Day1Assign;
import java.util.Scanner;
public class Q2Factorial {

	
		// TODO Auto-generated method stub
		//Iteration
		public static int factorialIterative(int n) {
	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
       // Recursion
		public static int factorialRecursive(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorialRecursive(n - 1);
	        }
	    }
	
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Taking input for the number
    System.out.print("Enter a number to find its factorial: ");
    int num = scanner.nextInt();

    // Calculating factorial using iteration
    int factorialIter = factorialIterative(num);
    System.out.println("Factorial of " + num + " using iteration: " + factorialIter);

    // Calculating factorial using recursion
    int factorialRec = factorialRecursive(num);
    System.out.println("Factorial of " + num + " using recursion: " + factorialRec);

    scanner.close();
}
}



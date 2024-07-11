package Day1Assign;

import java.util.Scanner;

/**
 * testing
 */
		
public class Day1Q4primeornot {
	public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number to check if it's prime: ");
	        int num = scanner.nextInt();

	        // Checking if the number is prime
	        boolean isPrime = isPrime(num);

	        
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
}  
	  
}
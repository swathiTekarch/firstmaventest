package Day1Assign;
import java.util.Scanner;
public class Q3findinglargestnsmallest {
	 public static int findLargestOfThree(int num1, int num2, int num3) {
	        int largest = num1;
	        if (num2 > largest) {
	            largest = num2;
	        }
	        if (num3 > largest) {
	            largest = num3;
	        }
	        return largest;
	    }
	 public static int findLargestOfTwo(int num1, int num2) {
	        return num1 > num2 ? num1 : num2;
	    }
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter the first number: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second number: ");
     int num2 = scanner.nextInt();

     System.out.print("Enter the third number: ");
     int num3 = scanner.nextInt();

     // Finding the largest of three numbers
     int largestOfThree = findLargestOfThree(num1, num2, num3);
     System.out.println("The largest of the three numbers is: " + largestOfThree);

     // Finding the largest of two numbers
     int largestOfTwo = findLargestOfTwo(num1, num2);
     System.out.println("The largest of the first two numbers is: " + largestOfTwo);

     scanner.close();
}

}

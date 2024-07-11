package Day1Assign;

import java.util.Scanner;


public class Day1Q5reversestring {
	public static int reverseDigits(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
	public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 123456, reverse = 0;  
		//we have not mentioned the initialization part of the for loop  
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		}  
		// TODO Auto-generated method stub
		
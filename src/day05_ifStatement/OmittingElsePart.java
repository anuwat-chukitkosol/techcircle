package day05_ifStatement;

public class OmittingElsePart {

	public static void main(String[] args) {
		
		int count = 3;
		
		if (count < 2) {
			System.out.println("line numer 11");
		}
		
		System.out.println("I'm here");
		
		if (count > 2) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			
		}	
			
			
			/*
			1. write a program that can check if the given 
			               number is odd or even (OddEven)
					Ex:
						number = 100;
						output:
							100 is even number
						number = 101
						output:
							101 is odd number
			 */
		
		
		int number = 1;
		
		if (number%2 == 0) {
			System.out.println(number + " is even number");
			
		}else {
			System.out.println(number + " is odd number");
		}
		
		
		/*num1 = 20;
		num2 = 30;
		output:
			30 is the maximum number
		num1 = 20;
		num2 = 20;
		output:
			both numbers are equal*/
		
		int num1 = 40;
		int num2 = 20;
		
		if (num1 > num2) {
			System.out.println(num1 + " is the maximum number");
		}
	
		
		else if (num1 < num2) {
			System.out.println(num2 + " is the maximum number");
		}
		else {
			System.out.println("both number are equal");
		}
		}
			
		

	}
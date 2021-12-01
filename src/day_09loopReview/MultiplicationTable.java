package day_09loopReview;


import java.util.Scanner;


public class MultiplicationTable {

	public static void main(String[] args) {
		
//		Task 3:
//		Write a program that ask the user to input a positive integer. 
//		It should then print the multiplication table of that number
//		
//		range of the number is between 1 - 10;
//		
//		input = 5
//				
//		output:
//					
//			1 x 5 = 5
//			2 x 5 = 10
//			3 x 5 = 15
//			10 x 5 = 50
		
		Scanner scan = new Scanner(System.in);
		
//		int input = 5;
		
		System.out.println("Type a number between 1 ~ 10");
		
		int input = scan.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i +" x "+ input + " = " + i*input);
		}
	
		scan.close();
	}

}

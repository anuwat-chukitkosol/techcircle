package day05_ifStatement;

public class IfStatementTest {

	public static void main(String[] args) {


		int count = 2;
		int total = 4;
		
		total = (count < 3) ? 0 : total + count;
		
		System.out.println(total);
		
		if (count < 3) {
			total = 0;
		}else {
			total = total + count;
		}
		
		System.out.println(total);
		
		int num1 = 10;
		
		String message = "";
		
		System.out.println(message);
		
		if (num1 > 0) {
			System.out.println(num1 + " is positive");
		}else {
			System.out.println(num1 + " is negative");
		}
		
		double overdrawnPenalty = 8.0;
		double interestRate = 0.02;
		double balance;
		
		System.out.println("Enter your checking account balance $");
				
		
		balance = 10000;
		
		
		System.out.println("Original balance $"+balance);
		
		if (balance >= 0) {
			balance = balance + (interestRate * balance)/12;
		}else {
			balance = balance - overdrawnPenalty;
		}
		
		System.out.println("Your new balance is $"+ balance);
		
	}	
	}


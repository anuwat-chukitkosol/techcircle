package day08_loops;

public class Task {

	public static void main(String[] args) {
		// Write a program to accept number between 1 to 12,
		// and print name of the month base on the input using switch statement
		
	int month = 1;
	
	switch (month) {
	case 1:
		System.out.println("January");
		break;
	case 2:
		System.out.println("February");
		break;
	case 3:
		System.out.println("March");
		break;
	case 4:
		System.out.println("April");
		break;
	case 5:
		System.out.println("May");
		break;
	case 6:
		System.out.println("June");
		break;
	case 7:
		System.out.println("July");
		break;
	case 8:
		System.out.println("August");
		break;
	case 9:
		System.out.println("Septmber");
		break;
	case 10:
		System.out.println("October");
		break;
	case 11:
		System.out.println("November");
		break;
	case 12:
		System.out.println("December");
		break;
	default:
		System.out.println();
		break;
	}
	}

}

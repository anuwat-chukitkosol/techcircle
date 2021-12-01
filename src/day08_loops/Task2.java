package day08_loops;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("For loop");
		for (int i = 20; i < 31; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		
		System.out.println("While loop");
		int i = 20;
		while(i < 31) {
			System.out.println(i);
			i++;
		}
		System.out.println("-------------------");
		
		System.out.println("Do While loop");
		i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i < 31);
		

	}

}

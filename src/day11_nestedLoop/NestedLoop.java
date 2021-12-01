package day11_nestedLoop;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 1 ; i <= 5; i++) {
			
			for (int j = 1 ; j <= 5; j++)
				
			System.out.println(j);
				
		}

//		Write a program to print below statement
//		use nested for loop
		
		for (int i = 1 ; i <= 3 ; i++) {
			
			for(int j = 1 ; j <=3 ; j++) {
				
				System.out.print(j + " ");
				
			}
			System.out.println();
		}

	}

}

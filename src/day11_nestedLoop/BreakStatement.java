package day11_nestedLoop;

public class BreakStatement {

	public static void main(String[] args) {


		System.out.println();
		
		for (int j = 1 ; j < 6 ; j++) {
			
			for (int i = 1 ; i < 11 ; i++) {
				
				System.out.print(i + " ");
				
				if (i == 5) {
				break;
				}
			}
			
			System.out.println();
		}

	}

}

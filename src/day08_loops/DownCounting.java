package day08_loops;

public class DownCounting {

	public static void main(String[] args) {


		int i = 10;
//		
//		do {
//			System.out.println(i);
//			i--;
//		} while (i > 1);
//		
		do {
			System.out.println(i);
			
			if (i == 5) {
				break;
			}
			
			i--;
		} while (i > 1);

	}

}

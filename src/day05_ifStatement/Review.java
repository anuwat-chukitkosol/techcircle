package day05_ifStatement;

public class Review {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		
		System.out.println(a > b && b > a); //false
		
		System.out.println(a > b || b > a); // true
		
		System.out.println(!(a > b && b > a)); // true
		
		int c = (a > b) ? 1 : 2;
		
		System.out.println(c);
		
		System.out.println(c++);
		
		System.out.println(c); //3
		
		c += 5; // c = c + 5;
		
		System.out.println(c); //8
		
		System.out.println(--c); //7
		
		final double pi = 3.14;	
		
		System.out.println(pi);
		
		int result = 23%6; //(6,6,6,5)
		
		System.out.println(result);
		
		String str = (result > 3) ? "str1" : "str2";
		
		System.out.println(str);
		
		
		int num1 = -10;
		
		String givenNumber = (num1 > 0) ? "positive" : "negative";
		
		System.out.println(givenNumber);
		
		String msg = (num1 > 0) ? num1 + " is positive" : num1 + " is negative";
		
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

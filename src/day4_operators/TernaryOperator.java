package day4_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
//		variable = (condition) ? ifTrue : ifFalse
		
		int a , b ;
		
		a = 10;
		
//		b  =  (a == 1 ) ? 20 : 30;
		
//		System.out.println(b); // 
		
		b = (a == 10) ? 20 : 30;
		
		System.out.println(b);
		
		
		
		int numA , numB , numC;
		
		numA = 1;
		numB = 2;
		
		
		numC = (numA + numB > 5) ? 10: 25;
		
		
		System.out.println(numC);

	}

}

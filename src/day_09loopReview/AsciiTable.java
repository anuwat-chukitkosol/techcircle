package day_09loopReview;

public class AsciiTable {

	public static void main(String[] args) {

		char variableA = 65;
		
		System.out.println(variableA);
		
		char variableH = 72;
		
		System.out.println(variableH);
		
		for (char i = 65; i < 91; i++) {
			
			System.out.println(i);
			
			
		}
		
		for (char i = 97; i < 123; i++) {
			
			System.out.println(i);
		}

		String str = "A1b2c3";
		
		char a = 'a';
		int valueOfa = a;
		System.out.println(valueOfa);
		
		char z = 'z';
		int valueOfz = z;
		System.out.println(valueOfz);
		
		for(int i = valueOfa; i <= valueOfz; i++) {
			System.out.println((char)i);
			System.out.println(i);
		}
		

		}

}

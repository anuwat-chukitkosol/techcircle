package day12_String;

public class ChangingCase {

	public static void main(String[] args) {

		String word = "jaVa";
		
		System.out.println(word.toLowerCase());
		
		word = word.toLowerCase();
		
		System.out.println(word);
		
		word = word.toUpperCase();
		
		System.out.println(word);
		
		String str1 = "techcircle";
		String str2 = "TechCircle";
		
		boolean result = str1.equals(str2); //false
		
		boolean result2 = str1.toLowerCase().equals(str2.toLowerCase());
		
		System.out.println(result);
		
		System.out.println(result2);
		

	}

}

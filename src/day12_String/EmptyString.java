package day12_String;

public class EmptyString {

	public static void main(String[] args) {

		String str = "";
		
		System.out.println(str.length());
		
		String str2 = new String();
		System.out.println(str2.length());
		
		char[] chars = {'J','a','v','a'};
		
		String letter = new String(chars);
		
		System.out.println(letter);
	

	}

}

package day12_String;

public class StringCharAt {

	public static void main(String[] args) {

//					  0123
		String str = "Java-";
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));

//					   0123456789	
		String word = "TechCircle";
		
		System.out.println(word.length());	//10
		System.out.println(word.charAt(6));	//r
		System.out.println(word.charAt(3));	//h
		System.out.println(word.charAt(9));
		
		System.out.println(word.charAt(10-1));
		
		System.out.println(word.charAt(word.length()-1));
		
	}

}

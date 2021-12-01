package day13_StringContinue;

public class StringConcatenation {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Hello";
		
		String str3 = str1 + str2;
		
		System.out.println(str3);
		
		String str4 = str2.concat(" 12313 ");
		
		System.out.println(str4);
		
		String str5 = str2.concat(" ").concat(str1);
		
		System.out.println(str5);
		

	}

}

package day12_String;

public class StringReplaceMethod {

	public static void main(String[] args) {


		String word1 = "car";
		
		String word2 = word1.replace('r', 't');
		
		System.out.println(word1);
		
		System.out.println(word2);
		
		String str = "House, Mostly Along Party Lines, Censures Gosar for Violent Video";
		
		String str2 = str.replace("House", "TechCircle");
		
		System.out.println(str);
	
		System.out.println(str2);
		
		String str3 = str.replace(" ", "");
		
		System.out.println(str3);
		
		str3 = str3.replace(",", "");
		
		System.out.println(str3);
		
		
		
	}

}

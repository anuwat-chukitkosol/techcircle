package day13_StringContinue;

public class StringContain {

	public static void main(String[] args) {

//					   0123456789
		String name = "President George Washington";
		
		System.out.println(name.contains("Washington"));

		System.out.println(name.contains("washington"));
		
		System.out.println(name.toUpperCase());
		System.out.println("washington".toUpperCase());
		
		System.out.println(name.toUpperCase().contains("washington".toUpperCase()));
		
		String str = "TechCircle";
		
		System.out.println(str.contains("Tech"));
		
		System.out.println(str.contains("OA"));
		
		if (str.contains("Tech")) {
			
			str = str.toUpperCase();
		}
		System.out.println(str);
		
		if (str.indexOf("TECH") > -1) {
			str = str.toLowerCase();	
		}
		System.out.println(str);
		
		System.out.println(str.contains("s"));
		
		System.out.println(str.contains("t"));
		

	}

}

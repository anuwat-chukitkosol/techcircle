package day13_StringContinue;

public class StringIndxOf {

	public static void main(String[] args) {
//					   0123456789
		String name = "President George Washington";
		
		System.out.println(name.indexOf('e'));
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.length());
		
		System.out.println(name.indexOf('e', 8));
		
		System.out.println(name.indexOf("George"));
		
		System.out.println(name.indexOf("Washington"));
		
		System.out.println(name.charAt(17));
		
		System.out.println(name.indexOf("ident"));
		
		System.out.println(name.indexOf("id"));
		
		System.out.println(name.indexOf("ton"));
		
		System.out.println(name.indexOf("Irfan"));
		
		System.out.println(name.indexOf('z'));
	}

}

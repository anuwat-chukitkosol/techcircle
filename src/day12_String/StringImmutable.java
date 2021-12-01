package day12_String;

public class StringImmutable {

	public static void main(String[] args) {

		String str1 = "Hello Java";
		
		String str2 = "Hello ";
		
		String str3 = "Java";
		
		String str4 = str2 + str3;
		
		String str5 = new String(str2 + str3);
		
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str5);
		
		boolean result = str1 == str4;
		
		System.out.println(result);
		System.out.println("------------");
		System.out.println(str1 == str5);
		System.out.println(str1.equals(str5));
		System.out.println("------------");
		
		int a = 6;
		
		int b = 4;
		
		int c = 2;
		
		int d = b + c;
		
		boolean result2 = a == d;
		
		System.out.println(result2);
		
		
	}

}

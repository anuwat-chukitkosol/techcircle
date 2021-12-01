package day12_String;

public class ConvertNumberToString {

	public static void main(String[] args) {

		int num = 123;
		
		System.out.println(num);
		
		String s = ""+num;
		
		System.out.println(s.length());	//3
		
		System.out.println(s.charAt(0));
		
		double d = 9.99;
		
		String valueD = Double.toString(d);
		
		System.out.println(valueD.length());	//4
		
		System.out.println(valueD.charAt(1));	//.
		
		float num2 = 5.68f;
		
		String str2 = ""+num2;
		
		System.out.println(str2);
		
		System.out.println(str2.charAt(1));
		
		String str3 = String.valueOf(num2);
		
		

	}

}

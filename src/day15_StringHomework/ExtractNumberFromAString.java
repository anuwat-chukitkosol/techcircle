package day15_StringHomework;

public class ExtractNumberFromAString {

	public static void main(String[] args) {

/*		// String str = "ab123456cde78d";

    	// Write a program to extract number from a string.

		// expected output : 12345678 */
        
        String str = "ab123456cde78d03213654sfsdlfsd6546";
        
        
//        String output = str.replaceAll("[a-z]||[A-Z]", "");
//        System.out.println(output);
//        
//        String output2 = str.replaceAll("\\d", "");
//        System.out.println(output2);
        
        
        for(int i = 0; i < str.length(); i ++) {
//            System.out.println(str.charAt(i));
            
            char currentChar = str.charAt(i);
            
//            System.out.println(currentChar);
            
            int refNum = currentChar;
            
//            System.out.println(refNum);
            
            if (refNum >= '0' && refNum <= '9') {
                System.out.print(currentChar);
            }
            
            
        }
        
        
//        char zero = '0';
//        int numZero = zero;
//        
//        System.out.println(numZero); 
//        
//        int nine = '9';
//        
//        System.out.println(nine);
		 
	}

}

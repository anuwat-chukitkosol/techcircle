package day15_StringHomework;

public class FindMiddleCharacter {

	public static void main(String[] args) {

		/*
	     * 
	     * Find the middle character of a string Write a Java program to find the middle
	     * character of a string. If the length of the string is odd there will be one
	     * middle character. If the length of the string is even there will be 2 middle
	     * characters. Input: abcde output:c intput car11car output 11
	     */
	        
	        
//	        System.out.println(5%2);
//	        System.out.println(8%2);
//	                        012345
	        String input = "abcdefabcde";
	        char middleChar = ' ';
	        
//	        System.out.println(input.length());
	        
	        if (input.length()%2==1) {
	            
//	            System.out.println(input.length() / 2); //
	            
	            int middleCharIndex = input.length()/2;
	            
	            middleChar = input.charAt(middleCharIndex);
	            
	        }
	        
	        
	        if(input.length() % 2 == 0) {
	            
//	            System.out.println(input.length()/2);
//	            
//	            System.out.println(input.charAt(input.length()/2 -1));
//	            System.out.println(input.charAt(input.length()/2));
	            
	            int began = input.length()/2 -1;
	            
	            int end = input.length()/2 +1;
	            
	            System.out.println(input.substring(began,end));
	            
	            
	        }
	            
	        
	        
	        
	        System.out.println(middleChar);

	}

}

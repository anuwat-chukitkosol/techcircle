package day15_StringHomework;

public class RemoveFirstCharacter {

	public static void main(String[] args) {

/*		* Ask user to enter two words. Print first word without its first
 		* character then print the second word without its first character. 
 		* Input:
 		* apple banana 
	    * Output: ppleanana
*/
	    
//	                        01234
	        String word1 = "Apple";
//	                        012345
	        String word2 = "Banana";
	        
//	        System.out.print(word1.substring(1));
//	        
//	        System.out.print(word2.substring(1));
	        
	        
	        String word3 = word1.substring(1).concat(word2.substring(1));
	        
	        String word4 = word1.substring(1) + word2.substring(1);
	        
	        System.out.println(word3);
	        System.out.println(word4);

	}

}

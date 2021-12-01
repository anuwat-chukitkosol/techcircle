package day15_StringHomework;

public class UniqueCharacter {

	public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaabbbbbbbkkkkkkkkkkkkkkkkmbkjhkjghkbbbbbbbcANSDFSDF12313ccccccccccccccccccc";
        
        String expectedStr = "abc";
        
        String unique = "";
        
        for (int i = 0 ; i < str.length() ; i ++) {
            
            char currentChar = str.charAt(i);
                    
            String s = String.valueOf(currentChar);
            
            if (!unique.contains(s)) {
                unique = unique+s;
            }
            
        }
        
        
        System.out.println(unique);
        
        
//        System.out.println(unique.contains("a"));
//        
//        unique = unique+"a";
//        
//        System.out.println(unique.contains("a"))

	}

}

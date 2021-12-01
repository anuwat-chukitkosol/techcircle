package day_09loopReview;

public class HomeworkReview {

	public static void main(String[] args) {


//	Task 4        
//
//	Write a program that asks the user to input an integer 
//  and then outputs the number with the digits reversed. 
//  For example, 
//  if the input is 34567, the 
//  output should be 76543.

		int num = 34567;
        int output = 76543;
        int result = 0;
        
        while (num != 0) {
            
            int remainder = num % 10;
            
            result = result * 10 + remainder;
            
            num = num / 10;
        }
        
        System.out.println(result);
        
        
        if (result == output) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        
//Task 5:
//	Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//	Range is 1 to 100;
//  output:
//   Sum of all odd number
//   and Sum of all even number
        
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        
        for(int i = 1 ; i < 101 ; i++) {
        	
        	if (i % 2 == 0)
        	{
        		sumOfEvenNumbers += i;
        		
        	}
        	
        	if (i % 2 == 1)
        	{
        		sumOfOddNumbers += i;
        		
        	}
        
      	}
    
        System.out.println("sumOfOddNumbers = "+sumOfOddNumbers);
        
        System.out.println("sumOfEvenNumbers = "+sumOfEvenNumbers);
        
//	Task 6
//	Print numbers from 1 to 50 except those that are divisible by 3/*
        	
        for (int i = 1; i <= 50; i++) {
        		if (i % 3 != 0) {

              System.out.println(i);
          }
        }
        
//	Task 7
//	Write a program that will print out all letters in English alphabet in ascending order

        for (char i = 65; i <= 90; i++) { // OR for(char i = 'A'; i <= 'Z'; i++)

         System.out.println(i);

        }

//	Task 9:
//	Write a program which prints out the numbers from 1 to 30:
//	1. for numbers which are divisible by 3, print "FIN" instead of the number.
//	2. for numbers which are divisible by 5, print "RA" instead of the number
//	3. for numbers which are a divisible by both 3 and 5,
//	print "FINRA" instead of the number
//	Ex:
//  1 2 FIN 4 RA FIND .... FINDRA
 


//        for (int i = 1; i <= 30 ; i++) {
//        	if (i % 3 == 0 && i % 5 == 0) {
//        		
//                System.out.println("FINRA");
//
//        } else if (i % 5 == 0) {
//        	
//            System.out.println("RA");
//
//
//        } else if (i % 3 == 0) {
//        	
//            System.out.println("FIN");
//
//        }else {
//        	
//            System.out.println(i);
//        }
//        }
        
        String word = "";
        
        for (int i = 1; i <= 30; i++) {
            
            
            if (i % 3 == 0) {
                word = "FIN";
            }
            
            if (i % 5 == 0) {
                word = "RA";
            }
            
            
            if (i % 5 == 0 && i % 3 == 0) {
                word = "FINRA";
            }
            
            if (word != "") {
                System.out.println(word);
            }else {
                System.out.println(i);
            }
            
            
            word = "";
        }
        
        }
}

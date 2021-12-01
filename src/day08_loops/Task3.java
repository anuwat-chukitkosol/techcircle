package day08_loops;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * tasks: 
		 * 1. print out the numbers between 0 ~ 100 
		 * 2. print out the numbers between 100 ~ 200 
		 * 3. print out all the odd numbers between 0 ~ 100 
		 * 4. print out all the even numbers between 0 ~ 100 
		 * 5. do 500 push ups
		 */
		
//		1. print out the numbers between 0 ~ 100 
		int num = 0;
		
		while(num <= 100) {
			System.out.println(num);
			
//			num++;
			
			num = num + 1;
		}
		
		
//		System.out.println(num);
		
		num = 0;
		
//		System.out.println(num);
		
		
		do {
			System.out.println(num);
			num++;
		}while(num < 101);
		
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");

//		2. print out the numbers between 100 ~ 200
		
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		num = 100;
		do {
			System.out.println(num);
			num++;
		} while (num < 201);
	
		System.out.println("--------------------");
		
//		3. print out all the odd numbers between 0 ~ 100
		
		int a = 5;
		
		System.out.println(a % 2);	//(2,2,1,)
		
		if (a%2 == 1) {
			System.out.println("odd number");
		}

		System.out.println("--------------------");
		
		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
			
			if (i % 2 == 1) {
				System.out.println(i);
			}
		
		}
		
		System.out.println("--------------------");
		
//		4. print out all the even numbers between 0 ~ 100
		
		for (int i = 0; i <= 100; i++) {
//			System.out.println(i);
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		
		}
		
		System.out.println("--------------------");
		
//		5. do 500 push ups
		
		for (int G = 0; G <= 500;) {
			System.out.println("Push up "+G);
			G++;
		}

		System.out.println("--------------------");
		
//		6. print out all the number divisible by 2 or 3 or 5
//		range is between 0 ~ 100
		
		for (int x = 0; x <= 100;) {
			if (x % 2 == 0 || x %  3 == 0 || x % 5 == 0)
				System.out.println(x);
			x++;
		} 
		
		System.out.println("--------------------");
		
		for (int i = 0; i <= 100; i++)
			if (i%2 == 0) {
				System.out.println("Codility");
			}
		
			else if (i%3 == 0) {
			System.out.println("test");
			}
			else if(i%5==0) {
			System.out.println("Coder");}
			
			else {
				System.out.println(i);
			}
	}

}

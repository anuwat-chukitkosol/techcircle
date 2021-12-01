package day4_operators;

public class LogicalOr {

	public static void main(String[] args) {
		// || OR
		
//		ConditionA		ConditionB		Result
//		true			true			true
//		true			false			true
//		false			true			true
//		false			false			false
		
		int A = 1;
		int B = 2;
		int C = 3;
		
		System.out.println(A < B || C > B);
		
		System.out.println(A < B || C < B);
		
		System.out.println(A * B > C || C > A);
		
		System.out.println(A > B || A + C < B);
		

	}

}

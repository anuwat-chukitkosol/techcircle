package day4_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// && (AND), || (OR), ! (NOT)
		
		// &&
		
		//ConditionA	ConditionB	Result
//			true		   true	 	true
//			true		   false	false
//			false		   true		false
//			false		   false	false

		int A = 1;
		int B = 2;
		int C = 3;
		
		boolean conditionA = A < B; // true
		boolean conditionB = A + B == C; // true
		
		System.out.println(conditionA && conditionB);
		
		System.out.println(A > B && B < C); // false
		
		System.out.println(A * B == B && B > C); // false
		
		System.out.println(A >= B && B >= C);
		
		
	}

}

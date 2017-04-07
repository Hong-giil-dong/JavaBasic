package javabasic03;
class OperatorEx10 {
	public static void main(String args[]) { 
		int a = 1000000; //int형 변수 a에 1000000을 저장

		int result1 = a * a / a;   // 1000000 * 1000000 / 1000000 int범위를 초과(Overflow)해서 계산이 되고 다시 int로 들어오네?-_-
		int result2 = a / a * a;   // 1000000 / 1000000 * 1000000 int범위 안에서 계산 가능

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); 
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); 	
	}
}

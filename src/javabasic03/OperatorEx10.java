package javabasic03;
class OperatorEx10 {
	public static void main(String args[]) { 
		int a = 1000000; //int�� ���� a�� 1000000�� ����

		int result1 = a * a / a;   // 1000000 * 1000000 / 1000000 int������ �ʰ�(Overflow)�ؼ� ����� �ǰ� �ٽ� int�� ������?-_-
		int result2 = a / a * a;   // 1000000 / 1000000 * 1000000 int���� �ȿ��� ��� ����

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); 
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); 	
	}
}

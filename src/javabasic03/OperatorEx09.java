package javabasic03;
class OperatorEx09 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000; //long�� ������ �ƹ��͵� �������� ���� �⺻ ���� (int��)�� ������ ��� ���� int���� ������ �ʰ��� ��ŭ -�� ��ȯ�ǰ� ���
		long b = 1000000 * 1000000L; //��������� �� ���ڿ� Long���� ���������Ƿ� �켱������ ���� long������ �Ѵ� �ٲ�鼭 ����� �Ǿ long�� ���� b�� ������ ��

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

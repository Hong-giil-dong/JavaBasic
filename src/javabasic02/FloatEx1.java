package javabasic02; //��Ű�� ����
class FloatEx1 { //Ŭ���� ����
	public static void main(String[] args) { //���� �޼ҵ� ����
		
		//���� �����
		float  f   = 9.12345678901234567890f; //float�� ����Ÿ f
		float  f2  = 1.2345678901234567890f; //float�� ������ f2
		double d   = 9.12345678901234567890d; //double�� ������ d

		System.out.printf("     123456789012345678901234%n"); //����ϰ� �ٹٲ�
		System.out.printf("f  : %f%n", f); // float�� ������ %f�� �־� ����ϰ� �ٹٲٴµ� ����� ª���� 6�ڸ���..
		System.out.printf("f  : %24.20f%n", f); // flaot�� ���� f�� 24�ڸ� �� 20�ڸ��� �Ҽ��� ���
		System.out.printf("f2 : %24.20f%n", f2); //float�� ���� f2�� 24�ڸ� �� 20�ڸ��� �Ҽ��� ���
		System.out.printf("d  : %24.20f%n", d); // double�� ���� d�� 24�ڸ��� 20�ڸ��� �÷������� ���
	} //���� �޼��� ����
} //Ŭ���� ����

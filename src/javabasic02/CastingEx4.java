package javabasic02; //javabasic02 ��Ű�� ����
class CastingEx4 {// CastingEx4Ŭ���� ����
	public static void main(String[] args) { //���θ޼ҵ� ����
		int   i  = 91234567;  // 8�ڸ��� int�� ���� 
		float f  = (float)i;  // int i�� float�� ���� ����ȯ
		int   i2 = (int)f;	  // float�� i�� �ٽ� int�� ����ȯ �ؼ� i2�� ����

		double d = (double)i; // int�� ���� i�� double�� ����ȯ�ؼ� d�� ����
		int   i3 = (int)d;    // double�� ���� d�� �ٽ� int�� ����ȯ�Ͽ� i3�� ����

		float f2 = 1.666f; // float�� ���ڸ� f2�� ����
		int   i4 = (int)f2;// float�� ���� f2�� int������ ��ȯ���� i4�� ����

		System.out.printf("i=%d\n", i); // double�� ���� i�� 10������ �ٹٲ��Ͽ� ��� %d�� i�� ����
		System.out.printf("f=%f \ni2=%d\n", f, i2); //float�� ���� ����ȯ �� f�� %f�� �־ ����ϰ� i2��  %d�� �־� ���
		System.out.printf("d=%f \ni3=%d\n", d, i3); //double�� ���� d�� %f�� �־� ���, int�� ����ȯ �� i3�� %d�� �־� ��� 
		System.out.printf("(int)%f=%d\n", f2, i4); //float�� f2������ %f�� �־� ����ϰ� int�� ���� i4�� %d�� �־� ���
	} //���θ޼ҵ� ����
} //Ŭ���� ����

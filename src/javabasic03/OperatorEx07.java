package javabasic03; //javabasic03 ��Ű���� ��������
class OperatorEx07 { //OperatorEx07 Ŭ���� ����
	public static void main(String[] args) { //���θ޼��� ����
		byte a = 10; //byte�� ���� a�� 10�� ����(int�� 10�� ����ȯ�� �Ǹ鼭 byte������ ��ȯ)
		byte b = 30; //byte�� ���� b�� 30�� ����(�ڵ� ����ȯ)
		byte c = (byte)(a * b); //a*b�� byte������ ����ȯ�� ���Ѽ� byte�� ���� c�� ����

		System.out.println(c); // a*b�� ���� ��µǳ� byte�� -256~255 ���� ǥ�� ���� �ϹǷ� �ʰ��� 45�� ����� �Ǿ�� ������
								//�ణ�� ������ ���ܼ� 44�� ��µ�. ��������
	} //���� �޼��� ����(Main Methord End)
} //OperatorEx07 Ŭ���� ����

package javabasic03; //��Ű�� ����
class OperatorEx04 {//Ŭ���� ����
	public static void main(String[] args) {//���θ޼��� ����
		int i = -10; //int�� ���� i�� -10�� ����
		i = +i; //-10�� +���� ���� �� (��ȣ������ ����)
		System.out.println(i); //(-10*+10)�̹Ƿ�-*+�Ƿ� -10

		i=-10; // �ٽ� -10�� ��
		i = -i; // i�� ��������� -�� �Ἥ ��ġ���� �ݴ�� �ٲ۴�. 
		System.out.println(i); //(-10*-10)�̹Ƿ� -*-�� +�Ƿ� +10
	}//���θ޼��� ����
}//OperatorEx04 Ŭ���� ����
//��ȣ �����ڴ� boolean���� char���� ������ �⺻������ ����� �� �ִ�.
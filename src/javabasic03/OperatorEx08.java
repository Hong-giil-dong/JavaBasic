package javabasic03;
class OperatorEx08 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1�鸸 
		int b = 2000000;    // 2,000,000   2�鸸 

		//long c = a * b;     // ���� ����� int�� ������ ���� �Ŀ� �ʰ��� ���� -�� �ٲ�� �� ��� ���� long�� �ڵ�����ȯ �ؼ� ����
		long c = (long)a * (long)b; //���� ����� int���� ��������� long������ ����ȯ ��Ű�� ����ϹǷ� 100�� ���ϱ� 200����
									//���� ��ŭ ��Ȯ�� ��� ����� ������ �ȴ�.
		
		System.out.println(c); //System�޼��忡 ���Ե� out�� ���Ե� println�޼��忡 long�� ���� c�� ����϶�
	} //���θ޼��� ����
} //OperatorEx08 Ŭ���� ����

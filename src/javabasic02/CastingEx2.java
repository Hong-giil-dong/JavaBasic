package javabasic02;//����
class CastingEx2 {//Ŭ���� ����
	public static void main(String[] args) {//���� �޼ҵ� ����
		int  i = 10; //int�� ���� ����
		byte b = (byte)i; //byte�� ���� b�� int������ ����� i������ �ҷ��ͼ� byte������ ����ȯ ���� ����
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);  // i�� b�� ���� ��� i�� 10, b�� 10
		System.out.println(i);
		i = 300; //������ ����� int�� ���� i�� ����� �� 10�� ������ 300�� ���Ӱ� ����(����) 
		System.out.println(i); 
		b = (byte)i; //������ 10���� ���ǵ� i���� b�� ���Խ��Ѽ� 10�̵Ǿ����� �̹����� ������ ������ i�� 300�� b�� �־��ش�!
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //b�� byte���̹Ƿ� �ִ� ǥ�� ������ 256�����̴�.
															//256�� �ѰԵǸ鼭 256�� �������� ������ 44��ŭ�� ǥ����

		b = 10; //b����(byte��)�� 10���� ���ο� ���� ��
		i = (int)b; //b�� int������ ����ȯ �� 10�� i�� ����, �׷��Ƿ� i�� 10�� �ȴ�. 
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //��� ����� ? 10, 10

		b = -2; //b�� byte���ε� -2�� ���. byte�� -256~+255���� �ΰ�? -_- �׷��Ƿ� ǥ�� ����
		i = (int)b; //byte�� �̾��� b�� int������ ����ȯ�ؼ� i�� ���� -2�� �ǰڱ���
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // ok

		System.out.println("i="+Integer.toBinaryString(i)); //2�������� ���� int�� ����ȯ �� ���
	}//���� �޼ҵ� ����
}//Ŭ���� ����

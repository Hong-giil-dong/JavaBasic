package javabasic03;
class OperatorEx03 {
	public static void main(String args[]) {
		int i=5, j=5; //���� ����
			i++; //�ٷ� ������Ű��
			
		System.out.println(i); // 6 
		System.out.println(i++); //	6 (i�� ����ϰ� �� ���� i�� ++�Ѵ�, �� ���ο��� 7�� �Ǳ� ������ ��� �Ŀ� 7�� ��)
		System.out.println(i);//7 // ��µ� ���� ������ ����� ���� ������ 7�� ��µȴ�.
		System.out.println(++j); //6 // ++�� j�� ����Ѵ�
	
		System.out.println("i = " + i + ", j = " +j); // ������ ó���ǰ� �� ������ ���� 7�� 6�� ��µ�
	}
}

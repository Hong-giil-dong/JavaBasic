package javabasic02; //��Ű�� ����
class StringEx { //Ŭ���� ����
	public static void main(String[] args) { //���� �޼��� ����
		String name = "Ja" + "va"; //String�� ���� ����
		String str  = name + 8.0; //String�� ���� ����

		System.out.println(name); //���
		System.out.println(str); //���
		System.out.println(7 + " "); //7�ڿ� ����
		System.out.println(" " + 7); //������ �� ���� 7
		System.out.println(7 + ""); // ���� 7 + ����
		System.out.println("" + 7); // ���� 7
		System.out.println("" + ""); //���� + ����
		System.out.println(7 + 7 + ""); //���� 7+7 �ؼ� 14�� ��µǰ� �޺κ��� ����
		System.out.println("" + 7 + 7); // �տ� "" �̶�� ���ڷ� ���� �޺κ��� ���� ���� ó���Ǿ 7+7�� 14�� �ƴ� 77�� ���
	} //���� �޼��� ����
} //Ŭ���� ����

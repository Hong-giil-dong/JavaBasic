package javabasic02; //��Ű���� ��θ� �˷��༭ ���� �˷���
class CastingEx1 { // CastingEx1�̶�� Ŭ������ ����
	public static void main(String[] args) { // public�� ���θ޼ҵ带 ����
		double d  = 85.4; //double�� Ÿ���� d��� ������ 85.4�� ����
		int score = (int)d; //int�� Ÿ���� score��� ������ d��� ��ü?�� 
		//score���� int�� ������ ����ȯ �� double�� ����Ÿ 85.4�� 85�� ����Ǿ� ���� ���̴�.
		System.out.println("score="+score); //sysout�� �̿��� ���� ��� score�� ����� ���� ��� 
		System.out.println("d="+d); //double�� ����Ÿ �� �״�� ��� (���� 85.4)
	} //�޼��� ����
}//Ŭ���� ����

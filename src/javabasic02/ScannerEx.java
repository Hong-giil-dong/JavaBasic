package javabasic02;
import java.util.*;    // Scanner�� ����ϱ� ���� �߰�
//�ſ� �߿��� Ű �Է� ���(Scanner ��� ���)
//�ſ� �߿��� Ű �Է� ���(Scanner ��� ���)
//�ſ� �߿��� Ű �Է� ���(Scanner ��� ���)
//�ſ� �߿��� Ű �Է� ���(Scanner ��� ���)
//�ſ� �߿��� Ű �Է� ���(Scanner ��� ���)

class ScannerEx { //Ŭ���� ����
	public static void main(String[] args) { //���θ޼ҵ� ���� 
		Scanner scanner = new Scanner(System.in); //�Ʒ����� String input = scanner.nextLine(); �� ����ϱ� ���� ����
		//ScannerŸ������ scanner������������ �ϰ� ScannerŬ�����κ��� ���ο� ��ü�� �����ؼ� scanner�� ���� (�Ű�����, ����)

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>"); //��¹�

		String input = scanner.nextLine(); //StringŸ���� input������ scanner.nextLine()�̶�� ����� �־���
											//scanner.nextLine�� �Է¹��� ���ڿ��� �ǹ��Ѵ�.
		int num = Integer.parseInt(input); // �Է¹��� ���ڰ� input�� ������ �� ���� ���ڷ� ��ȯ 

		System.out.println("�Է³��� :"+input); //String input = scanner.nextLine(); ���� �Է¹��� String ���� ���
		System.out.printf("num=%d%n", num); //int num = Integer.parseInt(input) ���⼭ String���� �Է¹��� ���� int�� �ٲ��ְ� �Ǵµ� �� ���� ���
		//�Է¹��� ���� ���� ������ ��ɿ� ���Ե��� ������ (String���� String�� int�� ��ȯ�ؼ� ����ϴ� ��) ������ ����.
		//������� ���ڰ� int���� �Ѿ�� ��(���� 10�ڸ� �ʰ�) or ���ڰ� �ԷµǸ� ����
	} 
}

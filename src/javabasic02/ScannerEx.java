pack"age javabasic02;
import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx { //Ŭ���� ����
	public static void main(String[] args) { //���θ޼ҵ� ���� 
		Scanner scanner = new Scanner(System.in); 
		//ScannerŸ������ scanner������������ �ϰ� ScannerŬ�����κ��� ���ο� ��ü�� �����ؼ� scanner�� ���� (�Ű�����, ����)

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>"); //��¹�

		String input = scanner.nextLine(); //StringŸ���� input������ scanner.nextLine(scanner)���� input�� ����
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
	} 
}

/*class Scanner {
	
	String nextLine() {
		
		return a;
	}
	
}
*/

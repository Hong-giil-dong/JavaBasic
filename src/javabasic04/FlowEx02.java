package javabasic04;
import java.util.*; // ScannerŬ������ ����ϱ� ���� �߰�

class FlowEx02 {
	public static void main(String[] args) {  
		int input;

		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");

		/* 
		 * import java.util.*; //����Ʈ ����
		 * Scanner scanner = new Scanner(System.in); //��ĳ�� ��� ����
		 * String tmp = scanner.nextLine(); //�Է¹��� ���ڸ� tmp�� ����
		 * input = Integer.parseInt(tmp); // tmp�� ����� ���ڸ� ���ڷ� ��ȯ
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		}

		if(input!=0){
		//	System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� "+ input +"�Դϴ�.");
		}
	} // main�� ��
}

package javabasic04;
class FlowEx24 {
	public static void main(String[] args) { 
		int i=11;

		System.out.println("��, ���� ī��Ʈ�ٿ��� �����մϴ�.");

		while(i--!=0) {
			System.out.println(i);

			for(long j=0;j<200_000_000_000l;j++) { //�տ� int�� long������ �ٲپ� �� �ڿ��� ���ڰ��� ������ ������� �ʾҴµ�
												//���ڵڿ� l�� �������μ� ���ڸ� long������ �ٲپ��ִ� 2_000_000_000���� 
												//�������� �ʴ� ������ 200_000_000_000���� �þ��!! ���ڵ� long������ �ٲپ���� �ϴ±��� -_-
					;
			}
		}

		System.out.println("GAME OVER");
	}
}

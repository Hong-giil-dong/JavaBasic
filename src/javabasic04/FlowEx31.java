package javabasic04;
class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0) //i�� 3�� ����̸� �Ʒ��� ��Ƽ�� ����
				continue;
			System.out.println(i);
		}
	}
}

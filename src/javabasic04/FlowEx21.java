package javabasic04;
class FlowEx21 {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);			
				} else {
					System.out.printf("%5c", ' ');	//�ټ�ĭ�ǰ���(5)�� c(����)�� �������
													//��������� ����ټ�ĭ+�ƹ��͵�������������(�ƹ��͵���������)
				}
			}
			System.out.println();
		}
	} // main�� ��
}

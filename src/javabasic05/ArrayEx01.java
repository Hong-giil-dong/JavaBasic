package javabasic05;
class ArrayEx01 {
	public static void main(String[] args) { 

		int[] score = new int[10]; //�迭������ 10�� �ߴµ� ������ �ε��� ���� 0~9���� �̴�. 10�� ���� ���� ���� 10��������
		int k = 1; //���� ����

		score[0] = 50; //�迭 ��Ҹ� �ʱ�ȭ
		score[1] = 60;
		score[k+1] = 70;   // score[2] = 70
		score[3] = 80;
		score[4] = 90;
		score[5] = 199999;
		score[6] = 24124;
		score[7] = 234234;
		score[8] = 9999;
		
		int tmp = score[k+5] + score[7];  // int tmp = score[3] + score[4] 

	    // for������ �迭�� ��� ��Ҹ� ����Ѵ�.
		for(int i=0; i < 9; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]); //score[]�ȿ� i���� �־ �迭�� ��ȣ�� ������ְ�,
															//�ڿ� �ִ� %d�� �迭�� ���� ����Ѵ�.
															//�迭�� 0~9���� �ݺ��ǹǷ� ������ ��� ��
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",7,score[3]); //index�� ������ ��� ��
	} // main
}

package javabasic05;
class ArrayEx01 {
	public static void main(String[] args) { 

		int[] score = new int[10]; //배열선언을 10개 했는데 실제로 인덱스 값은 0~9까지 이다. 10은 존재 하지 않음 10개이지만
		int k = 1; //변수 선언

		score[0] = 50; //배열 요소를 초기화
		score[1] = 60;
		score[k+1] = 70;   // score[2] = 70
		score[3] = 80;
		score[4] = 90;
		score[5] = 199999;
		score[6] = 24124;
		score[7] = 234234;
		score[8] = 9999;
		
		int tmp = score[k+5] + score[7];  // int tmp = score[3] + score[4] 

	    // for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 9; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]); //score[]안에 i값을 넣어서 배열의 번호를 출력해주고,
															//뒤에 있는 %d로 배열의 값을 출력한다.
															//배열이 0~9까지 반복되므로 여러번 출력 됨
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",7,score[3]); //index의 범위를 벗어난 값
	} // main
}

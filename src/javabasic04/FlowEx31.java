package javabasic04;
class FlowEx31 {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if (i%3==0) //i가 3의 배수이면 아랫줄 컨티뉴 실행
				continue;
			System.out.println(i);
		}
	}
}

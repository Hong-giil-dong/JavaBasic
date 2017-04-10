package javabasic04;
class FlowEx24 {
	public static void main(String[] args) { 
		int i=11;

		System.out.println("자, 이제 카운트다운을 시작합니다.");

		while(i--!=0) {
			System.out.println(i);

			for(long j=0;j<200_000_000_000l;j++) { //앞에 int를 long형으로 바꾸어 준 뒤에도 숫자값의 범위가 변경되지 않았는데
												//숫자뒤에 l을 붙임으로서 숫자를 long형으로 바꾸어주니 2_000_000_000에서 
												//증가되지 않던 범위가 200_000_000_000까지 늘어났다!! 숫자도 long형으로 바꾸어줘야 하는구나 -_-
					;
			}
		}

		System.out.println("GAME OVER");
	}
}

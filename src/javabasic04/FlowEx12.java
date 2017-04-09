package javabasic04;
class FlowEx12 {
	// for(반복문)를 이용한 가로 5번 세로 5번 출력 (좀 억지같지만)(내가 모양 이쁘게 바꿔봤음 ㅋㅋ)
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++){
			System.out.println(i); // i의 값을 출력한다.
			System.out.println();
		}
		for(int i=1;i<=5;i++){
			System.out.print(i+"   ");  // println()대신 print()를 쓰면 가로로 출력된다.
		}
		//System.out.println();
	}
}

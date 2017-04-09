package javabasic04;
class FlowEx21 {
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);			
				} else {
					System.out.printf("%5c", ' ');	//다섯칸의공백(5)과 c(문자)에 공백대입
													//결과적으로 공백다섯칸+아무것도넣지않은문자(아무것도하지않음)
				}
			}
			System.out.println();
		}
	} // main의 끝
}

package javabasic03;
class OperatorEx08 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1백만 
		int b = 2000000;    // 2,000,000   2백만 

		//long c = a * b;     // 위에 선언된 int형 변수를 곱한 후에 초과된 값이 -로 바뀌고 그 결과 값을 long에 자동형변환 해서 저장
		long c = (long)a * (long)b; //위에 선언된 int값을 명시적으로 long형으로 형변환 시키고 계산하므로 100만 곱하기 200만을
									//곱한 만큼 정확한 계산 결과가 나오게 된다.
		
		System.out.println(c); //System메서드에 포함된 out에 포함된 println메서드에 long형 변수 c를 출력하라
	} //메인메서드 종료
} //OperatorEx08 클래스 종료

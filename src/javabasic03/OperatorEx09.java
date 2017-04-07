package javabasic03;
class OperatorEx09 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000; //long형 변수에 아무것도 설정되지 않은 기본 숫자 (int형)가 곱해진 결과 값이 int형의 범위를 초과한 만큼 -로 변환되고 출력
		long b = 1000000 * 1000000L; //명시적으로 뒷 숫자에 Long형을 지정했으므로 우선순위가 높은 long형으로 둘다 바뀌면서 계산이 되어서 long형 변수 b에 저장이 됨

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

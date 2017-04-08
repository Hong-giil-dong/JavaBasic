package javabasic03; //javabasic03 패키지 선언
class OperatorEx05 { //OperatorEx05 클래스 선언
	public static void main(String args[]) { //반환 값이 없는 메인 메소드 선언 
		int a = 10; //int형 변수 a에 10을 대입
		int b = 4; //int형 변수 b에 4를 대입

		System.out.printf("%d + %d = %d%n",  a, b, a + b); //10+4=14
		System.out.printf("%d - %d = %d%n",  a, b, a - b); //10-4=6
		System.out.printf("%d * %d = %d%n",  a, b, a * b); //10*4=40
		System.out.printf("%d / %d = %d%n",  a, b, a / b); //10/4=2
		System.out.printf("%d / %f = %f%n",  a, (float)b, a / (float)b); //10/4.0=2.5
	} //메인 메서드 종료
} //클래스 OperatorEx05 종료

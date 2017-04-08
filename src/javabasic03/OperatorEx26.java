package javabasic03;
class OperatorEx26 { //OperatorEx26 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		int a = 5; //int형 변수 a에 5를 대입
		int b = 0; //int형 변수 b에 0을 대입 (초기화)

		System.out.printf("a=%d, b=%d%n", a, b); 
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d\n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
	} // main 메소드 끝
} //OperatorEx26 클래스 종료

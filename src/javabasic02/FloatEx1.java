package javabasic02; //패키지 선언
class FloatEx1 { //클래스 선언
	public static void main(String[] args) { //메인 메소드 선언
		
		//변수 선언부
		float  f   = 9.12345678901234567890f; //float형 데이타 f
		float  f2  = 1.2345678901234567890f; //float형 데이터 f2
		double d   = 9.12345678901234567890d; //double형 데이터 d

		System.out.printf("     123456789012345678901234%n"); //출력하고 줄바꿈
		System.out.printf("f  : %f%n", f); // float형 변수를 %f에 넣어 출력하고 줄바꾸는데 출력이 짧아짐 6자리로..
		System.out.printf("f  : %24.20f%n", f); // flaot형 변수 f의 24자리 중 20자리를 소수로 출력
		System.out.printf("f2 : %24.20f%n", f2); //float형 변수 f2의 24자리 중 20자리를 소수로 출력
		System.out.printf("d  : %24.20f%n", d); // double형 변수 d의 24자리중 20자리를 플룻형으로 출력
	} //메인 메서드 종료
} //클래스 종료

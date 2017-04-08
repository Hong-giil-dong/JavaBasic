package javabasic03; //패키지 선언
class OperatorEx04 {//클래스 선언
	public static void main(String[] args) {//메인메서드 선언
		int i = -10; //int형 변수 i에 -10을 대입
		i = +i; //-10에 +값을 곱한 것 (부호변동이 없음)
		System.out.println(i); //(-10*+10)이므로-*+므로 -10

		i=-10; // 다시 -10을 줌
		i = -i; // i를 산술연산자 -를 써서 수치값을 반대로 바꾼다. 
		System.out.println(i); //(-10*-10)이므로 -*-는 +므로 +10
	}//메인메서드 종료
}//OperatorEx04 클래스 종료
//부호 연산자는 boolean형과 char형을 제외한 기본형에만 사용할 수 있다.
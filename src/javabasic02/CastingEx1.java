package javabasic02; //패키지의 경로를 알려줘서 길을 알려줌
class CastingEx1 { // CastingEx1이라는 클래스를 생성
	public static void main(String[] args) { // public형 메인메소드를 생성
		double d  = 85.4; //double형 타입의 d라는 변수에 85.4를 저장
		int score = (int)d; //int형 타입의 score라는 변수에 d라는 객체?를 
		//score에는 int형 값으로 형변환 된 double형 데이타 85.4가 85로 저장되어 있을 것이다.
		System.out.println("score="+score); //sysout을 이용해 문장 출력 score에 저장된 값을 출력 
		System.out.println("d="+d); //double형 데이타 값 그대로 출력 (값은 85.4)
	} //메서드 종료
}//클래스 종료

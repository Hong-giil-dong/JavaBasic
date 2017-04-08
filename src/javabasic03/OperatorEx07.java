package javabasic03; //javabasic03 패키지에 속해있음
class OperatorEx07 { //OperatorEx07 클래스 선언
	public static void main(String[] args) { //메인메서드 선언
		byte a = 10; //byte형 변수 a에 10을 대입(int형 10이 형변환이 되면서 byte형으로 변환)
		byte b = 30; //byte형 변수 b에 30을 대입(자동 형변환)
		byte c = (byte)(a * b); //a*b를 byte형으로 형변환을 시켜서 byte형 변수 c에 대입

		System.out.println(c); // a*b한 값이 출력되나 byte는 -256~255 까지 표현 가능 하므로 초과된 45가 출력이 되어야 하지만
								//약간의 오차가 생겨서 44가 출력됨. ㅎㅎㅎㅎ
	} //메인 메서드 종료(Main Methord End)
} //OperatorEx07 클래스 종료

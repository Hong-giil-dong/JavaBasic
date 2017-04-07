package javabasic03;
class OperatorEx07 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);

		System.out.println(c); // a*b한 값이 출력되나 byte는 -256~255 까지 표현 가능 하므로 초과된 45가 출력이 되어야 하지만
								//약간의 오차가 생겨서 44가 출력됨. ㅎㅎㅎㅎ
	}
}

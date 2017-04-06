package javabasic02;//생략
class CastingEx2 {//클래스 선언
	public static void main(String[] args) {//메인 메소드 생성
		int  i = 10; //int형 변수 선언
		byte b = (byte)i; //byte형 변수 b에 int형으로 선언된 i변수를 불러와서 byte형으로 형변환 시켜 저장
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);  // i와 b를 각각 출력 i는 10, b는 10
		System.out.println(i);
		i = 300; //위에서 선언된 int형 변수 i에 저장된 값 10을 버리고 300을 새롭게 대입(저장) 
		System.out.println(i); 
		b = (byte)i; //위에선 10으로 정의된 i값을 b에 대입시켜서 10이되었지만 이번에는 위에서 변형된 i값 300을 b에 넣어준다!
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); //b는 byte형이므로 최대 표현 범위가 256까지이다.
															//256을 넘게되면서 256은 버려지고 나머지 44만큼만 표현됨

		b = 10; //b변수(byte형)를 10으로 새로운 값을 줌
		i = (int)b; //b를 int형으로 형변환 한 10을 i에 저장, 그러므로 i는 10이 된다. 
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); //출력 결과는 ? 10, 10

		b = -2; //b는 byte형인데 -2를 줬다. byte는 -256~+255까지 인가? -_- 그러므로 표현 가능
		i = (int)b; //byte형 이었던 b를 int형으로 형변환해서 i에 대입 -2가 되겠구나
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // ok

		System.out.println("i="+Integer.toBinaryString(i)); //2진데이터 값을 int로 형변환 후 출력
	}//메인 메소드 종료
}//클래스 종료

package javabasic02; //javabasic이라는 패키지를 참조해서 만든 소스파일
class VarEx2 {//클래스 VarEx2를 선언
	public static void main(String[] args) { //반드시 있어야 하는 메인메소드 명령
		int x = 10; //int형 타입으로 x라는 변수를 만들고 대입연산자로 10을 저장해서 [[초기화]]
		int y = 20; //int형 타입으로 y라는 변수 선언하고 20이라는 값을 대입연산자로 넘겨서 [[초기화]]
		int tmp = 0; //int형 타입으로 tmp라는 변수 선언 후 0으로 초기화
	
		System.out.println("x:"+ x + " y:" + y); //출력명령으로 x값과 y값 출력
		
		tmp = x; // tmp라는 변수에 x의 값을 저장 (tmp에 x의 값인 10을 저장시켜서 tmp는 10으로 변경)
		x = y; // x라는 변수에 y의 값을 저장(x에 y의 초기화 값인 20을 저장시켜서 x를 20으로 변경)
		y = tmp; //y라는 변수에 tmp의 값을 저장(y에 tmp의 변경된 값 10을 저장)
		//이렇게 해서 x와 y의 값이 완전히 바뀜 (x=y로 해버리면 y값이 x에 저장되서 x는 값이 y와 동일해지므로 변경이 불가능한데
		//임시변수 tmp를 만들어서 x의 값을 저장시킨 후에 y의 값을 x에 넘기고 y는 x의 값이 저장되었던 tmp의 값을 받아 x의 값을 갖게 된다.
		// 결론적으로 이렇게 해야 x와 y값을 서로 바꿀수 있다

		System.out.println("x:"+ x + " y:" + y);//출력명령으로 x의 값과 y의 값을 출력
	}//클래스 종료
}//VarEx2클래스를 종료

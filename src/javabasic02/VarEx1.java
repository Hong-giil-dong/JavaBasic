package javabasic02; //javabasic02라는 패키지를 참조해서 만든 소스파일
class VarEx1 { //VarEx1이라는 클래스를 생성
	public static void main(String[] args) { //반드시 있어야 하는 메인의 위치 설정 및 메인 선언(메소드)
		int year = 0; //int타입의 year이라는 변수를 선언하고 0을 변수에 대입 시켜서 초기화
		int age  = 14; //int타입의 age라는 변수를 선언하고 14라는 값을 대입연산자로  age라는 변수에 넘겨서 초기화
		 
		System.out.println(year); //출력명령으로 year변수에 초기화된 값을 출력
		System.out.println(age); //출력명령으로 age변수에 초기화된 값을 출력

		year = age + 2000;  //year변수에 age변수에 초기화된 값과 2000을 더해서 대입연산자로 year에 대입 				
		// 변수 age의 값에 2000을 더해서 변수 year에 저장
		age  = age + 1; //변수 age를 age에 초기화된 값과 1을 더해서 대입연산자로 넘겨줌     
		// 변수 age에 저장된 값을 1증가시킨다.

		System.out.println(year); //위에서 초기화 된 값에 밑에 새로 저장시킨 값을 넣은걸 출력 2014 
		System.out.println(age); //위에서 초기화 된 값에 밑에 새로 저장시킨 값을 넣은걸 출력 15
	} //메인 메서드 종료
} //클래스 종료

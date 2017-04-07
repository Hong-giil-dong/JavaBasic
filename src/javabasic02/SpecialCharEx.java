package javabasic02; //패키지 선언
class SpecialCharEx { //클래스 선언
	public static void main(String[] args) { //메인 메소드 선언
		System.out.println('\'');		     //  '''처럼 할 수 없다.
		System.out.println("abc\t123\b456"); // \b가 블록문으로 추가됨 123과 456사이에
		System.out.println('\n');		     //  개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");	 //  큰따옴표를 출력하려면 \" 이렇게 한다.
		System.out.println("c:\\"); //c:\\은 경로를 지정할때 \\를 두개 넣어줘야 한다는 걸 의미
	} //클래스 선언
} //패키지 선언

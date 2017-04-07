package javabasic02; //패키지 선언
class StringEx { //클래스 선언
	public static void main(String[] args) { //메인 메서드 선언
		String name = "Ja" + "va"; //String형 변수 선언
		String str  = name + 8.0; //String형 변수 선언

		System.out.println(name); //출력
		System.out.println(str); //출력
		System.out.println(7 + " "); //7뒤에 공백
		System.out.println(" " + 7); //공백이 들어간 문자 7
		System.out.println(7 + ""); // 숫자 7 + 문자
		System.out.println("" + 7); // 문자 7
		System.out.println("" + ""); //문자 + 문자
		System.out.println(7 + 7 + ""); //숫자 7+7 해서 14가 출력되고 뒷부분은 문자
		System.out.println("" + 7 + 7); // 앞에 "" 이라는 문자로 인해 뒷부분이 전부 문자 처리되어서 7+7이 14가 아닌 77이 출력
	} //메인 메서드 종료
} //클래스 종료

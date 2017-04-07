package javabasic02;
import java.util.*;    // Scanner를 사용하기 위해 추가
//매우 중요한 키 입력 명령(Scanner 사용 방법)
//매우 중요한 키 입력 명령(Scanner 사용 방법)
//매우 중요한 키 입력 명령(Scanner 사용 방법)
//매우 중요한 키 입력 명령(Scanner 사용 방법)
//매우 중요한 키 입력 명령(Scanner 사용 방법)

class ScannerEx { //클래스 생성
	public static void main(String[] args) { //메인메소드 생성 
		Scanner scanner = new Scanner(System.in); //아래에서 String input = scanner.nextLine(); 를 사용하기 위해 선언
		//Scanner타입으로 scanner참조변수선언 하고 Scanner클래스로부터 새로운 객체를 생성해서 scanner에 대입 (매개변수, 조건)

		System.out.print("두자리 정수를 하나 입력해주세요.>"); //출력문

		String input = scanner.nextLine(); //String타입의 input변수에 scanner.nextLine()이라는 명령을 넣어줌
											//scanner.nextLine은 입력받은 문자열을 의미한다.
		int num = Integer.parseInt(input); // 입력받은 문자가 input에 들어오면 그 값을 숫자로 변환 

		System.out.println("입력내용 :"+input); //String input = scanner.nextLine(); 에서 입력받은 String 값을 출력
		System.out.printf("num=%d%n", num); //int num = Integer.parseInt(input) 여기서 String으로 입력받은 값을 int로 바꿔주게 되는데 그 값을 출력
		//입력받은 값이 위에 선언한 명령에 포함되지 않으면 (String값과 String을 int로 변환해서 출력하는 것) 오류가 난다.
		//예를들어 숫자가 int형을 넘어서는 값(숫자 10자리 초과) or 문자가 입력되면 오류
	} 
}

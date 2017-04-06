pack"age javabasic02;
import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerEx { //클래스 생성
	public static void main(String[] args) { //메인메소드 생성 
		Scanner scanner = new Scanner(System.in); 
		//Scanner타입으로 scanner참조변수선언 하고 Scanner클래스로부터 새로운 객체를 생성해서 scanner에 대입 (매개변수, 조건)

		System.out.print("두자리 정수를 하나 입력해주세요.>"); //출력문

		String input = scanner.nextLine(); //String타입의 input변수를 scanner.nextLine(scanner)으로 input에 대입
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
	} 
}

/*class Scanner {
	
	String nextLine() {
		
		return a;
	}
	
}
*/

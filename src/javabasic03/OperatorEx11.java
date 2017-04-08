package javabasic03;
class OperatorEx11 {
	public static void main(String args[]) { 
		char a = 'a';
		char d = 'd';
//선언은 char에 문자를 저장시켰지만 실제로는 그 문자의 주소값이 저장되게 된다. (문자 고유 ASKII코드 값)
		char zero = '0';
		char two  = '2';

		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); 
		// 문자형으로 선언된 값들끼리 -연산을 수행해서 문자 고유의 아스키 값을 -한 결과가 나오게 된다.
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero); 
		//고유 ASKII값 끼리 산술 연산
		System.out.printf("'%c'=%d%n", a, (int)a); 
		// int형으로 형변환을 시켰지만 형변환이 되면서 ASKII값이 표현된다.
		System.out.printf("'%c'=%d%n", d, (int)d); 
		// int형으로 형변환을 시켰지만 형변환이 되면서 ASKII값이 표현된다.
		System.out.printf("'%c'=%d%n", zero, (int)zero);
		System.out.printf("'%c'=%d%n", two,  (int)two);
	}
}

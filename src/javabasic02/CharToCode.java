package javabasic02;
class CharToCode { 
	public static void main(String[] args) { 
		char ch = 'A';	     // char ch = 65;         
		int code = (int)ch;  // ch에 저장된 char값을 int타입으로 변환하여 code에 저장한다. (문자 코드 출력)

		System.out.printf("%c=%d(%#X)%n", ch, code, code); //ch, code, code를 %?에 넣어 각각 출력하고 줄바꿈

		char hch = '가';     // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)\n", hch, (int)hch, (int)hch); 
		//%c에 hch(문자값이 char형으로 변환된 값), %d에 int형으로 변환된 hch, %#X에 int형으로 변환된 hch를 넣어 출력
	} 
} 

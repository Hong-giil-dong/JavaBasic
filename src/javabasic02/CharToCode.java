package javabasic02;
class CharToCode { 
	public static void main(String[] args) { 
		char ch = 'A';	     // char ch = 65;         
		int code = (int)ch;  // ch�� ����� char���� intŸ������ ��ȯ�Ͽ� code�� �����Ѵ�. (���� �ڵ� ���)

		System.out.printf("%c=%d(%#X)%n", ch, code, code); //ch, code, code�� %?�� �־� ���� ����ϰ� �ٹٲ�

		char hch = '��';     // char hch = 0xAC00;
		System.out.printf("%c=%d(%#X)\n", hch, (int)hch, (int)hch); 
		//%c�� hch(���ڰ��� char������ ��ȯ�� ��), %d�� int������ ��ȯ�� hch, %#X�� int������ ��ȯ�� hch�� �־� ���
	} 
} 

package javabasic03;
class OperatorEx24 {
	public static void main(String args[]) { 
		int  x = 0;
		char ch = ' ';

		x = 15;
		System.out.println(10 < x && x < 20);
		//                   만족             불만족
 //                               만족              불만족 // false
		x = 6; //            만족        만족        불만족
		System.out.println(6%2==0 || 6%3==0 && 6%6!=0); // 2,3,4,8,9...
		System.out.println((x%2==0 || x%3==0) && x%6!=0);

		ch='1';
		System.out.println('0' <= ch && ch <='9');

		ch='a';
		System.out.println('a' <= ch && ch <='z');

		ch='A';
		System.out.println('A' <= ch && ch <='Z');

		ch='q';
		System.out.println(ch=='q' || ch=='Q');
	}
}

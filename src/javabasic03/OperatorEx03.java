package javabasic03;
class OperatorEx03 {
	public static void main(String args[]) {
		int i=5, j=5; //변수 선언
			i++; //바로 증가시키기
			
		System.out.println(i); // 6 
		System.out.println(i++); //	6 (i를 출력하고 난 다음 i를 ++한다, 이 라인에서 7이 되긴 하지만 출력 후에 7이 됨)
		System.out.println(i);//7 // 출력된 값은 위에서 출력한 다음 증가된 7이 출력된다.
		System.out.println(++j); //6 // ++한 j를 출력한다
	
		System.out.println("i = " + i + ", j = " +j); // 위에서 처리되고 난 마지막 값인 7과 6이 출력됨
	}
}

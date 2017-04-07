package javabasic03;  //패키지 선언
class OperatorEx01 { // 클래스 선언
	public static void main(String args[]) { //메인메서드 선언
		int i=5;		//int형 변수 i에 5를 저장
		i++;		    //저장된 값 5를 ++로 1증가 시킨다.
						
		System.out.println(i); //증가 된 값 6 출력

		i=5;		      //	결과를 비교하기 위해 i값을 다시 5로 변경.
		++i;				// 증가 시킨다.
		System.out.println(i); //증가 된 값 6 출력
	}//메인 메서드 종료
} //클래스 종료

package javabasic02; //javabasic02 패키지 선언
class CastingEx4 {// CastingEx4클래스 선언
	public static void main(String[] args) { //메인메소드 선언
		int   i  = 91234567;  // 8자리의 int형 변수 
		float f  = (float)i;  // int i를 float형 으로 형변환
		int   i2 = (int)f;	  // float형 i를 다시 int로 형변환 해서 i2에 저장

		double d = (double)i; // int형 변수 i를 double로 형변환해서 d로 저장
		int   i3 = (int)d;    // double형 변수 d을 다시 int로 형변환하여 i3에 저장

		float f2 = 1.666f; // float형 문자를 f2에 저장
		int   i4 = (int)f2;// float형 변수 f2를 int형으로 변환시켜 i4에 저장

		System.out.printf("i=%d\n", i); // double형 변수 i를 10진수로 줄바꿈하여 출력 %d에 i가 대입
		System.out.printf("f=%f \ni2=%d\n", f, i2); //float형 으로 형변환 된 f를 %f에 넣어서 출력하고 i2를  %d에 넣어 출력
		System.out.printf("d=%f \ni3=%d\n", d, i3); //double형 변수 d를 %f에 넣어 출력, int로 형변환 된 i3을 %d에 넣어 출력 
		System.out.printf("(int)%f=%d\n", f2, i4); //float형 f2변수를 %f에 넣어 출력하고 int형 변수 i4를 %d에 넣어 출력
	} //메인메소드 종료
} //클래스 종료

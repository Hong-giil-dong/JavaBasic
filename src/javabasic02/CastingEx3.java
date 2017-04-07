package javabasic02; //패키지 선언
class CastingEx3 {//클래스 선언
	public static void main(String[] Flower) { //메인 메소드 선언
		float f   = 9.1234567f; //변수 선언 플룻 형 f 
		double d  = 9.1234567; //변수 선언 더블 형 d
		double d2 = (double)f; //플룻형 f변수를 double형으로 형변환 시켜서 d2에 double로 저장

		System.out.printf("f =%20.18f\n", f); // f를 전체 20자리로 표현 하되 소수자리는 18자리만 표시하라(.을 포함하면 전체 20자리)
		System.out.printf("d =%20.18f\n", d);// f를 전체 20자리로 표현 하되 소수자리는 18자리만 표시하라(.을 포함하면 전체 20자리)
		System.out.printf("d2=%20.18f\n", d2);// f를 전체 20자리로 표현 하되 소수자리는 18자리만 표시하라(.을 포함하면 전체 20자리)
int i = 0; 
int a = 0;
a=++i; // java특성상 ++i로 했을 경우엔 계산이 된 결과가 출력되지만 i++로 했을 경우엔 i만 a에 대입되고 0이 출력되어버린다. 자바의 특성상 후위연산자는 계산이 되지 않는 듯?
System.out.println(i); //int형 변수 i출력
System.out.println(a);//int형 변수 a출력
	}//클래스 종료
}//패키지 종료

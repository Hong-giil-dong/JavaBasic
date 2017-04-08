package javabasic03;//javabasic03 패키지 선언
class OperatorEx06 { //OperatorEx06 클래스 선언
      public static void main(String[] args) { //반환 값이 없는 메인 메서드 선언 
            byte a = 10; //byte형 변수 a에 10을 대입
            byte b = 20; //byte형 변수 b에 20을 대입(이렇게 하면 int형 20이(int표현가능범위) 형변환을 거쳐 byte형이 되면서 대입)
            byte c = (byte)(a + b); //byte형 변수 c에 byte형으로 형변환한 a+b를 대입

            System.out.println(c); //출력 
      } //메인 메서드 종료
} //OperatorEx06 클래스 종료

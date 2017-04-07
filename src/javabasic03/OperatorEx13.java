package javabasic03;
class OperatorEx13 { 
      public static void main(String[] args) { 
			char c1 = 'a';

			char c2 =  (char)(c1+1);    //명시적으로 형변환을 시켜서 하면(반드시 char형으로 변환시켜야함) 문자값이 증가됨
			char c3 = 'j'+5;           //명시적 형변환을 사용하지 않더라도 'j'처럼 문자를 지정해주고 연산을 해도 됨
			//char c4 = c1+1; //이런식으로 형변환도 하지않고 문자지정도 해주지 않는다면 에러가 난다. 
							//타입을 안적어주면 c1이 1과 같이 int형으로 인식되어서 에러를 내뿜는 것 같다앙......
            System.out.println(c2); 
            System.out.println(c3);     
  } 
}

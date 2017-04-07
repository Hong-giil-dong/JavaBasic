package javabasic03;
class OperatorEx02 {
	public static void main(String args[]) {
		int i=5, j=0; //변수 선언

		j = i++;  //앞에 대입연산자가 있으면 j=i 먼저 실행되고 나중에 6이 되는데 
				//앞에 대입연산자 없이 i만 있게 되면 바로 증가되어 6이 되어버린다.
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j); // 6 5

		i=5;        //i와 j의 값을 다시 5와 0으로 변경
		j=0;		

		j = ++i; //대입연산자가 있어도 앞에 ++가 붙으면 i와 함께 인식 되어서 같이 대입이 됨과 동시에 증가된다.
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j); // 6 6
	}
}

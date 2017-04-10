package javabasic04;
class FlowEx33 {
	public static void main(String[] args)
	{
        // for문에 Loop1이라는 이름을 붙였다.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
//					if(j==5) //안쪽 for문의 j가 5일경우에만 for문을 진행  
//						break Loop1; //break Loop1은 Loop1을 통째 벗어난다
//						break; //break는 현재 for문을 벗어난다
//						continue Loop1; //continue는 Loop1으로 이동하여 계속 진행
//						continue; //얜 그냥 계속 진행
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1

	}
}

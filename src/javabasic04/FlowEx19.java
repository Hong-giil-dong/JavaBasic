package javabasic04;
class FlowEx19 {
	public static void main(String[] args) { 
		for(int i=1;i<=3;i++)  
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++)
					System.out.println(""+i+j+k);
	/*				System.out.println(""+i+j+k); 
					System.out.printf("%ni%nj%nk"); 
		\n을 넣으면 줄바꿈이 되는데 왜 %n을 넣으면 줄바꿈이 안되지? 
		아하... %n은 printf에서만 동작하고 println에선 동작하지 않는구나...*/
	} // main의 끝
}

package javabasic04;
class FlowEx33 {
	public static void main(String[] args)
	{
        // for���� Loop1�̶�� �̸��� �ٿ���.
		Loop1 : for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
//					if(j==5) //���� for���� j�� 5�ϰ�쿡�� for���� ����  
//						break Loop1; //break Loop1�� Loop1�� ��° �����
//						break; //break�� ���� for���� �����
//						continue Loop1; //continue�� Loop1���� �̵��Ͽ� ��� ����
//						continue; //�� �׳� ��� ����
					System.out.println(i+"*"+ j +"="+ i*j);
				} // end of for i
				System.out.println();
		} // end of Loop1

	}
}

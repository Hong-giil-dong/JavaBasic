package javabasic06;
/*class Tv { 
     // Tv�� �Ӽ�(�������) 
     String color;           	// ���� 
     boolean power;         	// ��������(on/off) 
     int channel;           	// ä�� 

     // Tv�� ���(�޼���) 
     void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
     void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
     void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
     void channel10Up() { channel = channel+10; }
     void channel10Down() { channel = channel-10; }
       
}*/

class TvTest { 
      public static void main(String args[]) { 
            Tv t;                  // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����       
            t = new Tv();          // Tv�ν��Ͻ��� �����Ѵ�. 
            t.channel = 5;         // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. 
            t.channelUp();
            t.power = false;
            t.power();// Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�. 
            System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
            System.out.println(t.power); // ���� Ƽ���� �Ŀ��� ���� ���·� ����
            
      } 
} 

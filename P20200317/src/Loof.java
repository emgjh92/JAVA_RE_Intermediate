
public class Loof {

	public static void main(String[] args) {
		
		int value = 5;
		
		while(true) {
			
			value++;
			System.out.println("�ȳ��ϼ���");
			
			if(value ==10)
			{
				break;
			}
		}
		
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println("�ݰ����ϴ�.");
		}
		
	}

}


public class P2 {
public static void main(String[] args) {
	int a = 10;
	
	if(a > 5) {
		int b = 30;
		System.out.println(b);
	} // int b �� if ���� { } (scope)�� ���� ���� �� �޸� �Ҵ��� �Ҹ�ȴ�.
	
	/*
	b=40; // error
	*/
	int b = 40;
	
	for(int i = 0; i<10; i++) {
		for(int x=0; i<20; i++) { 
			//���� for �� �ȿ��� ���� int i �� ��� �����Ƿ� i ���� �ٸ��� �����ؾ� �Ѵ�.
			
		}
	}
	
	for (int i=0; i<10; i++) {
		int sum = 0; //int sum�� for ���� �ѹ��� �� �� ���� ���� ����-�Ҹ�-�ٽ� �Ҵ� �ȴ�.
	}
	
}
}


public class P2 {
public static void main(String[] args) {
	int a = 10;
	
	if(a > 5) {
		int b = 30;
		System.out.println(b);
	} // int b 는 if 문이 { } (scope)를 빠져 나올 때 메모리 할당이 소멸된다.
	
	/*
	b=40; // error
	*/
	int b = 40;
	
	for(int i = 0; i<10; i++) {
		for(int x=0; i<20; i++) { 
			//안쪽 for 문 안에선 아직 int i 가 살아 있으므로 i 말고 다른걸 선언해야 한다.
			
		}
	}
	
	for (int i=0; i<10; i++) {
		int sum = 0; //int sum은 for 문을 한바퀴 돌 때 마다 새로 생성-소멸-다시 할당 된다.
	}
	
}
}

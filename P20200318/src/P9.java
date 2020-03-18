
public class P9 {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
		arr [0] = 10;
		arr [3] = 20;
		
		arr = new int[3]; //새 heap 영역에 stack의 주소값이 연결된다.
		//heap 영역은 scope 를 빠져나오면 소멸되는 stack 과 달리 
		//연결된 주소값 stack이 끊어지면 자동으로 garbage collector가 소멸시킨다
		//(Java의 경우만 해당...C언어나 C++은 garbage collector 가 없다)
		
		
	}

}

package Generic;

public class P1 {

	public static void main(String[] args) {
		//Generic
		SomeData<Integer, String> data1 = new SomeData<Integer, String>();
		//메모리를 '생성'을 할 때(선언 아님!) 데이터 type을 지정하겠다 라는 것
		
		SomeData<System, Math> data2 = new SomeData<System, Math>();	
	
	}
}

class SomeData<V, E>{
	
	V soore;
	E name;
	int age;
	//데이터의 자료형이 알 수 없다 가정할 때 새로운 자료형을 '정의'할 수 있다.
	//물론 실행 시점에선 반드시 type이 있어야 한다.
	
	//보통 framework 나 라이브러리 파일(API) 를 만들 때 쓴다.
}
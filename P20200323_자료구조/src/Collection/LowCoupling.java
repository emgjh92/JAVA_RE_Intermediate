package Collection;

import java.util.*;

public class LowCoupling {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//만약에 ArrayList 에서 모듈을 LinkedList 로 바꾸고 싶다면?
		//List<String> list = new LinkedList<String>(); 로만 맞추면 된다 ==> !!!!!!낮은 결합도!!!!!!! 
		//이것이 바로 인터페이스의 최대 장점이다. (표준인 List 로 선언 해 놨기 때문에 최소한의 코드 수정으로 모듈이 싹 바뀐다)
		
		List<String> list2 = new ArrayList<>();
		//===> 뒤의 String 을 暳 자동으로 맞춰진다. (최신문법, 소스 간결화)
		
		new Test().method1(list);
	}

}

class Test{
	public void method1(List<String> list) {
		method2(list);
	}
	
	public void method2(List<String> list) {
		
	}
	
}

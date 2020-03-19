
public class P01 {
public static void main(String[] args) {
	
	//java 접근제한자와 this , static ,final 등
	
	final int a = 10; //final : 값을 단 한번만 초기화 가능(그 후엔 못 바꿈)
	//코드의 안정성을 위해 기능을 "제한"하는 것
	//ex.온수 온도의 최대 온도 등
	
//	a = 20;
//	a = 30; // 컴파일 불가능
	
	System.out.println(a);
	
	
	
	
	int v1 = 10;
	int v2 = 20;
	int result = A1.plus(v1, v2);
	System.out.println(result);
}
}


class A1{
	static int plus(final int a, final int b) {
		//a = 20; ==> final 을 선언 했으므로 컴파일 에러가 난다.
		
		return a+b;
	}
}
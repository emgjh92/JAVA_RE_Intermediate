
public class P17 {
public static void main(String[] args) {


//  static 의 단점 : static으로 선언 된것들은 프로그램이 종료될때 까지 메모리에 남는다...
// ==> 메모리 효율이 매우 낮아진다.
	
//	Test.v2 = 10; //static 의 접근 법
//	static은 시작 시점부터 생성되고 끝날때 까지 남아있으며, stack영역 도 heap 영역도 아닌 method 영역이다, global 하게 접근 가능하다.
	
	System.out.println(Test.v2);
	Test t1 = new Test();
	t1.v1 = 10;
	
	A aa = new A();
	aa.aaaaa(t1);
	
	}
}
class A{
	void aaaaa(Test tt) {
		System.out.println(tt.v1); //결과값 : 10
		System.out.println(Test.v2);

	}
}
class Test{
	int v1;
	static int v2;
}

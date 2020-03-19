
public class P06 {

	public static void main(String[] args) {
	//	A3 a = new A3(); ==> A3의 생성자를 private로 할 경우 선언이 안된다.
		A3.plus(10, 20);
		Math.abs(1);
	//	Math a = new Math(); ==> 마찬가지로 Math 클래스 또한 생성자가 private로 되 어 있다.
	//  System sss = new System; ==> System 도 마찬가지
		
		
	}

}

class A3{
	public A3() {
		
	}
	public static int plus(int a, int b) {
		return a+b;
	}
	
}


public class P10_인터페이스 {

	public static void main(String[] args) {
		//Xxx ref = null; ==> 가능
		//Xxx ref = new Xxx(); ==> 불가능
		
		Xxx ref = new AA();
		ref.method();
	}	

}

interface Xxx{ //interface는 상속받는 용도 
	//interface의 용도 : 표준을 맞추고 선언한다.
	public void method();
	//public abstract void method();
	//인터페이스에서는 abstract 가 기본으로 붙는다 (생략하고 적어도 무조건 abstract 이다)
}

class AA implements Xxx{
	
	//오버라이딩
	public void method() {
		System.out.println("안녕하세요");
	}
	
}
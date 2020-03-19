
public class P08_상속_다형성_오버라이딩 {
	public static void main(String[] args) {
	//상속_다형성_오버라이딩 => 인터페이스
		B ref = new B(); //상속
		ref.v2 = 10;
		 
		A ref1 = new B(); //다형성
		ref1.v1 = 10;
		//ref1.v2 ==> 접근 불가
		
		ref.method3();//메소드 오버라이딩
		//결과 : "B의 메소드 호출"
	}
}
//====================================================
class A{
	public int v1;
	public void method1() {
		System.out.println("안녕하세요");

	}
	
	public void method3() {
		System.out.println("A 의 메소드");
	}
}

class B extends A{ //B 라는 클래스는 A를 상속받겠다.
	public int v2;
	public void method2() {
		System.out.println("반갑습니다");
	}
	
	//오버라이딩 (메소드 재 정의)
	public void method3() {
		System.out.println("B의 메소드 호출");
	}
	
}
//=====================================================




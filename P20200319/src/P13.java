
public class P13 {
	public static void main(String[] args) {
		
	}
}
//========================================================================

final class AAA{
} //final 이 붙은 클래스는 상속 받는 것 이 불가능 하다.

//class BB extends AAA{ //오류
class BB{

}
//========================================================================

// class TT extends System{ ==> System 클래스 또한 상속받을 수 없다.
class TT {	

}
//========================================================================

//class C1 extends C2, C3{
class C1 extends C2{ // Java 는 class 의 다중상속이 불가능 하다.	
}
class C2{
}
class C3{	
}
//========================================================================

class T_test implements I1, I2{} // interface 는 다중상속이 가능하다.
interface I1{}
interface I2{}

//========================================================================


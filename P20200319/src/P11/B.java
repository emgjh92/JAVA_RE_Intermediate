package P11;

public class B {

	public static void main(String[] args) {
		Call c = new Call();
		
		A_Mod m = new A_Mod();
		m.testMod(c);
	}

}

class Call implements CallBackFunc{
	public void call() {
		System.out.println("반가워요. B 입니다.");
	}
}

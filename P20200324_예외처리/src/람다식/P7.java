package 람다식;

public class P7 {
public static void main(String[] args) {
	
	/*
	Callable x = new Callable() {
		int a = 10;
		public void call() {
			System.out.println("아주 간단한 코드...");
			this.a = 20;
		}
	};
	*/
	
	//람다식....
	Callable x = (a, str)->{
		System.out.println("아주 간단한 코드");
		System.out.println(a);
		System.out.println(str);
	};
	x.call(10,"aaa");
}	
}

interface Callable{
	public void call(int a, String str);
	
}
//안드로이드 프로그램의 경우 람다식이 종종 쓰이곤 한다...근데 할일이 많다면 람다식은 쓰지 말아야 하며,
//람다식은 코드의 "간결함"을 위해서 쓰인다.
/*
class Test3 implements Callable{
	public void call() {
		System.out.println("무언가 아주~~~~간단한 코드");
	}
}
*/
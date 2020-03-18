
public class P18 {

	public static void main(String[] args) {
		//method 를 static으로 한다면?
		int v1 = 10;
		int v2 = 20;
		
		Calc c1 = new Calc();
		int result = Calc.plus(v1, v2);
		System.out.println(result);
		
	}
}


class Calc{
	
	static int plus(int a, int b) {
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
}

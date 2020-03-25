package 예외처리;

public class P4_throws {

	public static void main(String[] args) {
		try {
			new Test().method1();
		}catch(Exception e){
			
		}
		System.out.println("메인 나머지 코드들....");
	}

}


class Test{
	void method1() throws Exception{
		String str = null;
		System.out.println(str.charAt(0)); //NullPointerException
		//throws 를 쓸 경우 예외 처리를 상위로 던져버릴 수 (throws) 있다.
		//하지만 throws 를 쓸 경우 반드시 넘겨 받은 쪽에선 try, catch로 예외처리를 해 주어야만 한다.
		//만약 main 에서 한번 더 throws 를 하게 되면 JVM 이 받아서 자동으로 처리하게 된다.
	}
	
}



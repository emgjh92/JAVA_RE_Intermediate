package 예외처리;

public class P3_Exception처리_세부 {
	public static void main(String[] args) {
		try{
			int a = 10;
			int b = 20;
			String str = null;
			
			int result = a/b; //Exception 1 발생(ArithmeticException)
			
			System.out.println(result);
			System.out.println(str.charAt(0)); //Exception 2 발생(NullPointerException)
			
	
			System.out.println("나머지 코드들...");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 예외 처리 코드...");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 예외 처리 코드...");
		}catch(Exception e) {
			System.out.println("나머지 예외처리 코드");
			//ArithmeticException , NullPointerException 외에 나머지 Exception 일 경우
		}
		
	}
}

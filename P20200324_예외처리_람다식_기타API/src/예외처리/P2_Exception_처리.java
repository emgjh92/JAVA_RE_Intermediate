package 예외처리;

public class P2_Exception_처리 {

	public static void main(String[] args) {
		
		String str1 = "안녕하세요";
		System.out.println(str1.charAt(0));
		
		//String str2 = null;
		//System.out.println(str2.charAt(0)); //java.lang.NullPointerException
		
		/*
		int [] arr = new int[30];
		arr[0] = 1;
		arr[10000] = 10; //ArrayIndexOutOfBoundsException: 10000
		*/
		try {
			int [] arr = new int[30];
			arr[0] = 1;
			arr[10000] = 10;
			//이 지점에서 Exception 발생
			System.out.println("aaaaa"); //Exception 발생 시 try 문 안의 다음 코드들은 실행되지 않는다. 
		}catch(Exception e){
			System.out.println("에러 발생");
			return;
		}finally {
			System.out.println("안녕하세요"); 
			//finally 문 안의 명령어는 항상 실행된다.
			//catch 에 return;을 넣으면 method (여기선 main 메소드)가 종료 된다.
			//하지만 finally 의 경우 밑의 "이후에 실행될 코드들..."과 달리 method 가 종료 되더라도 반드시 실행된다.
		}
		
		System.out.println("이후에 실행될 코드들....");

		
	}

}

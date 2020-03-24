package JAVA_API;

public class P11_ClassforName {
public static void main(String[] args) {
	//class라는 이름을 가진 class
	
	try {
		Class.forName("java.lang.String"); 
		//외부에서 이 라이브러리가 있는지 없는지 체크하는 용도
		//(현재 코드에선 java.lang.String 이 동적으로 로드시 존재하므로 Exception이 발생하지 않는다)
		//Class.forName("oracle.jdbc.DBConnector");
		//이 라이브러리가 없는 것을 확인 가능하다.

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("Hello");
}
}

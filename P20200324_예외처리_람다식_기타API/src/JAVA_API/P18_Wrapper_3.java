package JAVA_API;

public class P18_Wrapper_3 {
public static void main(String[] args) {
	Integer a = 10;
	Integer b = new Integer(10);
	
	if (a==b) {
		System.out.println("같다");
		}
	else {
		System.out.println("다르다");
		}
	/*	
	Integer a = 10;
	Integer b = new Integer(10);
	의 경우엔 다르다가
	
	Integer a = 10;
	Integer b = 10;
	의 경우엔 같다가 나온다
	*/
	
}
}

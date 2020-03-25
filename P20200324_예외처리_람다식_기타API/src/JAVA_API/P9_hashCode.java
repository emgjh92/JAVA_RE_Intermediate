package JAVA_API;

public class P9_hashCode {
	public static void main(String[] args) {
		BBB b = new BBB();
		int value = b.hashCode();
		
		System.out.println(value); //결과값 : 366712642
		System.out.println(b); //결과값 : JAVA_API.BBB@15db9742
		
		
		String str = "안녕하세요";
		System.out.println(str.hashCode()); //결과값 : 803356551
		
		String str2 = new String("안녕하세요");
		System.out.println(str2.hashCode()); //결과값 : 803356551
		//===> str과 str2 의 Object 안에 있는 "문자열" 값을 가지고 hashcode를 생성함을 알 수 있다.
		//==> 메모리 값을 가지고 hashcode를 만들었다면 둘의 hashcode가 달랐을 것이다.
		
	}
}

class BBB{
	
}
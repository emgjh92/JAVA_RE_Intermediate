
public class P8 {
public static void main(String[] args) {
	String str1 = "안녕하세요";
	String str2 = new String("안녕하세요");
	
	System.out.println(str1);
	System.out.println(str2);
	
	if(str1 == str2) {
		System.out.println("두 값이 같다.");
	}else {
		System.out.println("두 값이 다르다"); //결과 : 두 값이 다르다
	}
	/*
	 str2 를 new 를 안쓰고 비교한 경우 
	 str1 과 str2의 주소값이 같아진다 (둘이 동일한 주소 도착지를 간진다)
	 하지만 요번 예제의 경우 (new String()을 쓴 경우)
	 주소 할당 자체를 "새로운 공간에 생성하게 되므로" (new 의 역할이 이거다)
	 if 문으로 비교한 것이 다른 값이라고 출력된다.
	 
	 String 은 "참조 변수" (메모리 주소값을 참조하는 변수) 이다.
	 */
	
	if(str1.equals(str2)) {
		System.out.println("euqals_두 값이 같다.");
	}else {
		System.out.println("equals_두 값이 다르다");
	}//결과값 : euqals_두 값이 같다.
	
	/*
	 두 문자의 주소값 비교가 아니라 진짜 담긴 문자열 끼리 비교하려면 
	 equals 라는 api를 쓰면 된다.
	 ==> 문자열 비교할때는 무조건 equals 를 쓰자
	 */
}
}

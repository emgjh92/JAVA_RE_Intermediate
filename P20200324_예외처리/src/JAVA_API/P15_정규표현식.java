package JAVA_API;

import java.util.regex.Pattern;

public class P15_정규표현식 {
public static void main(String[] args) {
	String str = "1q2q22q@qqq.qqq";
	
	if(Pattern.matches("[a-z][a-z0-9]{5,8}@[a-z]+.[a-z]+", str)) {
		//첫번째 글자는 a~z 사이의 문자이며, @앞은 5~8자리의 이메일 주소, 뒤에는 a~z.a~z 형식의 주소
		
		//	if(Pattern.matches("[0-9]+", str)) ==> 0~9 까지 적어도 하나는 부합하는 경우
		//	if(Pattern.matches("[0-9a-zA-Zㄱ-ㅎ가-하]+", str))

		System.out.println("패턴에 부합합니다.");
	}else {
		System.out.println("아닙니다.");
	}
	
	/*
	정규 표현식 자주 쓰이는 패턴 : 
	https://jwkim96.tistory.com/96
	*/
	
}
}

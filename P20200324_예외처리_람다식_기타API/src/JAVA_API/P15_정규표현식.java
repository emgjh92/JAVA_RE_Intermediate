package JAVA_API;

import java.util.regex.Pattern;

public class P15_����ǥ���� {
public static void main(String[] args) {
	String str = "1q2q22q@qqq.qqq";
	
	if(Pattern.matches("[a-z][a-z0-9]{5,8}@[a-z]+.[a-z]+", str)) {
		//ù��° ���ڴ� a~z ������ �����̸�, @���� 5~8�ڸ��� �̸��� �ּ�, �ڿ��� a~z.a~z ������ �ּ�
		
		//	if(Pattern.matches("[0-9]+", str)) ==> 0~9 ���� ��� �ϳ��� �����ϴ� ���
		//	if(Pattern.matches("[0-9a-zA-Z��-����-��]+", str))

		System.out.println("���Ͽ� �����մϴ�.");
	}else {
		System.out.println("�ƴմϴ�.");
	}
	
	/*
	���� ǥ���� ���� ���̴� ���� : 
	https://jwkim96.tistory.com/96
	*/
	
}
}

package JAVA_API;

import java.util.ArrayList;

public class P8_Object_Override {
public static void main(String[] args) {
	
	//Object ref = new AAA();
	AAA ref1 = new AAA();
	ref1.v1 = 10;
	ref1.v2 = 20;
	
	AAA ref2 = new AAA();
	ref2.v1 = 10;
	ref2.v2 = 20;
	
	if(ref1 == ref2) {
		System.out.println("같다.");
	}
	else {
		System.out.println("다르다");
	} //결과값 : "다르다"
	
	
	if(ref1.equals(ref2)) {
		System.out.println("같다.");
	}
	else {
		System.out.println("다르다");
	} //결과값 : "다르다" (Object 의 equals 를 오버라이딩 하기 전)
	  //결과값 : "같다" (Object 의 equals 를 오버라이딩 한 후)
	
	System.out.println(ref1); // 결과값 : JAVA_API.AAA@15db9742 (toString을 오버라이딩 하지 않은 경우)
	String str = ref1.toString();
	System.out.println(str); // 결과값 : JAVA_API.AAA@15db9742 (toString을 오버라이딩 하지 않은 경우)
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(40);
	list.add(30);
	
	System.out.println(list);
	
	}
}

class AAA extends Object{ 
	//모든 class 는 Object class 를 기본적으로 상속 받으므로 생략해도 무방하다. 
	int v1;
	int v2;
	
	//Object 의 equals 를 오버라이딩
	public boolean equals(Object xx) {
		AAA temp = (AAA)xx; //type casting
		
		if(this.v1 == temp.v1 && this.v2 == temp.v2) {
			return true;
		}
		
		return false;
	}
	/*
	public String toString() {//Object 의 toString() 을 오버라이딩
		return "v1 : " + v1 + ",v2 : " + v2;
	}
	*/

	@Override
	public String toString() {
		return "AAA [v1=" + v1 + ", v2=" + v2 + "]";
	}
	
}
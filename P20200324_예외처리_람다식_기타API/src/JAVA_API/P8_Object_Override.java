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
		System.out.println("����.");
	}
	else {
		System.out.println("�ٸ���");
	} //����� : "�ٸ���"
	
	
	if(ref1.equals(ref2)) {
		System.out.println("����.");
	}
	else {
		System.out.println("�ٸ���");
	} //����� : "�ٸ���" (Object �� equals �� �������̵� �ϱ� ��)
	  //����� : "����" (Object �� equals �� �������̵� �� ��)
	
	System.out.println(ref1); // ����� : JAVA_API.AAA@15db9742 (toString�� �������̵� ���� ���� ���)
	String str = ref1.toString();
	System.out.println(str); // ����� : JAVA_API.AAA@15db9742 (toString�� �������̵� ���� ���� ���)
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(40);
	list.add(30);
	
	System.out.println(list);
	
	}
}

class AAA extends Object{ 
	//��� class �� Object class �� �⺻������ ��� �����Ƿ� �����ص� �����ϴ�. 
	int v1;
	int v2;
	
	//Object �� equals �� �������̵�
	public boolean equals(Object xx) {
		AAA temp = (AAA)xx; //type casting
		
		if(this.v1 == temp.v1 && this.v2 == temp.v2) {
			return true;
		}
		
		return false;
	}
	/*
	public String toString() {//Object �� toString() �� �������̵�
		return "v1 : " + v1 + ",v2 : " + v2;
	}
	*/

	@Override
	public String toString() {
		return "AAA [v1=" + v1 + ", v2=" + v2 + "]";
	}
	
}
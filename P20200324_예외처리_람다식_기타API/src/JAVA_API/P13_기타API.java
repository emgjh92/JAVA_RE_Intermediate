package JAVA_API;

public class P13_��ŸAPI {
public static void main(String[] args) {
	String str = "�ȳ��ϼ���\n�ݰ����ϴ�\n�ߺ�Ź....";
	System.out.println(str);
	
	String temp = str.replace("\n", "<br>"); //���ڿ� ��ü
	System.out.println(temp);
	
	//========================================================
	
	String str2 = " �� ����   ";
	System.out.println("<"+str2+">");
	String temp2 = str2.trim(); // trim(); : ���� ����
	System.out.println("<"+temp2+">");
	
	//========================================================
	
	String str3 = "abCDeF";
	System.out.println(str3);
	String temp3 = str3.toUpperCase();
	System.out.println(temp3); 
	temp3 = str3.toLowerCase();
	System.out.println(temp3);
	// toUpperCase(); : �ϴ� �빮�ڷ�
	// toLowerCase(); : �ϴ� �ҹ��ڷ�
	/*
	 ����� :
	 abCDeF
     ABCDEF
	 */
	
	//========================================================
	String str4 = "�ȳ��ϼ���,�ݰ����ϴ�,�ߺ�Ź�����";
	String [] datas = str4.split(",");
	System.out.println(datas[0]);
	System.out.println(datas[1]);
	System.out.println(datas[2]);


}
}

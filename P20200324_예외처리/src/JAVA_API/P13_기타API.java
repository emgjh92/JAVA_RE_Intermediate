package JAVA_API;

public class P13_기타API {
public static void main(String[] args) {
	String str = "안녕하세요\n반갑습니다\n잘부탁....";
	System.out.println(str);
	
	String temp = str.replace("\n", "<br>"); //문자열 대체
	System.out.println(temp);
	
	//========================================================
	
	String str2 = " 박 지성   ";
	System.out.println("<"+str2+">");
	String temp2 = str2.trim(); // trim(); : 공백 제거
	System.out.println("<"+temp2+">");
	
	//========================================================
	
	String str3 = "abCDeF";
	System.out.println(str3);
	String temp3 = str3.toUpperCase();
	System.out.println(temp3); 
	temp3 = str3.toLowerCase();
	System.out.println(temp3);
	// toUpperCase(); : 싹다 대문자로
	// toLowerCase(); : 싹다 소문자로
	/*
	 결과값 :
	 abCDeF
     ABCDEF
	 */
	
	//========================================================
	String str4 = "안녕하세요,반갑습니다,잘부탁드려요";
	String [] datas = str4.split(",");
	System.out.println(datas[0]);
	System.out.println(datas[1]);
	System.out.println(datas[2]);


}
}

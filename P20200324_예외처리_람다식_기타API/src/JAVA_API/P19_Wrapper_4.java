package JAVA_API;

public class P19_Wrapper_4 {
public static void main(String[] args) {
	int a = Integer.parseInt("100");
	System.out.println(a);
	//결과값 : 100
	String str = "FFD177";
	a = Integer.parseInt(str, 16); //16진수 표현
	System.out.println(a);
	//결과값 : 16765303
	
	int v1 = 1000;
	String bin = Integer.toBinaryString(v1); //바이너리 코드로 나타내기
	System.out.println(bin); //결과값 : 1111101000
	}
}

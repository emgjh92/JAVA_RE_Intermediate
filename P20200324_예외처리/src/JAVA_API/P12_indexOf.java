package JAVA_API;

public class P12_indexOf {
public static void main(String[] args) {
	String str = "aaeesseee.txt";
	int commaIndex = str.indexOf(".");
	//int commaIndex = str.lastIndexOf(".");
	String ext = str.substring(commaIndex);
	
	
	System.out.println(ext); 
	System.out.println(str);
	/*
	°á°ú°ª :
	.txt
	aaeesseee.txt
	*/
}
}

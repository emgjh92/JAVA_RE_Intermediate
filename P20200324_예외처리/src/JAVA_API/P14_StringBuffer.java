package JAVA_API;

public class P14_StringBuffer {

	public static void main(String[] args) {
		/*
		String str = "æ»≥Á«œººø‰";
		
		for(int i=0; i<5; i++) {
			str += i;
		}
		
		System.out.println(str);
		*/
		
		//StringBuffer str = new StringBuffer("æ»≥Á«œººø‰");
		StringBuffer str = new StringBuffer(100);
		str.append("æ»≥Á«œººø‰");
		
		for(int i=0; i<5; i++) {
			str.append(i);
		}
		System.out.println(str);
		
	}

}

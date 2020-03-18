
public class P5 {
	public static void main(String[] args) {
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3 = v1;
		//v1 = v3; //error (byte 값이 int 보다 훨씬 표현 범위가 작다) 
		v1 = (byte)v3;
		v3 = (int)v1;
		
		double v5 = 3.333;
		int v6 = (int)v5; //강제 형변환의 경우 메모리의 손실 (논리적 값의 손실)이 이루어 질 수 밖에 없다.
		
		int v7 = 5;
		double v8 = v7; //물론 반대는 가능하다. (논리적 값의 손실이 없다)
	}
}

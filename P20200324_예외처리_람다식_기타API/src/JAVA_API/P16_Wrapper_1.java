package JAVA_API;

public class P16_Wrapper_1 {

	public static void main(String[] args) {
		//Wrapper (포장 객체)
		
		//int a = 10;
		Integer b = 10;
		Integer c = 10;
		Integer result = b + c; //결과값 : 20
		//쓰면 안되는 문법유형 (참조주소 + 참조주소 이므로 말이 안되지만, java에선 봐주는 형식)
		//Integer 로 했을 때 제대로 나오는 이유는, Integer가 자동형변환을 지원하기 때문
		//참조타입은 연산 용도로 쓰는거 아니다!
		
		
		System.out.println(result);
		
		int v1 = 10;
		Integer v2 = v1;
		
		Integer v3 = 20;
		int v4 = v3;
	}

}

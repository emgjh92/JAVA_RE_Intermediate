
public class P1 {

	public static void main(String[] args) {
		
		{
			int a = 10;
			a=20;
			System.out.println(a);
		} // {} (scope)를 따로 설정 시 변수에 할당된 메모리가 스코프가 끝날 때 소멸 됨
		
		int a = 40;
		System.out.println(a);
		System.out.println("무언가 코드....");
		
	}

}

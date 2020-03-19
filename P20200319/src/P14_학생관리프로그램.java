import java.util.*;

public class P14_학생관리프로그램 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("========메뉴========");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("Q. 종료");
			System.out.print("입력 > ");
			String value = scn.nextLine();
			
			if(value.equals("Q")) {
				break;
			}
			
			if(value.equals("1")) {}
			else if(value.equals("2")) {}
			else if(value.equals("3")) {}
			else {System.out.println("정상적인 값을 입력해 주싶시오");}

		}
		
		System.out.println("이용해 주셔서 감사합니다.");
		
	}

}

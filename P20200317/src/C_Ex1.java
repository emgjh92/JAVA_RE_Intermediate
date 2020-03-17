
public class C_Ex1 {
	public static void main(String[] args) {
		
		int score = 77;
		//score가 95이상이면 A+를 출력하고 90이상이면 A를 출력하고
		//85이상이면 B+를 출력하고 80이상이면 B를 출력하자
		//그외의 경우 F를 출력하자
		
		if(score>=95) {
			System.out.println("A+");
		}else if(score>=90) {
			System.out.println("A");
		}else if(score>=85) {
			System.out.println("B+");
		}else if(score>=80) {
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		
	//=======================다른 케이스===============================	
		
		if(score>=90) {
			if(score>=95) {
				System.out.println("A");
			}else {
				System.out.println("A");
			}
		}else if(score>=80) {
			if(score>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else {
			System.out.println("F");
		}
	}
}

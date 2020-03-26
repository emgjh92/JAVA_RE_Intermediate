package 네트워크프로그래밍1;
import java.awt.Toolkit;

public class P2_멀티스레드_비적용 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("반갑습니다.");
		}
		
		//안녕하세요 와 반갑습니다 를 동시에 실행시키려면? = 멀티 스레드
		//==>P3 파일을 참조하자
		
	}
}

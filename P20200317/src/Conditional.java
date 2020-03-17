public class Conditional {
	public static void main(String[] args) {
		
		int v1 = 10;
		
		if(v1>20) { //if의 조건엔 무조건 true 아니면 false 만 들어가야 한다.
			System.out.println("10이 20보다 큽니다.");
		}
		
		if(v1 > 5) {
		System.out.println("v1이 5보다 큽니다");
		}else {
			System.out.println("v1이 5보다 작습니다");
		}
		
		if(v1 > 30) {
			System.out.println("v1이 30 보다 큽니다");
		}else if(v1 > 20) {
			System.out.println("v1이 30이하이고,v1이 20보다 큽니다");
		}else if(v1 > 10) {
			System.out.println("v1은 30보다 크지 않고, 20보다 크지 않고, 10보다 큽니다");
		}else {
			System.out.println("그 외의 경우");
		}
	}
}

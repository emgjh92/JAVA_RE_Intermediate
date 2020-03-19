
public class P09_상속_다형성_오버라이딩 {

	public static void main(String[] args) {
		/*
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		SCV s3 = new SCV();
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		Tank t3 = new Tank();
		Tank t4 = new Tank();
		*/
		
		//다형성
		/*
		Unit m1 = new Marine();
		Unit m2 = new Marine();
		Unit m3 = new Marine();
		
		Unit s1 = new SCV();
		Unit s2 = new SCV();
		Unit s3 = new SCV();
		
		Unit t1 = new Tank();
		Unit t2 = new Tank();
		Unit t3 = new Tank();
		Unit t4 = new Tank();
		*/
		
		//다형성 - 배열로 
		Unit [] arr = new Unit[10];
		
		arr [0] = new Marine();
		arr [1] = new Marine();
		arr [2] = new Marine();	
		
		arr [3] = new Tank();
		arr [4] = new Tank();
		arr [5] = new Tank();
		
		arr [6] = new SCV();
		arr [7] = new SCV();
		arr [8] = new SCV();	
		arr [9] = new SCV();	
		
		//이동 명령...
		for (int i = 0; i< arr.length; i++) {
			arr[i].move();
		}
		// 만약 move 가 SCV, 마린, 탱크가 각각 다르다면 ? ==> 오버라이딩
		
		//멈춘다...
		for (int i = 0; i< arr.length; i++) {
			arr[i].stop(); //모든 유닛이 동일한 동작으로 stop를 하는 경우 
		}
		
		//스팀팩 (마린만의 특수 기능) 사용 
		for (int i = 0; i< arr.length; i++) {
			
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i]; //강제 형 변환
				m.useSteamPack();
			}
			//instanceof를 통해 마린 인 경우만에 적용
		}
		
		
		
	}

}

abstract class Unit{ 
	/*
	 * abstract : 앞으로 Unit 는 생성은 못하고, 상속을 위한 클래스(용도)로만 쓴다. = "추상화"
	 */
	public int hp;
	public int speed;
	public int ap;
	
	public abstract void move(); 
	//abstract (추상화) 가 붙으면 선언만 하고 구현은 하면 안된다.
	//abstract의 용도 : 오버라이딩 용이다.
	
	public void stop(){
		System.out.println("유닛이 멈춥니다.");
	}
	
	public void attack() {
		System.out.println("유닛이" + ap + "로 공격합니다.");
	}
}
class SCV extends Unit{
	public SCV(){
		this.hp = 40;
		this.speed = 3;
		this.ap = 5;
	}
	
	//오버라이딩
	public void move() {
		System.out.println("SCV가 "+speed+"로 움직입니다.");
	}
}
class Marine extends Unit{
	public Marine() {
		this.hp = 50;
		this.speed = 4;
		this.ap = 10;
	}
	//오버라이딩
	public void move() {
		System.out.println("마린이 "+speed+"로 움직입니다.");
	}
	
	public void useSteamPack() {
		//마린에만 있는 특수 기능 '스팀팩'
		System.out.println("마린이 스팀팩을 사용합니다.");
		hp -= 10;
		ap += 20;
		speed += 3;
	}
}
class Tank extends Unit{
	public Tank() {
		this.hp = 200;
		this.speed = 10;
		this.ap = 20;
	}
	//오버라이딩
	public void move() {
		System.out.println("탱크가 "+speed+"로 움직입니다.");
	}
}
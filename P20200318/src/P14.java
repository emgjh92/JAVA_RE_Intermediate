
public class P14 {

	public static void main(String[] args) {
		//Car c1 = new Car();
		//c1.name = "아반테";
		//c1.speed = 100;
		Car c1 = new Car(100,"아반테");
		c1.speedUp(30);
		c1.run();
		int speed = c1.getCurrentSpeed();
		System.out.println(speed);
	}

}

class Car{
	//~~~~~~~~~~~~~~~~~~속성....변수....~~~~~~~~~~~~~~~~~~
	int speed;
	String name;
	
	//~~~~~~~~~~~~~~~~~~생성자~~~~~~~~~~~~~~~~~~
	Car(int speed, String name){ //new를 썼을 때 딱 한번 자동으로 호출됨
		//System.out.println(speed);
		this.speed = speed;
		//this : 실행시키는 주체를 의미
		this.name = name;
		
		//생성자의 필요이유 :
		//Car c1 = new Car(); 요거 하기가 번거로움 (바로 셋팅하기 위해)
	}
	
	//~~~~~~~~~~~~~~~~~~메소드~~~~~~~~~~~~~~~~~~
	void run() {
		System.out.println(name+"가 달립니다");
		//적어도 맴버 변수를 한번은 사용을 하는게 좋다. (함수의 명확성을 위해)
		//메소드 = "객체"의 "행위" = 근데 맴버 변수를 사용하지 않는다? 말이 안됨
	}
	
	void speedUp(int value) {
		this.speed += value;
	}
	
	int getCurrentSpeed() {
		return speed;
	}
	
}

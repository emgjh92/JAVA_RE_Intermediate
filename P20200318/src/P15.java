
public class P15 {

	public static void main(String[] args) {

		AutoCar c2 = new AutoCar(1);
		AutoCar c3 = new AutoCar(1,"adaw");
		//Car c4 = new Car(1,"adaw",1);
		c3.speedUp(1);
		c3.speedUp("1");

	}

}

class AutoCar{
	//~~~~~~~~~~~~~~~~~~속성....변수....~~~~~~~~~~~~~~~~~~
	int speed;
	String name;
	
	//~~~~~~~~~~~~~~~~~~생성자~~~~~~~~~~~~~~~~~~
	AutoCar(int speed, String name){ 
		this.speed = speed;
		this.name = name;
	}
	//메소드 오버로딩
	AutoCar(int speed){
	this.speed = speed;
	}
	
	//~~~~~~~~~~~~~~~~~~메소드~~~~~~~~~~~~~~~~~~
	void run() {
		System.out.println(name+"가 달립니다");
	}
	
	void speedUp(int value) {
		this.speed += value;
	}
	
	//메소드 오버로딩
	void speedUp(String value) {
		
	}
	
	int getCurrentSpeed() {
		return speed;
	}
	
}

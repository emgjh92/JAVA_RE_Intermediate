
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
	//~~~~~~~~~~~~~~~~~~�Ӽ�....����....~~~~~~~~~~~~~~~~~~
	int speed;
	String name;
	
	//~~~~~~~~~~~~~~~~~~������~~~~~~~~~~~~~~~~~~
	AutoCar(int speed, String name){ 
		this.speed = speed;
		this.name = name;
	}
	//�޼ҵ� �����ε�
	AutoCar(int speed){
	this.speed = speed;
	}
	
	//~~~~~~~~~~~~~~~~~~�޼ҵ�~~~~~~~~~~~~~~~~~~
	void run() {
		System.out.println(name+"�� �޸��ϴ�");
	}
	
	void speedUp(int value) {
		this.speed += value;
	}
	
	//�޼ҵ� �����ε�
	void speedUp(String value) {
		
	}
	
	int getCurrentSpeed() {
		return speed;
	}
	
}

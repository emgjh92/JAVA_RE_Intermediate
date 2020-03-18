
public class P14 {

	public static void main(String[] args) {
		//Car c1 = new Car();
		//c1.name = "�ƹ���";
		//c1.speed = 100;
		Car c1 = new Car(100,"�ƹ���");
		c1.speedUp(30);
		c1.run();
		int speed = c1.getCurrentSpeed();
		System.out.println(speed);
	}

}

class Car{
	//~~~~~~~~~~~~~~~~~~�Ӽ�....����....~~~~~~~~~~~~~~~~~~
	int speed;
	String name;
	
	//~~~~~~~~~~~~~~~~~~������~~~~~~~~~~~~~~~~~~
	Car(int speed, String name){ //new�� ���� �� �� �ѹ� �ڵ����� ȣ���
		//System.out.println(speed);
		this.speed = speed;
		//this : �����Ű�� ��ü�� �ǹ�
		this.name = name;
		
		//�������� �ʿ����� :
		//Car c1 = new Car(); ��� �ϱⰡ ���ŷο� (�ٷ� �����ϱ� ����)
	}
	
	//~~~~~~~~~~~~~~~~~~�޼ҵ�~~~~~~~~~~~~~~~~~~
	void run() {
		System.out.println(name+"�� �޸��ϴ�");
		//��� �ɹ� ������ �ѹ��� ����� �ϴ°� ����. (�Լ��� ��Ȯ���� ����)
		//�޼ҵ� = "��ü"�� "����" = �ٵ� �ɹ� ������ ������� �ʴ´�? ���� �ȵ�
	}
	
	void speedUp(int value) {
		this.speed += value;
	}
	
	int getCurrentSpeed() {
		return speed;
	}
	
}

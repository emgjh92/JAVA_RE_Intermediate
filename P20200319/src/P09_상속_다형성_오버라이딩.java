
public class P09_���_������_�������̵� {

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
		
		//������
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
		
		//������ - �迭�� 
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
		
		//�̵� ���...
		for (int i = 0; i< arr.length; i++) {
			arr[i].move();
		}
		// ���� move �� SCV, ����, ��ũ�� ���� �ٸ��ٸ� ? ==> �������̵�
		
		//�����...
		for (int i = 0; i< arr.length; i++) {
			arr[i].stop(); //��� ������ ������ �������� stop�� �ϴ� ��� 
		}
		
		//������ (�������� Ư�� ���) ��� 
		for (int i = 0; i< arr.length; i++) {
			
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i]; //���� �� ��ȯ
				m.useSteamPack();
			}
			//instanceof�� ���� ���� �� ��츸�� ����
		}
		
		
		
	}

}

abstract class Unit{ 
	/*
	 * abstract : ������ Unit �� ������ ���ϰ�, ����� ���� Ŭ����(�뵵)�θ� ����. = "�߻�ȭ"
	 */
	public int hp;
	public int speed;
	public int ap;
	
	public abstract void move(); 
	//abstract (�߻�ȭ) �� ������ ���� �ϰ� ������ �ϸ� �ȵȴ�.
	//abstract�� �뵵 : �������̵� ���̴�.
	
	public void stop(){
		System.out.println("������ ����ϴ�.");
	}
	
	public void attack() {
		System.out.println("������" + ap + "�� �����մϴ�.");
	}
}
class SCV extends Unit{
	public SCV(){
		this.hp = 40;
		this.speed = 3;
		this.ap = 5;
	}
	
	//�������̵�
	public void move() {
		System.out.println("SCV�� "+speed+"�� �����Դϴ�.");
	}
}
class Marine extends Unit{
	public Marine() {
		this.hp = 50;
		this.speed = 4;
		this.ap = 10;
	}
	//�������̵�
	public void move() {
		System.out.println("������ "+speed+"�� �����Դϴ�.");
	}
	
	public void useSteamPack() {
		//�������� �ִ� Ư�� ��� '������'
		System.out.println("������ �������� ����մϴ�.");
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
	//�������̵�
	public void move() {
		System.out.println("��ũ�� "+speed+"�� �����Դϴ�.");
	}
}

public class P5 {
	public static void main(String[] args) {
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3 = v1;
		//v1 = v3; //error (byte ���� int ���� �ξ� ǥ�� ������ �۴�) 
		v1 = (byte)v3;
		v3 = (int)v1;
		
		double v5 = 3.333;
		int v6 = (int)v5; //���� ����ȯ�� ��� �޸��� �ս� (���� ���� �ս�)�� �̷�� �� �� �ۿ� ����.
		
		int v7 = 5;
		double v8 = v7; //���� �ݴ�� �����ϴ�. (���� ���� �ս��� ����)
	}
}

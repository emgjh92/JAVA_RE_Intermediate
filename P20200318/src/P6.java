
public class P6 {

	public static void main(String[] args) {
		
		byte v1 = 10;
		byte v2 = 10;
		/*
		byte result = v1 + v2; //!!!error!!!
		//Type mismatch: cannot convert from int to byte
		//��� ������ �������� (���� ���ÿ��� ���ϱ�) int ������ ��ȯ ��Ű�� ������
		//������� int + int = int �� �ǹǷ� byte �� v2�� ���� ���� ���� �ȴ�.
		*/
		byte result = (byte)(v1 + v2);
		
		int v3 = 10;
		int v4 = 20;
		int v5 = v3 + v4;
	}

}

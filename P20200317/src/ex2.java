
public class ex2 {
public static void main(String[] args) {
	//2���� 100000������ �Ҽ��� ���غ��� (�迭�� �̿��ؼ�)
	//�����佺�׳׽��� ü
	
	long time = System.currentTimeMillis(); //�ð�����
	
	int [] arrValue   = new int [99999];
	
	for(int i = 0; i < 99999; i++) {
		arrValue[i] = i+2;
	} //�迭 ����
	
	for(int i = 0; i < 99999; i++) {
		if(arrValue[i] != -1) {
			System.out.println(arrValue[i]+"�� �Ҽ� �Դϴ�");
			for(int x=i+1; x<99999; x++) {
				if(arrValue[x]%arrValue[i] == 0) {
					arrValue[x] = -1; 
				}
			}
		}
		
	}
	time = System.currentTimeMillis() - time; //�ð� ����
	System.out.println("����ð� : " + time);
}
}

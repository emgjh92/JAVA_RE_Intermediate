
public class ex1 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis(); //�ð�����

		//2���� 100000������ �Ҽ��� ���غ���
		for(int x =2; x<=99999; x++) {
			boolean isPrime = true;
			for(int y = 2; y<Math.sqrt(x); y++) {
				if(x%y==0) { //Math.sqrt(x) ==> ��Ʈ ����� (�����ս� ���)
					isPrime = false;
					break;
				}
			}
			if(isPrime=true) {
				System.out.println(x +"�� �Ҽ�"); 
			}
		}
		
		time = System.currentTimeMillis() - time; //�ð� ����
		System.out.println("����ð� : " + time);
		
	}

}

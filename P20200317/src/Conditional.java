public class Conditional {
	public static void main(String[] args) {
		
		int v1 = 10;
		
		if(v1>20) { //if�� ���ǿ� ������ true �ƴϸ� false �� ���� �Ѵ�.
			System.out.println("10�� 20���� Ů�ϴ�.");
		}
		
		if(v1 > 5) {
		System.out.println("v1�� 5���� Ů�ϴ�");
		}else {
			System.out.println("v1�� 5���� �۽��ϴ�");
		}
		
		if(v1 > 30) {
			System.out.println("v1�� 30 ���� Ů�ϴ�");
		}else if(v1 > 20) {
			System.out.println("v1�� 30�����̰�,v1�� 20���� Ů�ϴ�");
		}else if(v1 > 10) {
			System.out.println("v1�� 30���� ũ�� �ʰ�, 20���� ũ�� �ʰ�, 10���� Ů�ϴ�");
		}else {
			System.out.println("�� ���� ���");
		}
	}
}

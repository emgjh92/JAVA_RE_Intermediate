
public class C_Ex1 {
	public static void main(String[] args) {
		
		int score = 77;
		//score�� 95�̻��̸� A+�� ����ϰ� 90�̻��̸� A�� ����ϰ�
		//85�̻��̸� B+�� ����ϰ� 80�̻��̸� B�� �������
		//�׿��� ��� F�� �������
		
		if(score>=95) {
			System.out.println("A+");
		}else if(score>=90) {
			System.out.println("A");
		}else if(score>=85) {
			System.out.println("B+");
		}else if(score>=80) {
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		
	//=======================�ٸ� ���̽�===============================	
		
		if(score>=90) {
			if(score>=95) {
				System.out.println("A");
			}else {
				System.out.println("A");
			}
		}else if(score>=80) {
			if(score>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		}else {
			System.out.println("F");
		}
	}
}

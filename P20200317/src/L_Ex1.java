
public class L_Ex1 {

	public static void main(String[] args) {
		
		//1.for���� �̿��ؼ� 1���� 76���� ���� ���ϴ� �ڵ带 �ۼ�����
		int sum=0;
		for(int i=1; i<=76; i++) {
			//System.out.println(sum+"���ϱ�"+i);
			sum=sum+i;
		}
		System.out.println("result is "+sum);
		//2. �������� ����� ����
		int ga = 1;
		while(ga<10) {
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga+"x"+i+"="+(ga*i));
		}
		ga++;
		}
		//3.�Ǻ���ġ(Fibonnaci) ����(���)�� ���� �� ���� ���ؼ� 
		//���� ���� ����� ������ �����̴�. 
		//���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� 
		//�� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ 
		//1,1,2,3,5,8,13,21,... �� ���� ������ ����ȴ�. 
		//1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� 
		//����ϴ� ���α׷��� �ϼ��Ͻÿ�.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; 

		System.out.print(num1 + "," + num2);

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2; 
			System.out.print("," + num3);
			num1 = num2; 
			num2 = num3;
			}
		}
		
	}



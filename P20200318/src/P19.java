
public class P19 {
public static void main(String[] args) {
	/* ���� : 
	�� �� �� �� ��
	�� �� �� �� ��
	�� �� �� �� ��
	�� �� �� �� ��
	�� �� �� �� �� 
	�� �迭�� ����� ����϶� 
	 */
	//�迭����
	int [][]arr = new int [5][5];
	int num = 1;
	
	for(int i=0; i<arr.length; i++) {
		for(int x = 0; x <=i; x++) {
			arr[i][x] = num;
			num = num+1;
		}
		System.out.println();
	}
	
	//��� ���
	for(int i=0; i<arr.length; i++) {
		for(int x = 0; x < arr[i].length; x++) {
			System.out.print(arr[i][x]+" ");
		}
		System.out.println();
	}
}
}

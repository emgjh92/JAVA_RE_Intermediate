
public class P07_�̱��� {

	public static void main(String[] args) {
		
		//StManager m = new StManager();
		StManager m = StManager.getInstance();
		m.manage(); //�� �ѹ��� �����ϵ��� �����Ϸ���? ==> �̱��� ���
		
		//StManager m = StManager.getInstance();
		//==> instance �� �� �������� null �� �ƴϹǷ� ���� �Ұ�
		
	}

}
//============�̱��� (������ ������ ���� - �ſ� ���� - ���̵� ߾ (������ ���ϵ� �߿��� ��))=====================
class StManager{
	//�̱��� �ڵ�
	private static final StManager instance = new StManager();
	public static StManager getInstance() {
		
		return instance;
	}
	
	private StManager() {
		//...1�� ȣ�� ��...
		System.out.println("������ ȣ�� ��...");
	}

	/*~~~~~~~~~���� ���� �̱��� �ڵ�~~~~~~~~~~~~~~~~
	private static StManager instance = null;
	public static StManager getInstance() {
		if(instance == null) 
		{
			instance = new StManager();
		}
		return instance;
	}
	
	private StManager() {
		//...1�� ȣ�� ��...
		System.out.println("������ ȣ�� ��...");
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	*/
//=====================================================================================

	//�Ʒ�...������ ���� �� �޼ҵ� ��
	private int count;
	
	public void manage() {
		count++;
		System.out.println(count + "�л������� �մϴ�.");
	}
}
class StData{
	public int score;
	public String name;
	
}


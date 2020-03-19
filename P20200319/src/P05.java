
public class P05 {

	public static void main(String[] args) {
		Account a1 = new Account("����",10000);
		
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.withdraw(1000000);
		a1.withdraw(3000);
		
		//a1.balance += 1000;
		//�̷��� �Ұ����ϰ� �ϱ� ���� private�� ����
		
		//a1.setBalance((-10000));
		//�� �ڵ带 �����ų �� �ܾ��� -10000 ���� �ٲ�� ���� (�ǹ����� �׷��� setter ���� �� �ſ� �����ϰ� �Ѵ�)
		
		System.out.println(a1.getCurrentBalance());
		
	}

}

class Account{
	private String name;
	private int balance;
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int value) {
		this.balance += value;
	}
	public void withdraw(int value) {
		if(this.balance < value) {
			System.out.println("���ܹ߻�...��� �ݾ��� �ܾ׺��� Ů�ϴ�");
			return;
		}
		
		this.balance -= value;
	}
	
	public int getCurrentBalance() {
		return this.balance;
	}
	
	public void setBalance(int value) {
		this.balance = value; 
		//���� ���迡�� setter�� ������ �� �ſ� ���� ����� �ϰ� �Ѵ� (�����ؾ� �Ѵ�)
	}
}

public class P05 {

	public static void main(String[] args) {
		Account a1 = new Account("한조",10000);
		
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.withdraw(1000000);
		a1.withdraw(3000);
		
		//a1.balance += 1000;
		//이런걸 불가능하게 하기 위해 private로 선언
		
		//a1.setBalance((-10000));
		//이 코드를 실행시킬 시 잔액이 -10000 으로 바뀌어 버림 (실무에선 그래서 setter 설정 시 매우 신중하게 한다)
		
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
			System.out.println("예외발생...출급 금액이 잔액보다 큽니다");
			return;
		}
		
		this.balance -= value;
	}
	
	public int getCurrentBalance() {
		return this.balance;
	}
	
	public void setBalance(int value) {
		this.balance = value; 
		//실제 설계에선 setter를 설계할 때 매우 많은 고려를 하고 한다 (조심해야 한다)
	}
}
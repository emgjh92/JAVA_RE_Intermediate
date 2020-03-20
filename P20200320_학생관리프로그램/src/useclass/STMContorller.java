package useclass;

import java.util.*;

public class STMContorller {
	
	private STMModel model;
	
	public STMContorller(STMModel model) {
		this.model = model;
		//�ܺο��� ���� �� ����
	}
	
	public void run() {
		Scanner scn = new Scanner(System.in);
		
		greeting();
		
		while(true) {
			
			showMenu();
			String inputValue = STMUtil.SCANNER.nextLine();
			
			if(inputValue.equals("q")) {
				break;
			}
			
			switch(inputValue) {
			
			case "1": addData();
				break;
			case "2": showList();
				break;
			case "3": 
				break;
			case "4": 
				break;
			case "5": 
				break;
			default: 
				System.out.println("�ٸ� �� �Է� ��....");
			}
			
		}
	}
	
	private void addData() {
		System.out.print("�̸��� �Է� >");
		String name = STMUtil.SCANNER.nextLine();
		System.out.print("���̸� �Է� >");
		int age = Integer.parseInt(STMUtil.SCANNER.nextLine());
		System.out.print("������ �Է� >");
		int score = Integer.parseInt(STMUtil.SCANNER.nextLine());
	
		model.addStudentData(new STData(name, age, score));
	}
	
	public void showList() {
		for(int i=0; i<model.getCurrentStudentCount(); i++) {
			STData st = model.getStudentData(i);
			System.out.println(st.getName());
		}
	}
	
	private void greeting() {
		System.out.println("���α׷� �ݰ���...");
		System.out.println("�ۼ��� ������...");
	}
	
	private void showMenu() {
		System.out.println("1. �Է�");
		System.out.println("2. ����Ʈ ���");
		System.out.println("3. �˻�");
		System.out.println("4. ����");
		System.out.println("5. ����");
		System.out.print("�Է� > ");
	}
	
}

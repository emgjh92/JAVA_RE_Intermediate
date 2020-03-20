package useclass;

import java.util.*;

public class STMContorller {
	
	private STMModel model;
	
	public STMContorller(STMModel model) {
		this.model = model;
		//외부에서 생성 후 주입
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
				System.out.println("다른 값 입력 해....");
			}
			
		}
	}
	
	private void addData() {
		System.out.print("이름을 입력 >");
		String name = STMUtil.SCANNER.nextLine();
		System.out.print("나이를 입력 >");
		int age = Integer.parseInt(STMUtil.SCANNER.nextLine());
		System.out.print("점수를 입력 >");
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
		System.out.println("프로그램 반가워...");
		System.out.println("작성은 누구고...");
	}
	
	private void showMenu() {
		System.out.println("1. 입력");
		System.out.println("2. 리스트 출력");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("5. 수정");
		System.out.print("입력 > ");
	}
	
}

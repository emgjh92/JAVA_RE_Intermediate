package API를활용한_파일입출력;

import java.io.*;
import java.util.Scanner;

public class P5_STM_수정_저장및불러오기_기능추가 {
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	static STData [] stList = new STData[100]; //학생 Data를 저장할 리스트
	static int stCount = 0; //stList의 배열 넘버를 누적시키기 위함
	
	public static void save() {
		File file = new File("C:\\test\\stm.dat");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//겉멋...시그니쳐.....
			dos.writeByte('S');
			dos.writeByte('T');
			dos.writeByte('M');
			
			//메타데이터(순수 데이터를 어떻게 읽어야 되는지에 대한 추가적인 데이터)
			dos.writeInt(stCount);
			
			//데이터 입력...
			for(int i = 0; i<stCount; i++) {
				dos.writeUTF(stList[i].name);
				dos.writeInt(stList[i].age);
				dos.writeInt(stList[i].score);
			}	
			
			
			dos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void load() {
		File file = new File("C:\\test\\stm.dat");
		
		if(!(file.exists())) {
			System.out.println("읽을 파일이 없습니다.");
			return;
		} //제일 처음 시도라 파일 자체가 존재하지 않는 경우
		
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			//읽기로직...
			int sign1 = dis.readByte();
			int sign2 = dis.readByte();
			int sign3 = dis.readByte();
			
			if(!(sign1 == 'S' && sign2 == 'T' && sign3 == 'M')) {
				System.out.println("잘못된 파일 입니다.(시그니쳐 오류)");
				return;
			}
			
			//메타데이터 읽기...
			int count = dis.readInt();
			
			for(int i = 0; i<count; i++) {
			
				String name = dis.readUTF();
				int age = dis.readInt();
				int score = dis.readInt();
				
				stList[stCount] = new STData(name,age,score);
				stCount++;
			}
			
			
			
			dis.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
	public static void main(String[] args) {
		
		/*
		 * static STData [] stList = new STData[100]; //학생 Data를 저장할 리스트 static int
		 * stCount = 0; //stList의 배열 넘버를 누적시키기 위함
		 */
		//+++++++++++++++++++++++++
		load();
		//+++++++++++++++++++++++++	

		Scanner scn = new Scanner(System.in);
		
		System.out.println("***학생 관리 프로그램에 오신걸 환영 합니다***");
		
		while(true) {
			System.out.println("======메뉴======");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 리스트");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 점수 수정");
			System.out.print("입력 (q=종료) > ");
			String inputValue = scn.nextLine();
			
			if(inputValue.equals("q")) { 
				break; 
			}
//----------------------------------------------------------------------------------------				
			if(inputValue.equals("1")) {
				//학생 정보 입력 코드
				System.out.println("========학생 정보 입력 시작========");
				System.out.println("학생 이름을 입력해 주세요");
				System.out.print("입력 > ");
				String name = scn.nextLine();
				
				System.out.println("나이를 입력해 주세요");
				System.out.print("입력 > ");
				String temp = scn.nextLine();
				
				int age = 0;
				
				try {
					age = Integer.parseInt(temp); // 입력받은 나이를 int형으로 파싱
				}catch(Exception e) {
					//파싱 시 문자열 등을 넣어서 Exception 이 나온다면 예외처리
					System.out.println("정수를 입력헤 주세요. ERROR CODE = 100011");
				}
				
				System.out.println("점수를 입력해 주세요");
				System.out.print("입력 > ");
				int score = Integer.parseInt(scn.nextLine()); // 입력받은 점수를 int형으로 파싱
				
				STData stData = new STData(name,age,score);		
				stList[stCount] = stData;
				stCount++;
				
				System.out.println("=========학생 정보 입력 끝 ========");
				System.out.println("계속 하시려면 Enter를 입력해주세요.");
				scn.nextLine();

			}
//----------------------------------------------------------------------------------------
			else if(inputValue.equals("2")) {
				//학생 리스트 출력
				System.out.println("======학생 리스트 시작======");
				for(int i = 0; i<stCount; i++) { 
					//i<stList.length 를 입력해 버리면 항상 100바퀴를 돌게 된다.
					System.out.println("이름 : "+ stList[i].name);
				}
				
				System.out.println("======학생 리스트 끝======");
				System.out.println("계속 하시려면 Enter를 입력해주세요.");
				scn.nextLine();
			}
//----------------------------------------------------------------------------------------
			else if(inputValue.equals("3")) {
				// 학생 정보 검색 (학생 이름 검색)
				System.out.println("======검색 시작======");
				System.out.println("검색할 학생의 이름을 입력해 주세요");
				System.out.print("입력 > ");
				String SearchingName = scn.nextLine();

				int SearchingCount = 0;
				
				for(int i=0; i<stCount; i++) {
					
					if(stList[i].name.contains(SearchingName)){
						String stPrint = "";
						stPrint += "이름 : ";
						stPrint += stList[i].name;
						stPrint += ", 나이 : ";
						stPrint += stList[i].age;
						stPrint += ", 점수 : ";
						stPrint += stList[i].score;
						
						System.out.println(stPrint);
						
						SearchingCount++;
					}
				}
				
				System.out.println(SearchingCount + "명이 검색 되었습니다.");
				
				System.out.println("======검색 끝======");
				System.out.println("계속 하시려면 Enter를 입력해주세요.");
				scn.nextLine();
			}
//----------------------------------------------------------------------------------------
			else if(inputValue.equals("4")) {
				//학생 정보 삭제
				System.out.println("======학생 삭제 시작======");
				System.out.println("삭제할 학생의 이름을 입력해 주세요");
				System.out.print("입력 > ");
				String deletingName = scn.nextLine();
				
				int count = 0; //삭제된 명수
				
				for(int i=0; i<stCount; i++) {
					if(stList[i].name.equals(deletingName)) {
						
						for(int x = i; x<stCount; x++) {
							stList[x] = stList[x+1]; 		
						}
						
						i--;
						
						stCount--;
						
						count++; //삭제된 명수
					}
				}
				
				System.out.println(count + "명이 삭제 되었습니다");
				
				System.out.println("======학생 삭제 끝======");
				System.out.println("계속 하시려면 Enter를 입력해주세요.");
				scn.nextLine();

			}
//----------------------------------------------------------------------------------------
			else if(inputValue.equals("5")) {
				//학생 점수 수정
			}
//----------------------------------------------------------------------------------------

			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		} //while 문 종료
	
//----------------------------------------------------------------------------------------
		
		//+++++++++++++++++++++++++
		save();
		//+++++++++++++++++++++++++	
		
		System.out.println("이용해 주셔서 감사합니다.");
			
	}

}


class STData{ //학생 정보 저장하는 class
	public String name;
	public int age;
	public int score;
	
	public STData(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
}

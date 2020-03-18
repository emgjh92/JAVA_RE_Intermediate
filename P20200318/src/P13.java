
public class P13 {

	public static void main(String[] args) {
		String [][] datas = new String[10][3];
		//이중 배열을 쓸 땐 모든 배열 값이 같은 "가치"를 가져야 한다.
		//아래와 같이 이름, 나이, 점수 를 넣어버리면....코드를 보기가 어렵고 
		//위험한 코드가 될 수 있다.
		//(이는 보통 type 만 같으면 된다는 식의 실수로 주로 초보자들이 범하는 실수이다.)
		
		datas[0][0] = "트레이서";
		datas[0][1] = "20";
		datas[0][2] = "99";
		
		datas[1][0] = "한조";
		datas[1][1] = "30";
		datas[1][2] = "70";

//============제대로 짜려면 아래와 같이 "가치"가 같게 짜야 한다========================
		String [] names = new String[10];
		String [] scores = new String[10];
		String [] ages = new String[10];
//=======================================================================		

//=======================================================================		

		Student st1 = new Student();
		st1.name = "트레이서";
		st1.score = "70";
		st1.age = "20";
		
		st1 = new Student();
		System.out.println(st1.name); //결과값 : null
		//주소를 new 명령어로 새로 할당시켜 버리므로..line 32 에서 메모리 구조가 바뀌어 버린다.

//=======================================================================		
		Student [] studentList = new Student[10];
		
		for(int i=0; i<studentList.length; i++) {
			studentList[i] = new Student();
			}
		studentList[0].name = "위도우메이커";
		studentList[0].score = "70";
		studentList[0].age = "20";
		
		System.out.println(studentList[0].name);
		//결과값 : java.lang.NullPointerException
	}
}

class Student{
	String name;
	String score;
	String age;
}
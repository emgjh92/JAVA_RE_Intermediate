
public class P13 {

	public static void main(String[] args) {
		String [][] datas = new String[10][3];
		//���� �迭�� �� �� ��� �迭 ���� ���� "��ġ"�� ������ �Ѵ�.
		//�Ʒ��� ���� �̸�, ����, ���� �� �־������....�ڵ带 ���Ⱑ ��ư� 
		//������ �ڵ尡 �� �� �ִ�.
		//(�̴� ���� type �� ������ �ȴٴ� ���� �Ǽ��� �ַ� �ʺ��ڵ��� ���ϴ� �Ǽ��̴�.)
		
		datas[0][0] = "Ʈ���̼�";
		datas[0][1] = "20";
		datas[0][2] = "99";
		
		datas[1][0] = "����";
		datas[1][1] = "30";
		datas[1][2] = "70";

//============����� ¥���� �Ʒ��� ���� "��ġ"�� ���� ¥�� �Ѵ�========================
		String [] names = new String[10];
		String [] scores = new String[10];
		String [] ages = new String[10];
//=======================================================================		

//=======================================================================		

		Student st1 = new Student();
		st1.name = "Ʈ���̼�";
		st1.score = "70";
		st1.age = "20";
		
		st1 = new Student();
		System.out.println(st1.name); //����� : null
		//�ּҸ� new ��ɾ�� ���� �Ҵ���� �����Ƿ�..line 32 ���� �޸� ������ �ٲ�� ������.

//=======================================================================		
		Student [] studentList = new Student[10];
		
		for(int i=0; i<studentList.length; i++) {
			studentList[i] = new Student();
			}
		studentList[0].name = "���������Ŀ";
		studentList[0].score = "70";
		studentList[0].age = "20";
		
		System.out.println(studentList[0].name);
		//����� : java.lang.NullPointerException
	}
}

class Student{
	String name;
	String score;
	String age;
}
package Collection;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list = new ArrayList<StudentData>(100);
		//ArrayList �� Generic ���� �����Ǿ� �ִ�.
		
		StudentData st1 = new StudentData("����",10, 70);
		
		list.add(st1);
		list.add(new StudentData("Ʈ���̼�1",20,100));
		list.add(new StudentData("Ʈ���̼�2",20,100));
		list.add(new StudentData("Ʈ���̼�3",20,100));
		list.add(new StudentData("Ʈ���̼�4",20,100));
		list.add(new StudentData("Ʈ���̼�5",20,100));
		list.add(new StudentData("Ʈ���̼�6",20,100));
		list.add(new StudentData("Ʈ���̼�7",20,100));
		list.add(new StudentData("Ʈ���̼�8",20,100));
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		list.add(3, new StudentData("Ʈ���̼�9",20,100));
		list.remove(5);
		list.remove(st1); 
		//==> �� ������ ���� API������ ����������, ���ʿ� ArrayList�� �̷� ���� ��� �����ս� ������ ���� �� �ִ�.
		//(�̷� ��찡 ���ٸ� �׳� LinkedList �� ���°� ����)
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		StudentData t = list.get(3); //ArrayList�� �ٽ����� ���� ("����"�� ������!)
		
		
		for(int i=0; i<list.size(); i++) {
			StudentData ref = list.get(i);
			System.out.println(ref.name);
		}
		
	
	}

}

class StudentData implements Comparable<StudentData>{
	String name;
	int age;
	int score;
	
	StudentData(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override //set �迭�� ���� ���� �ʿ� (����� ũ��, ����� ������ �˱� ����)
	public int compareTo(StudentData o) {
		if(this.score == o.score) {
			return 0;
			
		}else if(this.score > o.score) {	
			return 1;
			
		}else {
			return -1;
		}
		
	}
}
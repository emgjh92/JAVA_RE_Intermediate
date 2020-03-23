package Collection;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		//StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list = new ArrayList<StudentData>(100);
		//ArrayList 는 Generic 으로 구현되어 있다.
		
		StudentData st1 = new StudentData("한조",10, 70);
		
		list.add(st1);
		list.add(new StudentData("트레이서1",20,100));
		list.add(new StudentData("트레이서2",20,100));
		list.add(new StudentData("트레이서3",20,100));
		list.add(new StudentData("트레이서4",20,100));
		list.add(new StudentData("트레이서5",20,100));
		list.add(new StudentData("트레이서6",20,100));
		list.add(new StudentData("트레이서7",20,100));
		list.add(new StudentData("트레이서8",20,100));
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		list.add(3, new StudentData("트레이서9",20,100));
		list.remove(5);
		list.remove(st1); 
		//==> 위 세가지 식은 API상으론 가능하지만, 애초에 ArrayList는 이런 식의 경우 퍼포먼스 문제가 생길 수 있다.
		//(이런 경우가 많다면 그냥 LinkedList 를 쓰는게 낮다)
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		StudentData t = list.get(3); //ArrayList의 핵심적인 장점 ("접근"이 빠르다!)
		
		
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

	@Override //set 계열을 쓰기 위해 필요 (어느게 크고, 어느게 작은지 알기 위해)
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
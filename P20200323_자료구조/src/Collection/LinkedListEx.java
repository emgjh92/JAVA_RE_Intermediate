package Collection;

import java.util.*;

public class LinkedListEx {
public static void main(String[] args) {
	
	LinkedList<StudentData> list = new LinkedList<StudentData>();
	
	StudentData st1 = new StudentData("한조",10,70);
	
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
	list.add(3,new StudentData("트레이서9",20,100));
	list.remove(5);
	//===> LinkedList 의 경우 이런 류의 식도 퍼포먼스상 문제가 적다. (ArrayList 와는 다르다)
	list.remove(st1);
	//====> 다만 이 식의 경우 st1 을 삭제 하기 까지 검색을 해야 하므로 속도 면에선 별 차이가 없으나 ArrayList의 경우 삭제 후 밀어 넣는 과정 때문에
	//		시간이 좀 더 걸리긴 한다.
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	StudentData t = list.get(3); //ArrayList에 비해 LinkedList는 매우 퍼포먼스가 떨어진다.

//--------------------------------------------------------------------------
	for(int i=0; i<list.size(); i++) {
		StudentData ref = list.get(i);
		System.out.println(ref.name);
	} //==> LinkedList의 경우 이 코드는 문제가 있다 .(100만번째 라면, 100만번을 돌아서 i값을 뽑아온다)
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
	Iterator<StudentData> iter = list.iterator();
	while(iter.hasNext()) {
		
		StudentData ref = iter.next();
		
		System.out.println(ref.name);
	
	} //올바른 코드....but...귀찮음...보통 향상된 for 문을 쓴다.
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
	for(StudentData data : list) {
		System.out.println(data.name);
	} //같은 기능을 하는 훨씬 향상된 방식
//--------------------------------------------------------------------------

}
}

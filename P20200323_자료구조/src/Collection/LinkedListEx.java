package Collection;

import java.util.*;

public class LinkedListEx {
public static void main(String[] args) {
	
	LinkedList<StudentData> list = new LinkedList<StudentData>();
	
	StudentData st1 = new StudentData("����",10,70);
	
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
	list.add(3,new StudentData("Ʈ���̼�9",20,100));
	list.remove(5);
	//===> LinkedList �� ��� �̷� ���� �ĵ� �����ս��� ������ ����. (ArrayList �ʹ� �ٸ���)
	list.remove(st1);
	//====> �ٸ� �� ���� ��� st1 �� ���� �ϱ� ���� �˻��� �ؾ� �ϹǷ� �ӵ� �鿡�� �� ���̰� ������ ArrayList�� ��� ���� �� �о� �ִ� ���� ������
	//		�ð��� �� �� �ɸ��� �Ѵ�.
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	StudentData t = list.get(3); //ArrayList�� ���� LinkedList�� �ſ� �����ս��� ��������.

//--------------------------------------------------------------------------
	for(int i=0; i<list.size(); i++) {
		StudentData ref = list.get(i);
		System.out.println(ref.name);
	} //==> LinkedList�� ��� �� �ڵ�� ������ �ִ� .(100����° ���, 100������ ���Ƽ� i���� �̾ƿ´�)
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
	Iterator<StudentData> iter = list.iterator();
	while(iter.hasNext()) {
		
		StudentData ref = iter.next();
		
		System.out.println(ref.name);
	
	} //�ùٸ� �ڵ�....but...������...���� ���� for ���� ����.
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
	for(StudentData data : list) {
		System.out.println(data.name);
	} //���� ����� �ϴ� �ξ� ���� ���
//--------------------------------------------------------------------------

}
}

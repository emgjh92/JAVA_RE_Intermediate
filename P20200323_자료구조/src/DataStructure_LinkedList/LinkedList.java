package DataStructure_LinkedList;

public class LinkedList {
public static void main(String[] args) {
	/* �ڷᱸ��_��ũ�� ����Ʈ */
	/*
		int [] arr = new int[100];
	*/
	
	MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(100);

	
	list.add(3,500); // ����°�� 500 �߰�
	list.remove(5); //500�� ����° �߰��� ���� 5��° (value : 50) ����
	
	for(int i = 0; i<10; i++) {
		int value = list.get(i);
		System.out.println(value);
	}

//~~~~~~~~~~~~~~~~~~~~~~Generic�� ���� ����~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	MyLinkedList<STData> stList = new MyLinkedList<STData>();
	
	stList.add(new STData());
	
	
	}
}

class STData{
	int v1; 
	String v2;
	String v3;
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	

//=======================================================================

class Node<T>{
	T value; //���� �� ���� 
	Node<T> next; //���� ���ڸ� �ִ°� �ƴ϶� �ٸ� ���鵵 ���� �� �ְ� �ϱ� ���� G	eneric���� ����
}
//=======================================================================

class MyLinkedList<T>{
	
	Node<T> first = null;
//==================ADD(���� �������� �ֱ�)====================================	
	void add(T value) {
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		
		if(first == null) {
			first = newNode;
			return;
		}
		Node<T> temp = first;
		
		while(true) {
			if(temp.next == null) {
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
	}
//=================================================================

//==================REMOVE(����)====================================	
		void remove(int index) {
			
			if(index == 0) {
				first = first.next;
				return; 
	 //ù��° ���� �����ϴ� ��� ���� �ڵ带 �����ų �ʿ䰡 �����Ƿ� �ٷ� return;
			}
			
			Node<T> temp = first;
			
			for(int i = 0; i<index-1; i++) {
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
		}
//==================================================================
		
//==================ADD(�߰��� ����)====================================	
		
	//add �Լ� �����ε�
	void add(int index, T value) {
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		
		Node<T> temp = first;
		for(int i = 0; i<index-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
		
//=====================================================================	


//==================GET(���� �̾ƿ���)====================================	
	
	T get(int index) {
		Node<T> temp = first;
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		
		return temp.value;
	}
			
//=====================================================================


/*
 ��ũ�� ����Ʈ�� ���� : ���� �ӵ��� ��������.
 (���� ��ü�� ���� �ɸ���. ������ �� ��� ������ �� ��ŭ '���� �õ�' �� '����'�ؼ� ����)
 */

}
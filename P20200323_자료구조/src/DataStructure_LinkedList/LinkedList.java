package DataStructure_LinkedList;

public class LinkedList {
public static void main(String[] args) {
	/* 자료구조_링크드 리스트 */
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

	
	list.add(3,500); // 세번째에 500 추가
	list.remove(5); //500을 세번째 추가한 후의 5번째 (value : 50) 삭제
	
	for(int i = 0; i<10; i++) {
		int value = list.get(i);
		System.out.println(value);
	}

//~~~~~~~~~~~~~~~~~~~~~~Generic에 대한 예시~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
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
	T value; //값이 들어갈 공간 
	Node<T> next; //값을 숫자만 넣는게 아니라 다른 값들도 넣을 수 있게 하기 위해 G	eneric으로 선언
}
//=======================================================================

class MyLinkedList<T>{
	
	Node<T> first = null;
//==================ADD(값을 차레데로 넣기)====================================	
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

//==================REMOVE(삭제)====================================	
		void remove(int index) {
			
			if(index == 0) {
				first = first.next;
				return; 
	 //첫번째 값을 삭제하는 경우 밑의 코드를 실행시킬 필요가 없으므로 바로 return;
			}
			
			Node<T> temp = first;
			
			for(int i = 0; i<index-1; i++) {
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
		}
//==================================================================
		
//==================ADD(중간에 삽입)====================================	
		
	//add 함수 오버로딩
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


//==================GET(값을 뽑아오기)====================================	
	
	T get(int index) {
		Node<T> temp = first;
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		
		return temp.value;
	}
			
//=====================================================================


/*
 링크드 리스트의 단점 : 접근 속도가 떨어진다.
 (접근 자체가 오래 걸린다. 삽입을 할 경우 데이터 수 만큼 '접근 시도' 후 '접근'해서 삽입)
 */

}
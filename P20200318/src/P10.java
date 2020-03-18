
public class P10 {
public static void main(String[] args) {
	int [][] arr;
	arr = new int[3][4];
	arr[0][1] = 30;
	//배열의 메모리 구조
	/*
  	int[3][4] 로 선언된 경우 stack 영역 1개, heap 영역 3개 + 각 영역마다 다시 할당된 int 4개 (4*3 = 12)
  	1 + 3 + (4 + 4 + 4) = 총 16개의 영역을 컨트롤 할 수 있게 된다.
  	 
  	stack  |  heap
  		   |  
      □ ======>  0□        1□        2□
   		   |   0-a□□□□   1-a□□□□   2-a□□□□
  		   |
  		   |
  	 */
	
	arr [1] = null;
	arr [1] = new int [2];
	/*
	위 코드를 실행 할 경우
	■ ■ ■ ■
	■ ■
	■ ■ ■ ■
	이런식으로 무너진 열이 생성된다.
	*/
	
	
}
}

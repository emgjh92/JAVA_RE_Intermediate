
public class P12 {
public static void main(String[] args) {
	
	int a = 10;
	int [] t = null;
	
	if(a>5) {
		int [][] arr = new int [3][4];
		t = arr[1];
		
	}
	//if 문을 빠져 나간 시점의 메모리 구조
	
	/*
	stack  |  heap
  		   |  
      □  --X-> ::==========> 1□ 
  t : □  ======::         1-a□□□□
  		   |
  		   |
  	 */
	}
}

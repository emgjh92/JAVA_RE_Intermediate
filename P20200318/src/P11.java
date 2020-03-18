
public class P11 {

	public static void main(String[] args) {
		//3중 배열
		int [][][] arr = new int [3][][];
		arr[0] = new int[3][];
		arr[0][0]= new int[4];
		arr[0][0][0] = 30;

		/* 3중 배열 구조 (4중, 5중 등의 배열도 같은 식으로 작동 된다)
	stack  |  heap
  		   |  
  	□   ======> 			0□   		   	 		   1□      					  	2□
   		   |  		     0-a□□□□  				    1-a□□□□  					 2-a□□□□
  		   |0-b□□□□0-b□□□□0-b□□□□0-b□□□□   1-b□□□□1-b□□□□1-b□□□□1-b□□□□  2-b□□□□2-b□□□□2-b□□□□2-b□□□□
  		   |
		 */
	}

}


public class P19 {
public static void main(String[] args) {
	/* 문제 : 
	① ○ ○ ○ ○
	② ③ ○ ○ ○
	④ ⑤ ⑥ ○ ○
	⑦ ⑧ ⑨ ⑩ ○
	⑪ ⑫ ⑬ ⑭ ⑮ 
	의 배열을 만들고 출력하라 
	 */
	//배열생성
	int [][]arr = new int [5][5];
	int num = 1;
	
	for(int i=0; i<arr.length; i++) {
		for(int x = 0; x <=i; x++) {
			arr[i][x] = num;
			num = num+1;
		}
		System.out.println();
	}
	
	//결과 출력
	for(int i=0; i<arr.length; i++) {
		for(int x = 0; x < arr[i].length; x++) {
			System.out.print(arr[i][x]+" ");
		}
		System.out.println();
	}
}
}

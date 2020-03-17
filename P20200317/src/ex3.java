
public class ex3 {
	public static void main(String[] args) {
		//1부터 10000사이에 8은 몇번 나오는가?
		int count = 0;
		for(int i=1; i<10000; i++) {
			int temp = i;
			
			while(temp != 0) {
				if(temp%10==8) {
					count++;
				}
				temp = temp/10;
			}
			
		}			
		System.out.println("8의 갯수 : "+count);

	}
	

}


public class ex2 {
public static void main(String[] args) {
	//2부터 100000사이의 소수를 구해보자 (배열을 이용해서)
	//에라토스테네스의 체
	
	long time = System.currentTimeMillis(); //시간측정
	
	int [] arrValue   = new int [99999];
	
	for(int i = 0; i < 99999; i++) {
		arrValue[i] = i+2;
	} //배열 생성
	
	for(int i = 0; i < 99999; i++) {
		if(arrValue[i] != -1) {
			System.out.println(arrValue[i]+"는 소수 입니다");
			for(int x=i+1; x<99999; x++) {
				if(arrValue[x]%arrValue[i] == 0) {
					arrValue[x] = -1; 
				}
			}
		}
		
	}
	time = System.currentTimeMillis() - time; //시간 측정
	System.out.println("경과시간 : " + time);
}
}

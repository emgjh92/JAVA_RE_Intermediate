
public class ex1 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis(); //시간측정

		//2부터 100000사이의 소수를 구해보자
		for(int x =2; x<=99999; x++) {
			boolean isPrime = true;
			for(int y = 2; y<Math.sqrt(x); y++) {
				if(x%y==0) { //Math.sqrt(x) ==> 루트 씌우기 (퍼포먼스 향상)
					isPrime = false;
					break;
				}
			}
			if(isPrime=true) {
				System.out.println(x +"는 소수"); 
			}
		}
		
		time = System.currentTimeMillis() - time; //시간 측정
		System.out.println("경과시간 : " + time);
		
	}

}


public class L_Ex1 {

	public static void main(String[] args) {
		
		//1.for문을 이용해서 1부터 76까지 합을 구하는 코드를 작성하자
		int sum=0;
		for(int i=1; i<=76; i++) {
			//System.out.println(sum+"더하기"+i);
			sum=sum+i;
		}
		System.out.println("result is "+sum);
		//2. 구구단을 출력해 보자
		int ga = 1;
		while(ga<10) {
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga+"x"+i+"="+(ga*i));
		}
		ga++;
		}
		//3.피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 
		//다음 수를 만들어 나가는 수열이다. 
		//예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 
		//그 다음 수는 1과 2를 더해서 3이 되어서 
		//1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
		//1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 
		//계산하는 프로그램을 완성하시오.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; 

		System.out.print(num1 + "," + num2);

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2; 
			System.out.print("," + num3);
			num1 = num2; 
			num2 = num3;
			}
		}
		
	}



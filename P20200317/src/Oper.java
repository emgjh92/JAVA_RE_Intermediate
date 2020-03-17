
public class Oper {

	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = 20;
		
		int v3 = v1 + v2;
		//int v3 = v1 - v2;
		//int v3 = v1 * v2;
		//int v3 = v1 / v2;
		v3 = v1%v2;
		
		System.out.println(v3);
		
		v1 = 20; //대입 연산자
		
		//비교, 논리 연산자....결과가 boolean 타입으로 나옴
		boolean v5 = 10 < 20;
		v5 = v1 > v2;
		v5 = v1 > 200;
		//v5 = v1 > "안녕하세요"; ==> 오류 발생
		v5 = v1 < 10;
		v5 = v1 <= 10;
		v5 = v1 > 10;
		v5 = v1 >= 10;
		v5 = v1 == 10;
		v5 = v1 !=10;
		v5 = !v5;
		v5 = !(v1 > 10); //v1 <= 10
		
		v5 = true && true;
		//v5 = true && 10; //오류 (양쪽의 type이 같아야 한다)
		v5 = v1 > 10 && v2 < 20;
		v5 = true || false; //둘중 하나라도 true 인 경우엔 true
		v5 = v1%2==0 || v1%3==0;
		
		int score=91;
		int attend=70;
		int bongsa=100;
		
		if(attend >=80 && (score >=90 || bongsa==100)) {
			System.out.println("장학금 목걸이 획득...");
		}
		
		//비트 연산자...(버리자!, 자바에선 보통 안씀)
		
		
		//문자열 연산
		String str = "안녕하세요" + "반갑습니다"; //문자열 + 문자열 이 가능하다.
		str = "안녕하세요" + (10 + v1);
		
		int bookid=7;
		String bookname = "축구의 역사";
		String publisher = "중앙";
		int price =7000;
		
		String query 
		= "INSERT INTO Book VALUES("+bookid+",'"+bookname+"','"+publisher+"',"+price+")";
		System.out.println(query);
		
		
		//단축배정연산자
		int v7 = 10;
		//v7 = v7 + 5;
		v7 +=5;
		
		String str2 = "안녕하세요";
		str2 += "반갑습니다";
		
		int v8 = 10;
		v8++;
		
		
	}

}


public class P6 {

	public static void main(String[] args) {
		
		byte v1 = 10;
		byte v2 = 10;
		/*
		byte result = v1 + v2; //!!!error!!!
		//Type mismatch: cannot convert from int to byte
		//산술 연산자 기준으로 (위의 예시에선 더하기) int 형으로 변환 시키기 때문에
		//결과값이 int + int = int 가 되므로 byte 인 v2에 담을 수가 없게 된다.
		*/
		byte result = (byte)(v1 + v2);
		
		int v3 = 10;
		int v4 = 20;
		int v5 = v3 + v4;
	}

}

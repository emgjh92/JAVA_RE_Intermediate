package API를활용한_파일입출력;
import java.io.*;

public class P1_API를활용한_파일입출력1 {
	public static void main(String[] args) throws IOException {
		//API를 활용한 파일 입출력
		
		int a = 400;
		
		File xxx = new File("C:\\test\\aaa.dat");
		
		FileOutputStream fos = new FileOutputStream(xxx);
		//FileOutputStream ==> File write 기능
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// a : 00 00 01 90
		//fos.write(a >> 24); // 00 00 00 00
		//fos.write(a >> 16); // 00 00 00 00
		//fos.write(a >> 8);  // 00 00 00 01
		//fos.write(a >> 0);  // 90 00 00 00 
		/*
		 그냥 fos.write(a); 만 할 경우 hex editor 값이 90으로 뜬다 (실제 hex 값은 190인데도)
		 
		byte 단위로 저장하기 때문에 데이터 일부가 짤리는 것
		이를 해결하기 위해 >> 를 통해 밀어준다.
		위 코드처럼 수정 후엔 hex editor 값 이 00 00 01 90 으로 뜨게 된다.
		*/
		
		//다만, 위 과정이 너무 번거롭고 힘들기 떄문에 나온 API가 "DataOutputStream"
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(10);
		dos.writeInt(400); //4byte 씩 두번 들어감
	
		dos.writeByte(5); //1byte씩 추가할땐 wirteByte 사용
		
		dos.writeUTF("AABBaabb"); //문자를 넣고 싶을 땐 writeUTF
		
		
		dos.close();//close가 flush 의 역할까지 같이 한다. (flush : 버거가 안차있더라도 저장)
	
		
		System.out.println("안녕하세요");
	}
}

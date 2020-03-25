package API를활용한_파일입출력;

import java.io.*;

public class P6_비트맵_논리적으로_만들기 {
	public static void main(String[] args) {
		//비트맵 논리적으로 만들기
		try {
			
			File file = new File("C:\\test\\aa.bmp");
			
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeByte('B');
			dos.writeByte('M');
			
			//dos.writeInt(360054);
			dos.writeByte(360054 >> 0);
			dos.writeByte(360054 >> 8);
			dos.writeByte(360054 >> 16);
			dos.writeByte(360054 >> 24);
			//Little Endian 이므로 거꾸로 넣어준다.
			
			dos.writeShort(0);
			dos.writeShort(0);

			dos.writeByte(54 >> 0);
			dos.writeByte(54 >> 8);
			dos.writeByte(54 >> 16);
			dos.writeByte(54 >> 24); 
			
			dos.writeByte(40 >> 0); //이 헤더의 크기 (40 바이트)
			dos.writeByte(40 >> 8);
			dos.writeByte(40 >> 16);
			dos.writeByte(40 >> 24);
			
			dos.writeByte(400 >> 0); //비트맵 가로 (화소)
			dos.writeByte(400 >> 8);
			dos.writeByte(400 >> 16);
			dos.writeByte(400 >> 24);
			
			dos.writeByte(300 >> 0); //비트맵 세로 (화소)
			dos.writeByte(300 >> 8);
			dos.writeByte(300 >> 16);
			dos.writeByte(300 >> 24);
			
			dos.writeByte(1 >> 0);//색판의 수 (2byte)
			dos.writeByte(1 >> 8);
			
			dos.writeByte(24 >> 0);//한 화소에 들어가는 비트 수이며 그림의 색 깊이를 뜻한다
			dos.writeByte(24 >> 8);
			
			dos.writeByte(0 >> 0);//압축 방식
			dos.writeByte(0 >> 8);
			dos.writeByte(0 >> 16);
			dos.writeByte(0 >> 24);
			
			dos.writeByte(360000 >> 0); //그림 크기
			dos.writeByte(360000 >> 8);
			dos.writeByte(360000 >> 16);
			dos.writeByte(360000 >> 24);

			dos.writeInt(0); //그림의 가로 해상도
			
			dos.writeInt(0); //그림의 세로 해상도
			
			dos.writeInt(0); //색 팔레트의 색 수
			
			dos.writeInt(0); //중요한 색의 수
			
			
			
			//실제 데이터....메타데이터하고 잘 맞아야 됨
			for(int x=0; x<400; x++) {
				for(int y=0; y<300; y++) {
					
					if(x == 20) {
						dos.writeByte(0); //0~255 사이 값
						dos.writeByte(0); //0~255 사이 값
						dos.writeByte(255); //0~255 사이 값
					} else {
						dos.writeByte(x); //0~255 사이 값
						dos.writeByte(x); //0~255 사이 값
						dos.writeByte(x); //0~255 사이 값
					} //===> 빨간 선이 그어진 그라데이션 배경 그림파일
					
					//dos.writeByte(255); //0~255 사이 값
					//dos.writeByte(0); //0~255 사이 값
					//dos.writeByte(0); //0~255 사이 값
					//==> 파란색 파일 비트맵 파일이 나오게 된다. (RGB가 거꾸로 읽혀지므로 B->G->R 순)
				}
			}
			//hex 구조 참조 : https://ko.wikipedia.org/wiki/BMP_%ED%8C%8C%EC%9D%BC_%ED%8F%AC%EB%A7%B7
			
				
			dos.close();
			
			System.out.println("파일이 생성되었습니다");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

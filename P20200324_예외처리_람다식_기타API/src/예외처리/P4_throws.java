package ����ó��;

public class P4_throws {

	public static void main(String[] args) {
		try {
			new Test().method1();
		}catch(Exception e){
			
		}
		System.out.println("���� ������ �ڵ��....");
	}

}


class Test{
	void method1() throws Exception{
		String str = null;
		System.out.println(str.charAt(0)); //NullPointerException
		//throws �� �� ��� ���� ó���� ������ �������� �� (throws) �ִ�.
		//������ throws �� �� ��� �ݵ�� �Ѱ� ���� �ʿ��� try, catch�� ����ó���� �� �־�߸� �Ѵ�.
		//���� main ���� �ѹ� �� throws �� �ϰ� �Ǹ� JVM �� �޾Ƽ� �ڵ����� ó���ϰ� �ȴ�.
	}
	
}



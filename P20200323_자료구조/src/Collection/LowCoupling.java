package Collection;

import java.util.*;

public class LowCoupling {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//���࿡ ArrayList ���� ����� LinkedList �� �ٲٰ� �ʹٸ�?
		//List<String> list = new LinkedList<String>(); �θ� ���߸� �ȴ� ==> !!!!!!���� ���յ�!!!!!!!
		//�̰��� �ٷ� �������̽��� �ִ� �����̴�. (ǥ���� List �� ���� �� ���� ������ �ּ����� �ڵ� �������� ����� �� �ٲ��)
		
		List<String> list2 = new ArrayList<>();
		//===> ���� String �� ���� �ڵ����� ��������. (�ֽŹ���, �ҽ� ����ȭ)
		
		new Test().method1(list);
	}

}

class Test{
	public void method1(List<String> list) {
		method2(list);
	}
	
	public void method2(List<String> list) {
		
	}
	
}
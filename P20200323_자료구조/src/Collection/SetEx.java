package Collection;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(6);
		set.add(5);
		set.add(9);
		set.add(1);

		for(Integer data : set) {
			System.out.println(data);
		} //����� : 1 3 5 6 7 9 (�ߺ��� (5) �� �������, ���������� ���ĵǼ� ��������)
		
		set.contains(1); //�ش簪�� �ִ��� �Ǵ� (��� add �Ҷ� �̹� �ѹ� �Ǵ��ϱ� �Ѵ�)
	}

}

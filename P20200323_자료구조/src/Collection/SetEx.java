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
		} //결과값 : 1 3 5 6 7 9 (중복값 (5) 이 사라지고, 순차적으로 정렬되서 뽑혀진다)
		
		set.contains(1); //해당값이 있는지 판단 (사실 add 할때 이미 한번 판단하긴 한다)
	}

}

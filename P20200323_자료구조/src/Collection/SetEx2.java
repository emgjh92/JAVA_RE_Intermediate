package Collection;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		
		TreeSet<StudentData> set = new TreeSet<StudentData>();
		
		set.add(new StudentData("����1",1,5));
		set.add(new StudentData("����2",2,4));
		set.add(new StudentData("����3",3,6));
		set.add(new StudentData("����4",4,3));
		set.add(new StudentData("����5",5,2));
		set.add(new StudentData("����6",6,1));

		for(StudentData data : set) {
			System.out.println(data.name);
		}
		
	}

}

package Collection;

import java.util.*;

public class ArrayList_in_the_HashMap {
	public static void main(String[] args) {
		HashMap<String, ArrayList<StudentData>> classMap 
		= new HashMap<String, ArrayList<StudentData>>();
		//HashMap �� key, value ���� value �� ArrayList�� �Ѵٸ�?
		
		classMap.put("1��",new ArrayList<StudentData>());
		classMap.put("2��",new ArrayList<StudentData>());
		classMap.put("3��",new ArrayList<StudentData>());
		
		classMap.get("1��").add(new StudentData("1�� ���� 1",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 2",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 3",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 4",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 5",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 6",19,70));
		classMap.get("1��").add(new StudentData("1�� ���� 7",19,70));

		classMap.get("2��").add(new StudentData("2�� ���� 1",19,70));
		classMap.get("2��").add(new StudentData("2�� ���� 2",19,70));
		classMap.get("2��").add(new StudentData("2�� ���� 3",19,70));
		classMap.get("2��").add(new StudentData("2�� ���� 4",19,70));
		classMap.get("2��").add(new StudentData("2�� ���� 5",19,70));

		
		
		//1�� ��ü �л� ���
		for(StudentData data : classMap.get("1��")) {
			System.out.println(data.name);
		}
		
		
	}
}

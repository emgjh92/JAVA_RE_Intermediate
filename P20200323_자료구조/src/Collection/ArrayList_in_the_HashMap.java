package Collection;

import java.util.*;

public class ArrayList_in_the_HashMap {
	public static void main(String[] args) {
		HashMap<String, ArrayList<StudentData>> classMap 
		= new HashMap<String, ArrayList<StudentData>>();
		//HashMap 의 key, value 에서 value 를 ArrayList로 한다면?
		
		classMap.put("1반",new ArrayList<StudentData>());
		classMap.put("2반",new ArrayList<StudentData>());
		classMap.put("3반",new ArrayList<StudentData>());
		
		classMap.get("1반").add(new StudentData("1반 한조 1",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 2",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 3",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 4",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 5",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 6",19,70));
		classMap.get("1반").add(new StudentData("1반 한조 7",19,70));

		classMap.get("2반").add(new StudentData("2반 한조 1",19,70));
		classMap.get("2반").add(new StudentData("2반 한조 2",19,70));
		classMap.get("2반").add(new StudentData("2반 한조 3",19,70));
		classMap.get("2반").add(new StudentData("2반 한조 4",19,70));
		classMap.get("2반").add(new StudentData("2반 한조 5",19,70));

		
		
		//1반 전체 학생 출력
		for(StudentData data : classMap.get("1반")) {
			System.out.println(data.name);
		}
		
		
	}
}

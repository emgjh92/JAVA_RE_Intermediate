package Collection;

import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		/*

		Hash 알고리즘 - 복호화가 불가능한 암호화에 많이 쓰임, 문자열 비교에도 많이 쓰임(문자열이 고정길이로 바뀌기 때문에 비교 시 시간이 적게 걸린다)

		Hash Map :
		String + Key Value 한묶음
		⇒ 장점 : Hash Map 도 결국 ‘배열’ 이므로, ‘접근’ 시 소요시간이 매우 매우 적다.(해당 키에 해당하는 값을 뽑아오기만 하면 되므로) 
				- 물론, 키로 값을 추출하는 것이 아닌 값으로 값을 추출하는 것은 느리다.
		⇒ 단점 : 값의 중복은 허용하지만, 키의 중복은 허용하지 않음, “순서가 없음”

		 */
		HashMap<String, StudentData> map = new HashMap<String,StudentData>();
		//<key, value>
		
		StudentData st = new StudentData("트레1",10,100);
		map.put(st.name, st); //st.name = 트레1 이 키 이고, 키 값과, value = 트레,10,100 을 put 한다.
		//**값의 수정도 put으로 한다.**
		
		StudentData ref = map.get("트레1"); //키가 "트레1"인 value를 get 한다.
		
		map.put("1번", new StudentData("트레1", 10, 5));
		//map.put("1번", new StudentData("트레2", 10, 5)); //키가 중복되면 값이 덮어 씌워져 버린다.
		map.put("2번", new StudentData("트레2", 10, 5));
		map.put("3번", new StudentData("트레3", 10, 5));
		map.put("4번", new StudentData("트레4", 10, 5));
		map.put("5번", new StudentData("트레5", 10, 5));
		map.put("6번", new StudentData("트레6", 10, 5));

		//전체반복
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(map.get(key).name);
		}
		
	}
}

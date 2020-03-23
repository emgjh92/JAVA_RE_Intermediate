package Collection;

import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		/*

		Hash �˰��� - ��ȣȭ�� �Ұ����� ��ȣȭ�� ���� ����, ���ڿ� �񱳿��� ���� ����(���ڿ��� �������̷� �ٲ�� ������ �� �� �ð��� ���� �ɸ���)

		Hash Map :
		String + Key Value �ѹ���
		�� ���� : Hash Map �� �ᱹ ���迭�� �̹Ƿ�, �����١� �� �ҿ�ð��� �ſ� �ſ� ����.(�ش� Ű�� �ش��ϴ� ���� �̾ƿ��⸸ �ϸ� �ǹǷ�) 
				- ����, Ű�� ���� �����ϴ� ���� �ƴ� ������ ���� �����ϴ� ���� ������.
		�� ���� : ���� �ߺ��� ���������, Ű�� �ߺ��� ������� ����, �������� ������

		 */
		HashMap<String, StudentData> map = new HashMap<String,StudentData>();
		//<key, value>
		
		StudentData st = new StudentData("Ʈ��1",10,100);
		map.put(st.name, st); //st.name = Ʈ��1 �� Ű �̰�, Ű ����, value = Ʈ��,10,100 �� put �Ѵ�.
		//**���� ������ put���� �Ѵ�.**
		
		StudentData ref = map.get("Ʈ��1"); //Ű�� "Ʈ��1"�� value�� get �Ѵ�.
		
		map.put("1��", new StudentData("Ʈ��1", 10, 5));
		//map.put("1��", new StudentData("Ʈ��2", 10, 5)); //Ű�� �ߺ��Ǹ� ���� ���� ������ ������.
		map.put("2��", new StudentData("Ʈ��2", 10, 5));
		map.put("3��", new StudentData("Ʈ��3", 10, 5));
		map.put("4��", new StudentData("Ʈ��4", 10, 5));
		map.put("5��", new StudentData("Ʈ��5", 10, 5));
		map.put("6��", new StudentData("Ʈ��6", 10, 5));

		//��ü�ݺ�
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(map.get(key).name);
		}
		
	}
}

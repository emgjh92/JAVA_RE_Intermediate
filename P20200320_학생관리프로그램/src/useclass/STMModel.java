package useclass;

//������ ����� ���
public class STMModel {
	private STData[] stList = new STData[100];
	private int stCount = 0;
	
	public int getCurrentStudentCount() {
		return stCount;
	}
	
	//�ֿ���
	public void addStudentData(STData data) {
		stList[stCount] = data;
		stCount++;
	}
	
	public STData getStudentData(int index) {
		return stList[index];
	}
	
	public int removeStudentDataByName(String name) {
		int removeCount = 0;
		for(int i=0; i<stCount; i++) {
			if(stList[i].getName().equals(name)) {
				for(int x = i; x<stCount; x++) {
					stList[x] = stList[x+1];
				}
				
				i--;
				
				stCount--;
				
				removeCount++;
			
			}
		}
		
		return  removeCount;
	}
}

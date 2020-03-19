
public class P07_싱글톤 {

	public static void main(String[] args) {
		
		//StManager m = new StManager();
		StManager m = StManager.getInstance();
		m.manage(); //단 한번만 생성하도록 설정하려면? ==> 싱글톤 사용
		
		//StManager m = StManager.getInstance();
		//==> instance 가 이 시점에선 null 이 아니므로 실행 불가
		
	}

}
//============싱글톤 (디자인 패턴의 일종 - 매우 유명 - 난이도 上 (디자인 패턴들 중에선 下))=====================
class StManager{
	//싱글톤 코드
	private static final StManager instance = new StManager();
	public static StManager getInstance() {
		
		return instance;
	}
	
	private StManager() {
		//...1번 호출 됨...
		System.out.println("생성자 호출 됨...");
	}

	/*~~~~~~~~~예전 버전 싱글톤 코드~~~~~~~~~~~~~~~~
	private static StManager instance = null;
	public static StManager getInstance() {
		if(instance == null) 
		{
			instance = new StManager();
		}
		return instance;
	}
	
	private StManager() {
		//...1번 호출 됨...
		System.out.println("생성자 호출 됨...");
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	*/
//=====================================================================================

	//아래...데이터 형태 및 메소드 들
	private int count;
	
	public void manage() {
		count++;
		System.out.println(count + "학생관리를 합니다.");
	}
}
class StData{
	public int score;
	public String name;
	
}



public class P3 {
public static void main(String[] args) {
	int i = 0;
	for(i=0; i<10; i++) {
		if(i==7) {
			break;
		}
	}		
	System.out.println(i);

	//for(int i=0; i<10; i++) { // i가 소멸되지 않았음으로 error
		
	//}
}
}

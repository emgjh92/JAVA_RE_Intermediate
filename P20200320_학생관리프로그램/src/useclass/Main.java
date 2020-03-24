package useclass;

public class Main {
	public static void main(String[] args) {
/*
static 변수(정적 변수) 는 분명 global 변수(전역 변수) 와는 다르다.
하지만, !!Java 언어 한정으로!! static을 활용하여 전역변수의 역할을 수행 하므로,
static = global 변수 라고 이해할 수 있다.
*/
		new STMContorller(new STMModel()).run();
	}
}

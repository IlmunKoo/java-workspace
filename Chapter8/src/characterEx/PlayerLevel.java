package characterEx;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage(); // 추상클래스로 남겨둬야 자식클래스에서 각자 다르게 수정할 수 있음!!

	// #추상 템플릿 작성: 캐릭터가 행동하는 정해진 동작들!! 변하지 않음
	//player가 아닌 playerLevel에 정의 이유??
	//초, 중, 고급자의 하위 클래스의 부모클래스가 이 클래스이기 때문,
	//추상클래스에서의 추상매서드만 공통일 뿐, 하위클래스들에서 모두 다르게 구현되므로 매서드가 모이는 부모클래스에서
	//매서드의 흐름을 정하는 템플릿을 작성하기 편하다
	
	
	//같이 들어오는 매개변수에 따라 jump하는 횟수 늘림 
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
		jump();
		}
		turn();

	}
}

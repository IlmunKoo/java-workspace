package abstractEx;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) { // player가 go하면 이 순서로만 실행!(변하지x)
		run();
		for (int i = 0; i < count; i++) { // 카운트만큼 점프
			jump();
		}
		turn();

	}

}

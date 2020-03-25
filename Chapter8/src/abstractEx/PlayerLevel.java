package abstractEx;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count) { // player�� go�ϸ� �� �����θ� ����!(������x)
		run();
		for (int i = 0; i < count; i++) { // ī��Ʈ��ŭ ����
			jump();
		}
		turn();

	}

}

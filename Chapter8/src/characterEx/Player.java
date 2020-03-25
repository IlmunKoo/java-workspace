package characterEx;

public class Player {

	// private PlayerLevel level;
	// �÷��̾���� �� ����Ŭ���� ���� �ۼ��ϰ� ���� �������� ����??

	private PlayerLevel level;

	// #������ �ۼ�
	public Player() { // �ʱ�ȭ ����
		level = new BeginnerLevel();
		level.showLevelMessage();

	}

	public PlayerLevel getLevel() {  //??
		return level;

	}

	// #���� ������ �Է¹��� ���ο� ������ �ٲٴ� �ż���
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();

	}

	public void play(int count) {
		level.go(count);
	}

}

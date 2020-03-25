package abstractEx;

public class Player {

//	BeginnerLevel blevel;
//	AdvancedLevel blevel;
//	SuperLevel blevel;
//�̷��� ¥�� ��ü����  ���α׷��� �ƴ�
//go�� �θ� ��� jump�� � ���� �θ��� ���Ҽ�x
//������ ������ �з��� �ʿ䰡 ���� ��, �� ������ �ٷ� �з��ϴ� ���� �ƴ϶�, ����Ŭ������ �ϳ� �����, �̸� ����ϴ� ����� ���Ѵ�.	

	private PlayerLevel level; 
	// PlayerLevel ��ӹ��� ��� Ŭ������ ���� �� ���� �� ������ ��, ��, ����� �� ���� �� ����

	public Player() { // ������
		level = new BeginnerLevel(); // �÷��̾�� ������ ���ʷ��� ����
		level.showLevelMessage(); // �⺻������ ���ʷ��� ����??
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level; // ���� ������ ���� �� ������ ���׷��̵�
		level.showLevelMessage();  //������ ����Ŭ������ �ִ� �޼���, ���� �ణ�� �ٸ�
	}

	public void play(int count) {
		level.go(count); // go�� �ҷ��� �� ��, ��, ��� �� ���� �Ҹ���(�ν��Ͻ� ���� �� Ŭ���� �ٸ��� ����� ����)
	}
}

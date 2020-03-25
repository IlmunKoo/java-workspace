package characterEx;

public class Player {

	// private PlayerLevel level;
	// 플레이어레벨과 그 하위클래스 먼저 작성하고 나서 마지막에 쓰나??

	private PlayerLevel level;

	// #생성자 작성
	public Player() { // 초기화 설정
		level = new BeginnerLevel();
		level.showLevelMessage();

	}

	public PlayerLevel getLevel() {  //??
		return level;

	}

	// #원래 레벨을 입력받은 새로운 레벨로 바꾸는 매서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();

	}

	public void play(int count) {
		level.go(count);
	}

}

package abstractEx;

public class Player {

//	BeginnerLevel blevel;
//	AdvancedLevel blevel;
//	SuperLevel blevel;
//이렇게 짜면 객체지향  프로그램이 아님
//go를 부를 경우 jump를 어떤 것을 부를지 정할수x
//세가지 레벨을 분류할 필요가 있을 때, 세 레벨을 바로 분류하는 것이 아니라, 상위클래스를 하나 만들고, 이를 상속하는 방식을 취한다.	

	private PlayerLevel level; 
	// PlayerLevel 상속받은 모든 클래스가 들어올 수 있음 이 변수에 초, 중, 고급자 다 들어올 수 있음

	public Player() { // 생성자
		level = new BeginnerLevel(); // 플레이어레벨 하위에 비기너레벨 포함
		level.showLevelMessage(); // 기본레벨에 비기너레벨 포함??
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level; // 나의 레벨을 받은 이 레벨로 업그레이드
		level.showLevelMessage();  //각각의 하위클래스에 있는 메서드, 서로 약간씩 다름
	}

	public void play(int count) {
		level.go(count); // go를 불렀을 때 초, 중, 고급 다 따로 불릴것(인스턴스 만들 때 클래스 다르게 만들기 때문)
	}
}

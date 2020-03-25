package abstractEx;

public class MainBoardPlayer {

	public static void main(String[] args) {

		Player player = new Player();   //Player생성자에 비기너레벨로 들어갔기 때문
	    player.play(1);
	    
	    AdvancedLevel aLevel = new AdvancedLevel();
	    player.upgradeLevel(aLevel);
	    player.play(2);  //jump두번!!(count만큼)
	    
	    SuperLevel sLevel = new SuperLevel();
	    player.upgradeLevel(sLevel);
	    player.play(3);
	}

}

//if문 쓰지 않고도 다형성에 의해 인스턴스가 불림!! 
//레벨 추가시 클래스만 추가해주면 됨
//가능추가시 상위클래스인 PlayerLevel에만 추가해주면 나머지 추가해서 구현 가능
//업그레이드/ 유지보수 용이 
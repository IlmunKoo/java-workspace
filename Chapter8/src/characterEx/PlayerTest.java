package characterEx;

import java.util.ArrayList;

public class PlayerTest {

	public static void main(String[] args) {
  
		
		Player player = new Player();
		player.play(1);
		
		IntermediateLevel iLevel = new IntermediateLevel();
		player.upgradeLevel(iLevel);
		//iLevel.play(2); 오류나는 이유: IntermediateLevel이 play에 대해 정의돼있지 않음!! Play메서드는 Player에서만 정의돼있음
		//따라서 play 메서드는 player함수에서 정의돼야 함, 다만 player의 레벨을 높여서 출력시킬 필요 있으므로 레벨업 먼저 시키고, 그에 따른 출력 나오게 해야 함 
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
		//player의 upgradeLevel함수의 매개변수 타입: PlayerLevel
		//이자리에 PlayerLevel의 자식클래스인 IntermediateLevel이 들어갔으므로
		//PlayerLevel의 인스턴스인 level의 클래스도 해당 매개변수의 클래스(IntermediateLevel)로 변화!!
		//따라서 play시 레벨에 따른 점프/ 달리기를 출력하 수 있다!
		//if문을 하나도 안쓰고 가능
		
	}

}

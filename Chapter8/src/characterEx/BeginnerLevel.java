package characterEx;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 못하지롱");

	}

	@Override
	public void turn() {
		System.out.println("turn은 못하지롱.");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("********초보자 레벨입니다.********");
		
	}
	
	//구현부 없으므로 출력함수 넣어도 출력되지 않음!!
	
	

}

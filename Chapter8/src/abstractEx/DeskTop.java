package abstractEx;

public class DeskTop extends Computer {

	// 둘중에 하나만 구현하고 싶을 때: abstract 아직도 가지고 있으므로 abstract 써줘야 함

	// 구현책임 있는 하위클래스, 재정의(오버라이드 책임 있음)
	public void display() {
		System.out.println("DeskTop display");
	}

	public void typing() {
		System.out.println("DeskTop display");

	}

	@Override   //맘에 안들면 재정의(오버라이딩) 가능
	public void turnOff() {
	//	super.turnOff(); 기본적으로 나오지만 이경우 사용x
		System.out.println("desktop turnoff");
		
		//이렇게 재정의하면 가상함수에서 인스턴스불림
	}
	
	

}

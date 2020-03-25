package abstractEx;

public abstract class Car {
	
	
	
    //#Car의 기능들 정의: 추상메서드와 구현된 클래스 나뉠 때=> 모든 매서드가 추상이 아닐 때는 클래스가 여전히 추상클래스
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	// public abstract void washCar(); 매서드  추가할 경우 하위클래스에서도 구현해줘야 함
	public void washCar() {	}  //하위클래스가 재정의시 기능추가되는 매서드=>AI에서 추가
	//반드시 모든 차가 세차해야할 경우 abstract 선언
	//모든 차가 할 필요 없을경우 구현부(바디)남겨두고, 템플릿에만 추가해준
	
	
	//#추상템플릿
	//정의되지 않은 추상메서드만 이탤릭체로 다르게 표시
	//정의된 메서드는 일반글씨체로 표시
	final public void run() {
		// final 넣어줌 => 이 시나리오는 변하면 안됨(하위클래스에서 재정의 불가), 틀이 되기 때문
		//차의 주행순서가 바뀔 수 없듯이
		startCar();  //AI와 Manual 모두 시동켜고 끄는것은 동일
		drive();   //운전과 멈추는 방식 다를 수 있음
		stop();
		turnOff();
		washCar();  //구현부에 아무것도 쓰지 않았기 때문에 AI에서만 오버라이딩하면 AI에서만 실행하도록 구현할 수 있음(재정의), Manual에서는 시동 끄고 끝

		
		//#final은 static과 자주 쓰임      static: 한번만 메모리에 잡힘, 바뀌지 않는 것들 주로 사용, 참조(.~)시 인스턴스 생성 않고 클래스이름으로 참조
		//final클래스는 더이상 상속되지 않음(상속하면 오버라이딩 등으로 상위클래스의 영향받음, java의 String클래스 같은 경우)
        //오버라이딩 불가
	}
}

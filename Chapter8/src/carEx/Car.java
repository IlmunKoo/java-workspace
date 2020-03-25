package carEx;

public abstract class Car {

	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();
	
	//#세차기능 추가, 모든 클래스에 추가하고 싶을 때, 일반메서드로 추가하고 추상템플릿에 추가해주면 끝!
	public void washCar() {
		System.out.println("세차를 시작합니다.");
		
	}

	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();

	}

}

package abstractEx;

//#추상클래스 : 단독으로 사용되는 것이 아니라 하위클래스에서 구체적으로 사용되려고 만들어짐
//구현해야 하는 매서드 상위클래스에서는 선언만 해 놓고, 구현의 책임 하위클래스에 위임(상속받은 클래스가 구현해야 함)
//컴퓨터의 경우 display와 typing의 매서드의 경우 종류에 따라 다름
//abstract 키워드가 붙으면 new(인스턴스 생성) 쓰일 수 없다.


public abstract class Computer {  //클래스부터 추상을 넣어줘야 함

	public abstract void display();   //세미콜론 바로 나오고 중괄호(바디) 없음, 구현하지 않겠다(추상클래스)
	public abstract void typing();  
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}

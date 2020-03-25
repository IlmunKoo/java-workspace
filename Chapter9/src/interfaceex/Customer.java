package interfaceex;

public class Customer implements Buy, Sell {// 두 개의 인터페이스 구현하겠다!
//Buy의 order와 Sell의 order가 중복되었다!! 어느 메서드를 쓸 것인지 정해라
//super로 어떤 order를 쓸 것인지, 혹은 재정의(override)할 것인지 선택	
	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");

	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void sayHello() {
		System.out.println("hello");
		
	}
}

package interfaceex;

public interface Sell {

	void sell();

	default void order() { // buy와 같은 이름
		System.out.println("판매 주문");
	}
}

package interfaceex;

public interface Sell {

	void sell();

	default void order() { // buy�� ���� �̸�
		System.out.println("�Ǹ� �ֹ�");
	}
}

package interfaceex;

public class Customer implements Buy, Sell {// �� ���� �������̽� �����ϰڴ�!
//Buy�� order�� Sell�� order�� �ߺ��Ǿ���!! ��� �޼��带 �� ������ ���ض�
//super�� � order�� �� ������, Ȥ�� ������(override)�� ������ ����	
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

package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();;
		customer.order();
		customer.sayHello();
		
		
		Buy buyer = customer; //buyer�� customer�� ����ȯ �Ǹ� 
		buyer.buy();  //ȣ���� �� �ִ� ���� buy�ۿ� ���� ��
		buyer.order();
		
		Sell seller = customer;  
		seller.sell();
		seller.order();
	
	
	//����Ʈ �ż��带 �дٰ� �ϴ���� ������ �ν��Ͻ��� �Ҹ���!
	
	//if(seller instanceof Customer ) {} =>true�̸� Customer�� ����ȯ �̷����
	//Buy, Sell: �������̽�, �� ���� implements �� ���� Customer
		
	}
}

package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();;
		customer.order();
		customer.sayHello();
		
		
		Buy buyer = customer; //buyer가 customer로 형변환 되면 
		buyer.buy();  //호출할 수 있는 것이 buy밖에 없게 됨
		buyer.order();
		
		Sell seller = customer;  
		seller.sell();
		seller.order();
	
	
	//디폴트 매서드를 둔다고 하더라고 구현된 인스턴스가 불린다!
	
	//if(seller instanceof Customer ) {} =>true이면 Customer로 형변환 이루어짐
	//Buy, Sell: 인터페이스, 이 둘을 implements 한 것이 Customer
		
	}
}

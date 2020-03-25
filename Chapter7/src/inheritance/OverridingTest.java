package inheritance;

public class OverridingTest {

	public static void main(String [] args) {
		Customer customerLee = new Customer(10010,"이순신");   //Customer 타입으로 인스턴스 생성
		customerLee.bonusPoint = 1000;
		
	
		VIPCustomer1 customerKim = new VIPCustomer1(10020,"김유신");  //VIPCustomer 타입으로 인스턴스 생성
		//생성자customer, VIPCustomer 두개가 불림
		
		customerKim.bonusPoint = 10000;

		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee +"원 입니다.");

		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim +"원 입니다.");
		
		Customer customerNo = new VIPCustomer1(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) +"원 입니다.");

	}
}

//#가상함수
//메서드: 객체지향의 멤버함수
//같은이름의 메서드는 없다! 
//오버로딩시 같은 메서드 쓴다고 할지라도 컴파일 될 때 이름이 조금씩 바뀜
//재정의되지 않았다면 상위클래스 메서드가 호출
//재정의됐다면 재정의된 메서드가 호출

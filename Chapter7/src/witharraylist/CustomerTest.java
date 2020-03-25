package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		// #인스턴스 생성(with 다운캐스팅, 그 고객등급에서만 할 수 있는 것들이 있기 때문(calcPrice))
		Customer customerKoo = new VIPCustomer(10001, "구일문", 12345); // VIPCustomer는 CustomerTest의 instance여야 함
		Customer customerKim = new GoldCustomer(10002, "김유신"); // 다운캐스팅
		Customer customerLee = new GoldCustomer(10003, "이순신");
		Customer customerHong = new Customer(10004, "홍길동");
		Customer customerKang = new Customer(10005, "강감찬");

		// #ArrayList 생성

		customerList.add(customerKoo);
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerHong);
		customerList.add(customerKang);

		System.out.println("=============고객정보 출력===================");

		for (Customer customer : customerList) { // 향상된 for문 : 배열에서만 사용 for(클래스 배열원소의 변수명 : 배열명), 원하는 변수명은 for문 안에서만 사용
			
			System.out.println(customer.ShowCustomerInfo());	

		}

		System.out.println("=============할인율과 포인트 계산===============");

		int price = 10000; // 기본 설정 10000원일 때

		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 지불하신 금액은" + customer.calcPrice(price));
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint);

			// 보너스포인트는 calcPoint에서 같이 계산했지만 리턴되지는 않음, 그냥 부르면 나온다

		}

	}

}

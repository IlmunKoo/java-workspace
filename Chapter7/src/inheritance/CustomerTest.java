package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
         
		Customer customerLee = new Customer(10010,"이순신");
		//상위 생성자 타입, 기본생성자 없어서 오류
		//customerLee.setCustomerName("이순신");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
	
		Customer customerKim = new VIPCustomer(10020,"김유신");
		//VIP는 Customer의 상속 받음, VIP에서 타입 끌어쓸 수 있음
		//상위클래스 타입(Customer으로 변수선언, 하위클래스(VIP)로 인스턴스 생성: 묵시적으로 이루어짐!(뭘 더 안해도 자연스레 이루어짐)
				
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		
		
		//super로 생성자에 매개변수 추가했으므로 여기도 매개변수 추가해준다
	    //CustomerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerLee.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		//customerLee = customerKim; 
		//하위클래스 타입(CustomerKim, VIP)은 상위클래스 타입(Lee, Customer)로 자동 (묵시적)형변환 된다(업캐스팅)
		//역은 성립하지 않음
		//Customer VC = new VIPCustomer();
		//하위클래스는 상위클래스가 확장된 형태에 addone을 한 것이므로 상위클래스를 그대로 가지고 감
		
		//customerKim.
		//메모리는 VIPCustomer 까지 만들어졌지만 타입은 Customer로 바뀌었으므로 customer에서 사용 가능한 변수밖에 뜨지 않는다!
	}

}

//VIP Customer만 생성했는데 Customer의 모든 변수 사용 가능(등급도 사용 가능)
//하위클래스 생성될 때 상위클래스가 반드시 먼저 호출돼야 함
//super가 먼저 들어가게 됨(상위클래스의메모리 위치, 참조값 가짐)
//클래스가 기본생성자 제공하지 않을 경우 super를 통해 명시적으로 호출, 상위클래스가 하위클래스보다 먼저 생성돼야 함, 따라서 상위클래스의 메모리가 먼저 잡힘
//상위클래스 인스턴스가 먼저 생성, 하위클래스 인스턴스가 나중에 생성
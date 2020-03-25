package inheritance;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	/*
	public Customer() {    //기본생성자  주로 멤버변수 초기화
		customerGrade = "SILVER";   //int: 0, string(객체): null로 초기화
			bonusRatio = 0.01;
			System.out.println("Customer() 생성자 호출");
	}*/
	
   
	
	//생성자 추가, 기본생성자는 제공안함
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";    //기본설정값들
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
		
	}
     
	
	//가격계산함수 정의
		public int calcPrice(int price) {   //역할: 가격 들어오면 보너스 포인트 적립해 주고 가격반환
		bonusPoint += price*bonusRatio;
		return price; //지불할 가격 반환
	}
		
		
	//정보출력함수 정의
	public String ShowCustomerInfo() {
		
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint +"점 입니다.";
	}
	
	
	
	//GetterSetter	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
 	
}

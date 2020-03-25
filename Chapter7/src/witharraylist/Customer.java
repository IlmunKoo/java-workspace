package witharraylist;

public class Customer {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint ;
    double bonusRatio;
    
    private void initCustomer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
    
    
    public Customer() {   //기본생성자?
    	  initCustomer();
    }
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
	    this.customerName = customerName;
	    
	    
	    initCustomer();
	}
	
	//가격계산함수(라고 쓰고 보너스포인트 계산함수라고 읽는다)
	
	public int calcPrice(int price) {   //함수 생성 시 : 접근제한자 자료형 함수이름(매개변수1, ...){내용} ex) public int blabla(int blabla){}
		
		//this.price = price;   이렇게 해 줄 필요없이  price 바로 써 주면 됨, price는 이 함수 안에만 쓸 것이기 때문에 밖에 정의해주지 않았고, 함수밖에 동일한 이름의 변수가 없을 경우 쓰지 않아도 됨
		
		bonusPoint += price*bonusRatio;
		return price ;
			}
	
	public String ShowCustomerInfo() {  //얘를 나중에 Customer인스턴스에 붙여서 사용 customerLee.showCustomerInfo()
		
		return customerName + "님의 등급은 " +customerGrade + " 이며, 보너스 포인트는" + bonusPoint +" 점 입니다."; 
	}

	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

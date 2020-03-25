package polymorphism;

public class GoldCustomer extends Customer {
  //상속받으려면 생성자에서 Customer의 매개변수 맞춰주고, super 써 줘야 함
	/*
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	//Customer의 속성들 가져옴
	 */
	 //원래는 다 가져와야 하지만 Customer 상속받으면 가져올 필요 없음
	
	double salesRatio;	//VIP와 동일
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //상위클래스의 Animal의 생성자가 기본생성자가 아닐경우 super를 써서 이를 끌어온다
		//두개의 매개변수 super로 호출
		
		//새로운 클래스 추가시 들어가는 비용 적음, 대부분의 구현을 상위클래스에서 해놨으므로 재구현만 해놓으면 됨(calcPrice정도)
		 
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		}
	
	public int calcPrice(int price) {
		bonusPoint += price* bonusRatio;
		return price - (int)(price*salesRatio);
	}

		
}

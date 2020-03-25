package inheritance;

public class VIPCustomer1 extends Customer {  
	
/*	public VIPCustomer1( )   
	{
		
		
		customerGrade = "VIP";   
		bonusRatio = 0.05;    
		salesRatio = 0.1;      
		
		System.out.println("VIP Customer()생성자 호출");
	}
*/

public VIPCustomer1(int customerID, String customerName) {  //아이디와 이름을 매개변수로 받는 생성자 만들고 그것으로 super를 명시적으로 불러라!

	super(customerID, customerName);
	customerGrade = "VIP";  
	bonusRatio = 0.05;
	salesRatio = 0.1;
	
	System.out.println("VIPCustomer(int, String) 생성자 출력");
	
}

double salesRatio;

private int agentID;  

@Override  //annotation: 컴파일러에게 오버라이딩된 매서드라고 말해줌
public int calcPrice(int price ) {
  bonusPoint += price * bonusRatio;
  return  price - (int)(price * salesRatio);
  //원래 클래스에서는 price를 바로 리턴했지만, 여기서는 할인된 가격 리턴(오버라이딩, 다르게 정의)
}



//오버로딩: 메서드 이름은 같지만 매개변수 이름 다름
//오버라이딩: 상위클래스의 이미 구현된 코드와 다른코드로 재구현

}

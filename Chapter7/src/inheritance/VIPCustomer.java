package inheritance;

public class VIPCustomer extends Customer {   //굳이 Customer에 있는 많은 기능들 다시 생성자에 넣는 것보다  상속하는 것이 낫다
                                              //Customer보다 VIPCustomer는 기능이 더 확장된 클래스이므로
	                                          //base를 Customer로 두고 add 하면 됨

	
	/*
	public VIPCustomer( )   //생성자(contructor)
	{
		//super();  //상위클래스의 기본생성자 호출, 원래는 없었지만 precompile단계에 들어가게됨(즉, 상위클래스가 먼저 생성됨!), 컴파일러가 호출
	   	//Customer에서 매개변수 있는 생성자 만들면 기본생성자 제공x, VIP에서 호출할 super가 없어서 빨간줄
		//이 경우 더 낮은 클래스에서(VIPClass) super를 명시적으로 불러줘야 함
        //Customer 매개변수와 동일한 VIPCustomer생성자 만들고, super 불러줌 		
		
		
		customerGrade = "VIP";   //상속받으면 하위클래스가 쓸 수 있다고 했지만, 밑줄뜨는 이유?
		//Customer에서 customerGrade가 private이기 때문(상속에서도 불가)
		//외부클래스에 대해 접근제한 하고 싶지만, 자식클래스에게는 접근허가해주고 싶을 때? protected
		//상속자에게는 public, 외부에는 private
		bonusRatio = 0.05;     //보너스 적립
		salesRatio = 0.1;      //할인율
		
		System.out.println("VIP Customer()생성자 호출");
	}*/


//VIPCustomer가 생성자 추가 제안
public VIPCustomer(int customerID, String customerName) {  //아이디와 이름을 매개변수로 받는 생성자 만들고 그것으로 super를 명시적으로 불러라!
	//=>customer의 매개변수 있는  생성자 불림
	super(customerID, customerName);
	customerGrade = "VIP";  
	bonusRatio = 0.05;
	salesRatio = 0.1;
	
	System.out.println("VIPCustomer(int, String) 생성자 출력");
	
}

double salesRatio;

private int agentID;  //담당 상담원 있음
	
}

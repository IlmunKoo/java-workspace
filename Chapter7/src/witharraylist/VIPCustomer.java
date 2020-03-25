package witharraylist;

public class VIPCustomer extends Customer {

	double saleRatio;
	private int agentId;

	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName); // 상속받은 클래스(CustomerEx)의 생성자가 기본생성자가 아닐 때 super() 안에는 자료형 들어가지x, 멤버변수와 매개변수 연결
		// VIP고객 특징 초기화
		customerGrade = "VIP";
		saleRatio = 0.1; // VIP에게만 해당되는 특징들은 따로 추가해줘야 함 (다른고객클래스엔 없으므로)
		bonusRatio = 0.05;

		this.agentId = agentId; // 멤버변수와 매개변수의 연결
	}

	// #가격계산함수: 각 고객의 클래스마다 있음, 고객마다 bonuspoint산정 달라서
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio; // 보너스포인트 계산

		return price - (int) (price * saleRatio); // 할인포인트 계산
	}

	// #정보출력함수
	public String ShowCustomerInfo() {
		return super.ShowCustomerInfo() + " 담당 상담원 번호는 " + agentId + "입니다."; // super: 자식클래스에서 부모클래스의 매서드 가져다 쓰고 싶을 때 사용, 오버라이딩시 사용(재정의)
	}

	public int getAgentID() {

		return agentId;
	}

}

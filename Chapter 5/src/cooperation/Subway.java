package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber =lineNumber;
	}
	//this: 자기 자신의 참조를 가지고 있는 키워드, 멤버변수임을 명확히 하기 위해 사용
	//this.멤버변수, this.멤버메소드, this()처럼 사용, 생성자를 호출
	public void take(int money) {
		
		this.money += money;
				passengerCount++;
		
	}
	public void showSubwayInfo() {
		System.out.println(lineNumber + "지하철의 승객은" + passengerCount + "명 이고, 수입은" +money+
				"입니다.");
}
}

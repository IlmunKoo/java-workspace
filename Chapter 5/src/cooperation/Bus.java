package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	//Bus의 constructor
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	
	//승객을 태우는 메서드
	public void take(int money) {   
	//버스가 가지는 돈은 money만큼 증가
		this.money += money;
		passengerCount++;
    //태우면 승객 수 증가
				
	}
	
		
	public void showBusInfo() {
		System.out.println(busNumber + "번 버스의 승객은" + passengerCount + "명 이고, 수입은" +money+
				"입니다.");
	}
}

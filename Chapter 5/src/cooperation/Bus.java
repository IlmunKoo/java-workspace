package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	//Bus�� constructor
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	
	//�°��� �¿�� �޼���
	public void take(int money) {   
	//������ ������ ���� money��ŭ ����
		this.money += money;
		passengerCount++;
    //�¿�� �°� �� ����
				
	}
	
		
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°���" + passengerCount + "�� �̰�, ������" +money+
				"�Դϴ�.");
	}
}

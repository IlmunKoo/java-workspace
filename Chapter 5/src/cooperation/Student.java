package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	
	//초기화 위해 constructor 하나 만듦
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		
	}
	//객체의 협업을 구현한 부분: 객체(bus)를 받고 그 객체의 메서드 호출, take는 버스의 메서드
	public void takeBus(Bus bus) {
		//버스를 타면 1000원 지불
		bus.take(1000);
		//그러면 내 돈은 1000원 감소
		this.money-= 1000;
		
	}
	//마찬가지로 협업 구현한 부분
	public void takeSubway(Subway subway) {
		subway.take(1200);
		//자기의 돈은 감소
		this.money -=1200;
		
	}
	
	
	
	//돈이 얼마나 남았는지 출력
	public void showInfo() {
		System.out.println(studentName +"님의 남은 돈은 " + money +"원 입니다.");
		
	}

}

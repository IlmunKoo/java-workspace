package scheduler;

public class RoundRobin implements Scheduler{   
	//추상클래스를 상속받을 때 extends 인터페이스를 상속받을 때 implements

	@Override
	public void getNextCall() {
	 System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		 System.out.println("다음 순서의 상담원에게 배분합니다.");

	}

}

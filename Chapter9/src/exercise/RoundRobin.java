package exercise;

public class RoundRobin implements CounselEx{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담전화를 다음순서의 상담원에게 배분합니다.");

	}

}

package exercise;

public class PriorityAllocation implements CounselEx {

	@Override
	public void getNextCall() {    //대기열에 쌓인 전화를 가져오는 방법
		System.out.println("고객등급이 높은 고객의 call부터 가져옵니다");

	}

	@Override
	public void sendCallToAgent() {  //가져온 전화를 배분하는 방법
		System.out.println("업무 숙련도가 높은 사원에게 배분합니다.");

	}

}

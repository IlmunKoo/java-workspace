package scheduler;

public interface Scheduler {

	public void getNextCall();
	public void sendCallToAgent();
}
//실제로 Scheduler의 상속 받은 클래스를 다 볼 필요는 x
//인터페이스가 어떻게 생겼는지만 보면 됨
//인터페이스의 역할: 모듈이 해야 할 일을 정의
//구체적인 구현 알 수도 있지만 모를 수도 있다
//인터페이스 보고 하면 되므로

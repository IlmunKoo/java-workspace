package scheduler;

public class RoundRobin implements Scheduler{   
	//�߻�Ŭ������ ��ӹ��� �� extends �������̽��� ��ӹ��� �� implements

	@Override
	public void getNextCall() {
	 System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		 System.out.println("���� ������ �������� ����մϴ�.");

	}

}

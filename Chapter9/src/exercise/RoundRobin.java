package exercise;

public class RoundRobin implements CounselEx{

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ��⿭���� �����ɴϴ�.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�����ȭ�� ���������� �������� ����մϴ�.");

	}

}

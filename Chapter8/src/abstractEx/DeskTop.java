package abstractEx;

public class DeskTop extends Computer {

	// ���߿� �ϳ��� �����ϰ� ���� ��: abstract ������ ������ �����Ƿ� abstract ����� ��

	// ����å�� �ִ� ����Ŭ����, ������(�������̵� å�� ����)
	public void display() {
		System.out.println("DeskTop display");
	}

	public void typing() {
		System.out.println("DeskTop display");

	}

	@Override   //���� �ȵ�� ������(�������̵�) ����
	public void turnOff() {
	//	super.turnOff(); �⺻������ �������� �̰�� ���x
		System.out.println("desktop turnoff");
		
		//�̷��� �������ϸ� �����Լ����� �ν��Ͻ��Ҹ�
	}
	
	

}

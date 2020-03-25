package abstractEx;

//#�߻�Ŭ���� : �ܵ����� ���Ǵ� ���� �ƴ϶� ����Ŭ�������� ��ü������ ���Ƿ��� �������
//�����ؾ� �ϴ� �ż��� ����Ŭ���������� ���� �� ����, ������ å�� ����Ŭ������ ����(��ӹ��� Ŭ������ �����ؾ� ��)
//��ǻ���� ��� display�� typing�� �ż����� ��� ������ ���� �ٸ�
//abstract Ű���尡 ������ new(�ν��Ͻ� ����) ���� �� ����.


public abstract class Computer {  //Ŭ�������� �߻��� �־���� ��

	public abstract void display();   //�����ݷ� �ٷ� ������ �߰�ȣ(�ٵ�) ����, �������� �ʰڴ�(�߻�Ŭ����)
	public abstract void typing();  
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}

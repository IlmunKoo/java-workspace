package characterEx;

public abstract class PlayerLevel {

	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage(); // �߻�Ŭ������ ���ܵ־� �ڽ�Ŭ�������� ���� �ٸ��� ������ �� ����!!

	// #�߻� ���ø� �ۼ�: ĳ���Ͱ� �ൿ�ϴ� ������ ���۵�!! ������ ����
	//player�� �ƴ� playerLevel�� ���� ����??
	//��, ��, ������� ���� Ŭ������ �θ�Ŭ������ �� Ŭ�����̱� ����,
	//�߻�Ŭ���������� �߻�ż��常 ������ ��, ����Ŭ�����鿡�� ��� �ٸ��� �����ǹǷ� �ż��尡 ���̴� �θ�Ŭ��������
	//�ż����� �帧�� ���ϴ� ���ø��� �ۼ��ϱ� ���ϴ�
	
	
	//���� ������ �Ű������� ���� jump�ϴ� Ƚ�� �ø� 
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
		jump();
		}
		turn();

	}
}

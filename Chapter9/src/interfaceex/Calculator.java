package interfaceex;

public abstract class Calculator implements Calc {
//class ��ӽ� extends�� ������ interface�� ��ӽ� implements�� ���(interface�� ���� �ִ� �͵��� ����)
//4�� ���� ������ �ƴ϶� �ΰ��� �ϰ���� ��� Ŭ������ abstract

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return  num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
}

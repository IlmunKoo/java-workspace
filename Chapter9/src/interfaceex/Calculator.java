package interfaceex;

public abstract class Calculator implements Calc {
//class 상속시 extends를 썼지만 interface는 상속시 implements를 사용(interface에 나와 있는 것들을 구현)
//4개 전부 구현이 아니라 두개만 하고싶을 경우 클래스는 abstract

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

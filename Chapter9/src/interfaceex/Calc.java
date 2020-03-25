package interfaceex;

public interface Calc {

	double PI = 3.14; // 상수가 된다
	int ERROR = -99999999; // integer범위 내 사용하지 않을 것 같은 수 사용

	int add(int num1, int num2);

	int subtract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// 인터페이스선언 목적: 명시된 사칙연산을 하라고 선언, 이에 대한 대략적인 설계 생각하고 선언

	// public String stringAdd(String s1, String s2) //함수의 시그니처 접근제한자, 반환자료형
	// 함수명(매개변수)

	default void description() { // 설명부
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
	}

	static int total(int[] arr) { // 인터페이스 타입으로 가져다 쓰게 하자!, 흔하게 쓰는 경우 인터페이스의 static메서드 제공시 인스턴스 생성 안하고 쓸 수 있음
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		mystaticMethod();  //static에서 일반메서드 호출불가! static은 인스턴스 생성하지 않고 불리므로
		return total;
	}

	private void myMethod() { // 자바 9부터 가능(private method)
		System.out.println("privae method");
	}

	private static void mystaticMethod() {
		System.out.println("privae static method");

	}
}

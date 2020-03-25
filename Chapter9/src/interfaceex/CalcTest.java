package interfaceex;

public class CalcTest {
	public static void main(String[] args) {

		// CompleteCalc밖에 new 할 수 있는 애 없음(얘만 완벽하게 구현돼있기 때문)
		Calc calc = new CompleteCalc();
		// Calc인터페이스 타입, Calculator로 선언 가능
		// 상속의 업캐스팅과 같은 원리, 타입에 따라 매서드 쓸 수 있는지여부 결정
		// 구현코드 없으므로 타입상속이라고도 말함
		int n1 = 10;
		int n2 = 2;

		System.out.println(calc.add(n1, n2));
		System.out.println(calc.subtract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));

		calc.description();
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = Calc.total(arr); // 인스턴스 변수로 가져다 쓰는 것이 아닌 인터페이스타입으로 가져다 씀(대문자)
		System.out.println(sum);   //인스턴스 생성 없이 바로 가져다 쓸 수 있다!
	}
}

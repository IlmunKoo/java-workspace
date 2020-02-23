package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		//매서드 잘 모르겠으니 복습시 뺄셈, 곱셈, 나눗셈도 할 것
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}// void: 반환하는 것(return)은 없고 출력하고 끝
	
	public static int calcSum() { //매개변수 필요 없이 return만 있음
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			sum += i;
			
		}
		return sum;
		
		//함수는 호출해줘야 작동이 됨
	}

	public static void main(String[] args) {
		// args(argument array): 매개변수도 함수의 변수, 지역변수(그 지역에서만 사용)라고도 함
		int n1 = 10;
		int n2 = 20;
		
		addNum(n1, n2);  //이러면 n1=10, n2=20을 각각 위에 int num1 , int num2로  넘겨주게 됨
		int total = addNum(n1, n2); //int result = num1 + num2; 이므로 int로 받아줘야 함
		
		// int num = sayHello("안녕하세요"); //void이므로 받는것이 아님! (return 없음)
		sayHello("안녕하세요");
		int num = calcSum();
		//이렇게 함수의 이름을 이용해서 함수를 부르는 것을 '함수를 호출한다'라고 함
		//함수 호출시 사용하는 메모리: stack이라고 부름, 들어갈 때는 아래에서 위로, 꺼낼 때는 위에서 아래로
		//함수 호출이 끝나면 메인만 남고, 자동으로 메모리가 반환된다
		//지역변수란 함수의 호출시 메인 위에 생성, 함수의 호출이 끝나면 자동으로 사라짐
		//함수 호출시 스택메모리가 어떻게 변화하는지 알아야 함
		System.out.println(total);
		System.out.println(num);
		
		
		

	}

}

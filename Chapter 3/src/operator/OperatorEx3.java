package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int num1 = 0B000001010; //10
		int num2 = 0B000000101; //5
		
		//둘다 1인 부분이 없음>> 곱하면 0
		
		//비트연산자의 논리
		System.out.println(num1 & num2);
		//and
		System.out.println(num1 | num2);
		//or
		
		System.out.println(num1 ^ num2);
		// Exclusive or : 두 개의 비트가 서로 다른 경우에만 1을 반환
		
		System.out.println(num2 << 1);
		//num2를 한칸씩 옆으로 밀면 num1과 똑같이 됨(10), 5*2
		System.out.println(num2 << 2);
		//5*2의 2승 >> 20
		System.out.println(num2 << 3);
		//5*2의 3승 >>40
		//but num2를 옆으로 민다고 해서 num2 자체가 바뀌지는 않음
		//num2를 바꾸려면 대입연산자= 를 같이 써 줘야 함
		System.out.println(num2 <<= 3);
		System.out.println(num2 >> 2);
		
		// 0B000000101 여기서 두칸 오른쪽으로 밀면 1만 남음
		
  
	}

}

package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		//3의 배수만 출력하자
		int num;
		for (num = 1; num <= 100; num++) {
			
			if((num % 3) != 0)continue;
			//아래 수행문이 무엇이든 조건과 맞기만 하면 for 문으로 넘어감>> num++ >>다시 넘어옴
			//0일때만 continue 뚫고 넘어옴
			
			System.out.println(num);
		}
		}

}

package loopexample;

public class ForExample {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		//어딘가에 합쳐야 하니 이것을 sum이라고 둔다
		//어느 값에 더해야 하니 값을 초기화해줘야 함
		
		for(int i = 0;i < 10; i++, count++) {
			sum += count;	 
		//여기에 써도 되고 괄호안 증감식칸에 써도 됨, 둘 중 하나만 쓸 것	count++쓸 경우 위에 count 초기화 해 줘야 함
			
					}
		//보통 횟수의 의미로 셀 때는 0부터 셈, 배열의 index도 0부터 시작
		System.out.println(sum);
				
		int num = 1;
		//while문은 초기화 바깥에서 해줌
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
		
		//for(;;){} >> for의 무한루프, 필요에 따라 초기화, 조건 생략 가능
		//while(true)와 같은 의미임
	}

}

package loopexample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
   /*    int num = 1;
       int sum = 0;
       
       do {
    	sum += num;
    	num++;
    	
    	 }while (num <= 10);
       
System.out.println(sum);
System.out.println(num);
	

*/ 
//한번 수행하고 while문 돌릴 때 Dowhile문 사용  but 여기서는 큰 차이 없음
		Scanner sc = new Scanner(System.in);
		int input;//input 먼저 선언 후 입력받을 것이므로 do-while을 쓴다
		int sum = 0;
		do {
			input = sc.nextInt();
			//입력받는 것이 여기서 한번 쓰임
			sum += input;
		}while(input != 0);
		//언제까지 도냐면 input이 not 이퀄 0까지 돌겠다
		
		System.out.println(sum);
		
		//일단 숫자를 하나 입력받은 후 이를 더해주는 것이 특징 
		//0 나오면 종료
	}
}
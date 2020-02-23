package loopexample;

import java.util.Scanner;

public class While_DoWhile_비교 {

	public static void main(String[] args) {
		 /*int num =1;
	     int sum = 0;
	       
	       
	       while (num <= 10) {
	    	   //while(true) >> 무한루프
	       sum += num;
	       num++; //11이 됐을 때 빠져나오게 됨
	    		        }
	System.out.println(sum);
	System.out.println(num);
    	*/
	int input;
	int sum = 0;
	Scanner scanner = new Scanner(System.in);
	input = scanner.nextInt(); //scanner에서 int를 받아줌
	
	
	
	while(input != 0) {//조건체크가 먼저이기 때문에 일단 input을 받아야 함
		sum += input;
		input = scanner.nextInt();   //input을 밑에서 한번 더 받아줌, 받은 값이 0이 아니면 돌아감
		// DoWhile은 한번 실행하고 그 결과에 의해 조건이 체크된다면, While은 처음부터 조건을 체크하고 돌림
		//반복문 코드는 혼자 짜볼 것 
		
	}
    		        
System.out.println(sum);

	}

}

package loopexample;

public class break_continue_example {

	public static void main(String[] args) {
		
		int num;
		int dan;
		
		for(dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) continue;
				//이 단이 짝수단이 아니면 위에 for조건문으로 갈 것임
			// 짝수단일 경우 밑의 for문으로 가서 돌 것임 >>짝수단 출력
			
			for(num = 1; num <= 9; num++) {
			
				if(num >= dan) break;// 위에있을 때와 밑에있을 때 다름, break하면 자신을 감싼 블럭만 빠져나감
				//빠져나가면 다음 단으로 이동
				System.out.println(dan + "X" + num +"="+dan*num);	
				
				
			}
			
			 
			System.out.println();
		}
	
	}
	}
	   


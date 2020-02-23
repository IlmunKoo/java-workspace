package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int num;
		//변수선언만 밖에서, 초기화는 for문 안에서 해야 돌릴 수 있음
		for(num =1; sum <= 100; num++) {
			sum += num;
			if( sum >= 100) break; //돌다가 100 이상이 되면 멈춰라!
			                       //하면 바로 빠져나옴(증감x)
			
				
		//선언된 num이므로 int를 따로 붙이지 않음					
		}
		System.out.println(sum);
		System.out.println(num);
		//변수선언이 for문 안에서 됐을 경우 for문 밖은 인식 못함(지역변수의 가시성)
		//블록 안에서만 유효함
		//num 변수선언은 밖에서, 초기화는 괄호 안에서 하면 됨

	}

}

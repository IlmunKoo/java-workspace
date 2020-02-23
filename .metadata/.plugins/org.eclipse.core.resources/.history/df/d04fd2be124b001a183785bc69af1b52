package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//scanner 빨간색-> ctrl+shift+o 자동 임포트
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
		case 1 : medalColor = 'G';
		 System.out.println("금메달");
		    break;
		   
		    //case가 끝났다는 의미로 break를 써 줘야 함, case문에는 중괄호 쓰지 않음
		    //break : 중괄호 빠져나가라는 의미
		    //break가 없으면 'G'에  금메달이 매치되어도 빠져나가지 않고 계속 다음문장으로 시행됨
		case 2 : medalColor = 'S';
		 System.out.println("은메달");
		    break;
		   
		case 3 : medalColor = 'B';
		 System.out.println("동메달");
		    break;
		   
		default : medalColor = 'A';		
		//없어도 됨 but 없을 경우
		//char medalColor = '초기값' 지정해줘야 함
	
		
		}
		
		System.out.println(rank + "등은" + medalColor + "메달 입니다.");
	}

}

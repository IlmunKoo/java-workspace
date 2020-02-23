package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		//Scanner: 입력을 도와주는 클래스
		//System.in: 입력용 스트링(표준입력)>> 콘솔에서 입력가능
		int age = scanner.nextInt();
		//원래는 나중에 입출력할때 씀
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 1500;
				}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		//else if 와 if의 차이: 
		//else if는 위의 if와 배타적 관계, 위의 if 다시 계산x
		//if는 배타적관계가 아니므로  위의 if를 한번 더 계산
		//else는 생략가능
System.out.println("나이: " + age);
System.out.println("요금: " + charge);
	}

}

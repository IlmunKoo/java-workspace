package loopexample;

import java.io.IOException;
import java.util.Scanner;

public class sachick {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		System.out.println("숫자를 두 개 입력하세요");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("연산자를 입력하세요");
		
		char operator;
		operator = (char)System.in.read();
		
		System.out.println(operator);
		
		float result = 0;
		
		if(operator == '+') {
			result = (int) (num1 + num2);
		}
		else if(operator == '-') {
			result = (int) (num1 - num2);
		}
		else if (operator == '/') {
			result = (float) (num1 / num2);
	}   else if (operator == 'X') {
		    result = (float) (num1 * num2);
	}
	else {System.out.println("연산자 오류입니다.");
	}
		
		System.out.println("결과 값은" + result+ "입니다");
		
	}}



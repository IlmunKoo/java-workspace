package loopexample;

import java.io.IOException;
import java.util.Scanner;

public class sachick {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		System.out.println("���ڸ� �� �� �Է��ϼ���");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("�����ڸ� �Է��ϼ���");
		
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
	else {System.out.println("������ �����Դϴ�.");
	}
		
		System.out.println("��� ����" + result+ "�Դϴ�");
		
	}}



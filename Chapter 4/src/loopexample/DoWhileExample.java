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
//�ѹ� �����ϰ� while�� ���� �� Dowhile�� ���  but ���⼭�� ū ���� ����
		Scanner sc = new Scanner(System.in);
		int input;//input ���� ���� �� �Է¹��� ���̹Ƿ� do-while�� ����
		int sum = 0;
		do {
			input = sc.nextInt();
			//�Է¹޴� ���� ���⼭ �ѹ� ����
			sum += input;
		}while(input != 0);
		//�������� ���ĸ� input�� not ���� 0���� ���ڴ�
		
		System.out.println(sum);
		
		//�ϴ� ���ڸ� �ϳ� �Է¹��� �� �̸� �����ִ� ���� Ư¡ 
		//0 ������ ����
	}
}
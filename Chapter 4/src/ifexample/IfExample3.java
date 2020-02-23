package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
	/*Scanner scanner = new Scanner(System.in);
	
	int score = scanner.nextInt();
	
	char grade;
	
	if (score < 59) {
		grade = 'F';
	} else if (score <= 69) {
		grade = 'D';
	} else if (score <= 79) {
		grade = 'C';
	} else if (score <= 89) {
		grade = 'B';
	}
	else {
		grade = 'A';
		}
	
	
	System.out.println("점수 :" +  score);
	System.out.println("학점 :" + grade);
	
	
		
*/
	

	//가독성은 if-else문이 더 좋지만, 조건연산자도 가끔 쓴다!
	int a = 10;
	int b = 20;
	
	int max;
	max = (a > b)? a : b;
		System.out.println(max);	
	}
			}

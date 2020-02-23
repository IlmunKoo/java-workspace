package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
 int score = 100;
 System.out.println(++score);
 //score = score + 1;
//score += 1;
 
 System.out.println(score++);
 //문장이 끝난 후(출력 후) 증가되므로 증가되기 전 값이 나옴, 문장이 끝났으므로
 //한 번 더 출력해줘야 증가한 값이 나옴
 System.out.println(score);
 System.out.println(--score);
 System.out.println(score--);
 System.out.println(score);
	}

}

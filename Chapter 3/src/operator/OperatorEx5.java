package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
 int score = 100;
 System.out.println(++score);
 //score = score + 1;
//score += 1;
 
 System.out.println(score++);
 //������ ���� ��(��� ��) �����ǹǷ� �����Ǳ� �� ���� ����, ������ �������Ƿ�
 //�� �� �� �������� ������ ���� ����
 System.out.println(score);
 System.out.println(--score);
 System.out.println(score--);
 System.out.println(score);
	}

}

package loopexample;

public class WhileExample {

	public static void main(String[] args) {
       int num =1;
       int sum = 0;
       
       
       while (num <= 10) {
    	   //while(true) >> ���ѷ���
       sum += num;
       num++; //11�� ���� �� ���������� ��
    		        }
System.out.println(sum);
System.out.println(num);
	}

}


// sum += num; >> sum�� num�� ���ؼ� ���� sum�ڸ��� �ִ´�
//num++>> 1�� ���� �� �ٽ� while ���ǹ��� ���� num =2 sum =1
//sum += num >> num =2 sum= 3
//num++>>num =3  (3,3)
//sum = 6, num =4
//sum = 10, num = 5
//sum = 55, num = 10
//num= 11 ���� ���� ��������  
package variable;

public class DoubleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//부동소수점의 오류
		double dNum = 1;
for( int i = 0; i  < 10000; i++) {
	dNum = dNum + 0.1;
	}
System.out.println(dNum);
	}

}
//1001로 정확히 표현x, 이정도의 오차 감수하고 더 많은 수 표현
package variable;

public class DoubleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double dNum = 3.14;
float fNum = 3.14F;
//float는4바이트, double은 8바이트-> 3.14는 더블로 저장(8바이트)
//->3.14 뒤에 식별자 F를 써 줘야 함
//아무 표시 없이 실수 쓸 경우 컴퓨터는 double로 이를 인식
//float라 치고 double로 인식하니 오류>> float로 쓰겠다는 의미에서 (float)fNum or 3.14F로 써 줘야 함
//기본적으로 Double을 많이 사용, 매개변수 받는 경우 float사용

System.out.println(dNum);
System.out.println(fNum);

	}

}

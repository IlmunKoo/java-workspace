package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte)i;
		//4바이트(int)가 1바이트(byte)에 들어가면 오류, 그래도 넣고싶으면 명시적 형변환but 데이터 유실 위험
		// -128~127까지 표현가능하므로 오류가 뜨게 됨
		System.out.println(bNum);
		
		double dNum1 =1.2;
		float fNum = 0.9F;
	
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1);
		//실수를 정수화할 경우 소수점 아래는 버림(명시적 형 변환), 이 과정에서 데이터 유실 가능
		//1
		System.out.println(iNum2);
	 	//2
		 
	}

}

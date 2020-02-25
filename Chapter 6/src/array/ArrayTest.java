package array;

public class ArrayTest {

	public static void main(String[] args) {
		//int 는 기본 자료형, 참조 자료형과 다름
		//객체로 돼 있는 선언과 몇바이트짜리인지 정해져서 기본자료형으로 돼 있는것과는 크기가 다르다.
		
		//int[] arr = new int[](1,2,3)
				//선언과 동시에 초기화>> int[] arr = (1,2,3)  >>new 생략가능
				//초기화시 꺾쇠 안에 숫자 안넣음, 
		
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

			 //먼저 찍어본다. System.out.println(arr[i]); 
		
		//i가 있는데 또 선언해도 되는 이유: 여기서는 지역변수로 선언, for문 다음 중괄호에서만 유효
		//빠져나오는 순간 사라짐, 멤버변수는 중복선언 불가
		for(int i = 0; i <arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		
		double[] dArr = new double[5];
		
		int count = 0;
		//dArr.length는 5개인데 유효한 값이 3개밖에 없을 경우 count변수 생성해서 돌린다
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
				
		//나머지 두개는 0.0으로 초기화되므로 출력값 0이 나옴
		
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);

	}

}

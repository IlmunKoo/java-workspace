package array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		//기본자료형: 5x4 =20바이트씩 잡힘
		int[] arr2 = {1, 2, 3, 4, 5};	
		
		
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}//출력값 1 10 20 30 5
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//시스템이라는 클래스의 static메서드
		//src: source(어디서), sourceposition(어디서부터)0번째부터
		//destination(어디에다가) destinationPosition
		//length: 소스로부터 몇개

	}

}

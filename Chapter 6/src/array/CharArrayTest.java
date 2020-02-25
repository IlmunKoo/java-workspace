package array;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] arr = new char [26];
		char ch = 'A';
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = ch++;
			//A는 65의 값을 가짐, 이후부터 차례로 정수로 표현됨
						
					
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+","+(int)arr[i]);
		}
		
	}

}

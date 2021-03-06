package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		
		// 2 X 3
		int dan = 2; //for문에서는 조건 안에 초기화가 있지만 while에서는 없으므로 처음에 따로 해 줘야 함
		int count = 1;
		
	/*	for( dan = 2; dan <= 9; dan++) {
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + " = " +dan*count);
				
			}	
			System.out.println();
			
		} */
		
		while( dan <= 9) {
			count = 1;
			//초기화 해줘야함
			while(count <= 9) {
				System.out.println(dan + "X" + count + " = " +dan*count);
				count++; //for문에서는 count++이 있었지만 while문에서는 없으므로 따로 넣어줘야 함
				 
				
			}
			dan++;  //count++과 같은맥락
			System.out.println();
			
			//이렇게 하면 2단까지밖에 안나옴 >> 2단 끝나고 count값이 10일때 다시3단 시작하려면 초기화가 되어야 함,
			//but 그런 것이 없으므로 들어가지 못함
		}

	}

}

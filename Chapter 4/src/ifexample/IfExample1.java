package ifexample;

public class IfExample1 {

	public static void main(String[] args) {

		char gender = 'M';
		
		if (gender == 'F') {
			System.out.println("여성입니다");
			//char가 M이었을 경우 출력결과x(다른 수행문 없으므로)
			//블럭 시작되면 반드시 들여쓰기 해야함
			}
		else {
			System.out.println("여성이 아닙니다");
			//큰따옴표/작은따옴표 맞춰줘야 함
		}
	}

}

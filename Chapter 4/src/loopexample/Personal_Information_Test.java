package loopexample;

public class Personal_Information_Test {

	public static void main(String[] args) {
		
		Personal_Information person = new Personal_Information();
		person.age = 40;
		person.name = "James";
		person.IsMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("나이 : "+ person.age);
		System.out.println("이름 : "+ person.name);
		System.out.println("결혼 여부 : "+ person.IsMarried);
		System.out.println("자녀 수 : "+ person.numberOfChildren);

	}

}

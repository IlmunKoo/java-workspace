package loopexample;

public class Personal_Information_Test {

	public static void main(String[] args) {
		
		Personal_Information person = new Personal_Information();
		person.age = 40;
		person.name = "James";
		person.IsMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("���� : "+ person.age);
		System.out.println("�̸� : "+ person.name);
		System.out.println("��ȥ ���� : "+ person.IsMarried);
		System.out.println("�ڳ� �� : "+ person.numberOfChildren);

	}

}

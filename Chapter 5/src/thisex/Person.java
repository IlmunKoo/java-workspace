package thisex;

public class Person {

	
	String name;
	int age;
	//������� �� ���� �� string: null, age�� 0���� �ʱ�ȭ��
	
	
	public Person() {
		
		this("�̸� ����", 1);
		//this�� �ٸ� ������ ȣ���� �� �ݵ�� ù ��° statement���� ��(���� �ٸ� statement�� ����!)
		//�ν��Ͻ� ������ �ʱ�ȭ�ϴ� ��
	}
	//(): ����Ʈ ����Ʈ����(�⺻ ������)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	public Person getSelf() {
		return this;
		//�̶� ��ȯŸ���� Ŭ���� �ڽ�!!(�̰�� Person)
	}
}

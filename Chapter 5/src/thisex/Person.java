package thisex;

public class Person {

	
	String name;
	int age;
	//멤버변수 안 썼을 때 string: null, age는 0으로 초기화됨
	
	
	public Person() {
		
		this("이름 없음", 1);
		//this로 다른 생성자 호출할 때 반드시 첫 번째 statement여야 함(위에 다른 statement는 못옴!)
		//인스턴스 생성을 초기화하는 일
	}
	//(): 디폴트 컨스트럭터(기본 생성자)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	public Person getSelf() {
		return this;
		//이때 반환타입은 클래스 자신!!(이경우 Person)
	}
}

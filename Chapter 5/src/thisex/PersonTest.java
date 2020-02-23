package thisex;

public class PersonTest {

	public static void main(String[] args) {
		Person personNoname = new Person();
		personNoname.showInfo();
		
		Person personLee = new Person("Lee", 20);
	    personLee.showInfo();
	    System.out.println(personLee);
	    //참조변수personLee의 값과 참조변수personLee.getSelf가 가져온 값이 같다
	   
	    
	    Person p = personLee.getSelf();
	    System.out.println(p);
	
	}
	
}

package classpart;

public class Student_constructor {

	
	public int studentID;
	
	public String studentName;
	public String address;
	
	public
	
    public Student_constructor(int id, String name) {
		studentID = id;
		studentName = name;
		//두개의 멤버변수에 각각 대응하는 매개변수를 넣어 주겠다
		//public 다음에는 클래스 이름과 동일한 이름이 들어와야 한다
		
	}
    
    //생성자에 내용이 들어갈 경우 studentTest에 있는 디폴트 생성자에는 오류가 뜸: 
    //생성자 안에 내용이 있을 경우 디폴트생성자 지원하지 않기 때문
    //이를 해결하려면 디폴트 생성자를 직접 만들어 주거나 디폴트 생성자 자체를 제공하지 않으면 됨
    
}

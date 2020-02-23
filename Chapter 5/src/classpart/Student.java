package classpart;

public class Student {
	//class 는 객체의 청사진: 객체의 기능 구현 담당 but 객체의 속성값 대입되지는 않음> 대입하려면 객체 생성해서 써야 함
	public int studentID;
	//public>> 접근 제어자(access modifier), 여기서는 써도 되고 안 써도 됨 
	public String studentName;
	public String address;
	//멤버 변수 혹은 속성이라고 불림-> 속
	// 학생의 정보를 보여줌>> 기능: 메서드로 구현
	
	public void showStudenInfo() {
	System.out.println(studentName + ","+ address);}
	
	public String getStudentName() {
		//void가 아니라 반환해 주기 때문에 string이 들어가야 함
	return studentName;
	//멤버변수(스튜던트 이름)를 반환해 주는 메서드를 만들게 됨
	
	}
	
	
	//void: 반환하는 값의 데이터타입, 반환하는 것이 아무것도 없을 때는 void를 사용
	//이 함수의 경우 매개변수도 없고 반환값도 없음, 출력만 하게 되어 있음
	//이를 클래스 안에 만들면 매서드라고 함
	//매서드: 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	//매서드를 구현함으로써 객체의 기능이 구현됨
	//매서드의 이름은 사용하는 쪽(=클라이언트 코드)에 맞게 명명하는 것이 좋음
	//서비스를 제공하는 쪽: 서버 코드, 서비스를 사용하는 쪽: 클라이언트 코드
	//변수/ 매서드 이름은 소문자로 시작해서 camel case
	
	//파란변수: 클래스에 전반적으로 쓰이는 멤버변수 , 보라색 변수: 매서드 안에서 쓰려고 선언된 변수
	//멤버변수는 new 했을 때 heap이라는 메모리에 생김(동적 메모리)
	
	
	

}

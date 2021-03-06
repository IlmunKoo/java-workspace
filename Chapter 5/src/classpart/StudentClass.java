package classpart;

public class StudentClass {

	public static void main(String[] args) {
		//클래스의 메인은 없는 경우가 대부분
		//웹서버가 없으니 standalone으로 여기서 돌려봐야 함
		Student studentlee = new Student();
		//Student라는 클래스 이름으로 변수선언, new는 생성한다는 의미, Student:클래스 이름과 동일
		//Student 변수 생성할 경우 Heap(다이나믹 메모리, 동적 메모리)에 저장
		//studentlee는 stack에 저장, 이는 heap의 instance의 위치를 가리키게 됨
		//각각의 instance는 별개의 메모리를 갖는다
		
		//메모리에 클래스 생성
		studentlee.studentName = "이순신";
		studentlee.address = "서울";
		//여기서 address는 메서드
		studentlee.showStudenInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudenInfo();
		
		
		System.out.println(studentlee);
		System.out.println(studentKim);
		//studentlee가 stack으로 감
		//자바 파일 하나에 여러 개의 클래스 존재 가능, but public클래스는 하나, pulic class이름 = 자바 파일 이름이어야 함
		//classpart.Student@15db9742 >>런 했을 때 결과값, 패지키 이름.클래스 이름@주소값(Heap의 instance주소), 가상 주소값
	    //참조변수 출력시 위와 같은 참조값이 출력	
		//구동방법은 두가지: 
		//메인을 따로 가지고 있는 Student 와 StudentClass를 분리하거나 구동을 위한 부분인 메인을 밑에 넣어주는 방법

	}

}

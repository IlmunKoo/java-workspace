package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		// Computer computer = new Computer(); 당연히 추상클래스는 new 불가! 인스턴스로 호출할 기능 없으므로
		Computer computer = new DeskTop(); // 상속에서 상위클래스 변수타입으로 하위클래스 인스턴스 생성되어 대입될 수 있다!(묵시적 형변환)
		computer.display();
		computer.turnOff();
		
		NoteBook myNoteBook = new MyNoteBook(); //NoteBook, Computer, MyNoteBook 둘 중 아무 타입으로 해도 상관없음(항상 상위클래스 내포)
		
	}

}

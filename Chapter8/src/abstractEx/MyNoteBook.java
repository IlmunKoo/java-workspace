package abstractEx;

public class MyNoteBook extends NoteBook {

	@Override
	public void display() {
		// 추상클래스로 상위에서 선언된 것 중 NoteBook에서 구현되지 않은 것들 마저 구현
		// NoteBook은 추상클래스이지만 그 상속을 받은 MyNoteBook은 선언된 모든 추상클래스 메서드를 구현했으므로 더이상 추상클래스가 아님
		
		System.out.println("MyNoteBook display");

	}

}

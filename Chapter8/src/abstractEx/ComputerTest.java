package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {
		// Computer computer = new Computer(); �翬�� �߻�Ŭ������ new �Ұ�! �ν��Ͻ��� ȣ���� ��� �����Ƿ�
		Computer computer = new DeskTop(); // ��ӿ��� ����Ŭ���� ����Ÿ������ ����Ŭ���� �ν��Ͻ� �����Ǿ� ���Ե� �� �ִ�!(������ ����ȯ)
		computer.display();
		computer.turnOff();
		
		NoteBook myNoteBook = new MyNoteBook(); //NoteBook, Computer, MyNoteBook �� �� �ƹ� Ÿ������ �ص� �������(�׻� ����Ŭ���� ����)
		
	}

}

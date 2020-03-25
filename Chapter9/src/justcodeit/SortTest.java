package justcodeit;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("���Ĺ���� �����ϼ���");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeaSort");
		System.out.println("Q: QuickSort");

		int ch = System.in.read();
		// �ԷµǴ� ����(ch)�� ���� �ν��Ͻ� �ٸ��� ����!!(�����Ҵ�)

		Sort sort = null; // ���� �ν��Ͻ� �����, � Ŭ������ ���� �� �𸣴� ���� �������̽��� SortŸ������ ����

		// #�Էµ� ���ڿ� ���� ������ �ν��Ͻ� ����
		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort(); // �Էµ� ����Ŭ������� �ν��Ͻ� ����
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeaSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else
			System.out.println("�������� �ʴ� �����Դϴ�.");

		
		//#�� �迭 ����
		int[] arr = new int[10];  
		
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}

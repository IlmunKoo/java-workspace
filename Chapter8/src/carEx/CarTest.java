package carEx;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		// ArrayList(�迭)�� ó��
		ArrayList<Car> CarList = new ArrayList<Car>();

		// Sonata sonata = new Sonata();
		// Grandeur grandeur = new Grandeur();
		// Avante avante = new Avante();
		// Genesis genesis = new Genesis();

		// CarList.add(sonata);
		// CarList.add(grandeur);
		// CarList.add(avante);
		// CarList.add(genesis);

		// #���ο� �߰� ���(���� �߰��� ���� �ѹ��� �߰��� ��, ��ó�� �ν��Ͻ��� ���� ����x
		//ArrayList�� CarŬ������ ���� ���̹Ƿ� �ٷ� �߰� ����
		CarList.add(new Sonata());
		CarList.add(new Grandeur());
		CarList.add(new Avante());
		CarList.add(new Genesis());

		// #for�� ���鼭 ArrayList ���빰 Ȯ���ϰڴ�!
		for (Car car : CarList) { // �� Ŭ������ �ν��Ͻ��� �迭�� �� �ִ� ����
			car.run(); // CarŬ������ ����

			System.out.println("=====================");

		}

	}

}

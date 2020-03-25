package carEx;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		// ArrayList(배열)로 처리
		ArrayList<Car> CarList = new ArrayList<Car>();

		// Sonata sonata = new Sonata();
		// Grandeur grandeur = new Grandeur();
		// Avante avante = new Avante();
		// Genesis genesis = new Genesis();

		// CarList.add(sonata);
		// CarList.add(grandeur);
		// CarList.add(avante);
		// CarList.add(genesis);

		// #새로운 추가 방법(따로 추가할 것을 한번에 추가해 줌, 위처럼 인스턴스명 따로 정의x
		//ArrayList가 Car클래스에 관한 것이므로 바로 추가 가능
		CarList.add(new Sonata());
		CarList.add(new Grandeur());
		CarList.add(new Avante());
		CarList.add(new Genesis());

		// #for문 돌면서 ArrayList 내용물 확인하겠다!
		for (Car car : CarList) { // 각 클래스의 인스턴스가 배열에 들어가 있는 상태
			car.run(); // Car클래스의 변수

			System.out.println("=====================");

		}

	}

}

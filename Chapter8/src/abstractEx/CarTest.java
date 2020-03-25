package abstractEx;

public class CarTest {

	public static void main(String[] args) {

		Car aiCar = new AICar(); // 인스턴스 타입을 AICar로 해도 되고 Car로 해도 됨
		aiCar.run();

		System.out.println("====================");
		Car manualCar = new ManualCar();
		manualCar.run();
	}

}

//아래처럼 프레임워크는 흐름이 정해져 있다!

//시동을 켭니다
//자율 주행합니다.
//자동차가 스스로 방향을 바꿉니다.
//스스로 멈춥니다
//시동을 끕니다
//====================
//시동을 켭니다
//사람이 운전합니다.
//사람이 핸들을 조작합니다.
//브레이크를 밟아서 정지합니다.
//시동을 끕니다


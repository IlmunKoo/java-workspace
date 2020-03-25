package exercise;

import java.io.IOException;

public class CounselTest {

	public static void main(String[] args) throws IOException {  //일단 예외처리

		System.out.println("전화상담원 할당 방식을 선택하세요");
		System.out.println("R: 한 명씩 차례대로 ");
		System.out.println("L: 대기가 적은 상담원 우선");
		System.out.println("P: 우선순위가 높은 고객 우선, 숙련도 높은 상담원");
		
		int ch = System.in.read();  //입력받는 것을 여기에 담겠다
		CounselEx scheduler = null; //동적할당위해 주소값 비워줌
		if(ch == 'R' || ch == 'r') {
		    scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		//입력값에 따라 인스턴스 생성(힙에 동적할당 후, 그 인스턴스에 맞는 매서드 동작시킴
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

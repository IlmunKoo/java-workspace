//#다양한 변수처리 방법
//프로그램 실행 위해 프로그램이 메모리에 적재(load)돼야 함
//이후에 cpu가 메모리에서 한줄씩 읽고 실행
//프로그램 충당하 수 있을 만큼 메모리 있어야 함
//프로그램 실행하면 메모리에 적재 후 실행
//코드영역: 한줄씩 실행시킬 수 있는 소스코드
//데이터 영역: 전역변수&정적 변수

//#전역변수(global variable): 어디서든 접근 가능
//main함수 실행 전에 프로그램 실행과 동시에 메모리(데이터 영역)에 
//할당(적재)
//메모리의 데이터영역에 적재됨

//전역변수(메인함수의 바깥쪽에 선언)
/*
#include <stdio.h>
int a = 5;   // 얘가 전역변수

void changeValue() {
	a = 10;  //메인함수가 아닌 다른 함수에서도 바로 접근 가능

}

int main(void) {
	printf("%d\n", a);
	changeValue();
	//a값 바꿔줌
	printf("%d\n", a);
	system("pause");

}

//#지역변수
// 특정 블록에서 사용, 함수 종료되면 메모리에서 해제
// 프로그램 전체에서 사용x, 데이터가 아닌 스택영역에서 기록


#include <stdio.h>


int main(void) {
	int a = 7;
	if (1) {
	//	int a = 5; //블록 안에서 초기화>> 지역변수
		//괄호 나가면 사라짐
		//지역변수가 아니라 공통적으로 사용되는 변수 넣고 싶을 때
		a = 5; 
		//로 사용해야 바뀐다!
		
	}
	printf("%d\n", a);
	//출력은 바깥쪽에서 선언된 7로 출력
	system("pause");

}*/
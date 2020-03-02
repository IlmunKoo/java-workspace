//#함수 포인터
//배열의 이름이 메모리 주소값을 반환하듯
//함수포인터도 내부적으로 정보가 저장


//함수의 주소값 출력(반환)
/*
#include <stdio.h>

void function() {
	printf("It's my function.");
}
	int main(void) {
		printf("%d\n", function);
		
		system("pause");

	}

//#함수 포인터 : 특정 함수의 반환 자료형을 지정
//함수 포인터 이용시 형태가 같은 서로 다른기능의 함수
//사용 가능

	//반환 자료형(*이름)(매개변수) = 함수명;
	
	//#매개변수 및 반환자료형이 없는 함수 포인터
#include <stdio.h>

void myFunction() {
	printf("It's my function\n");
}

void yourFunction() {
	printf("It's your function\n");
}

int main(void) {
	void(*fp)() = myFunction;
	//자료형 void, 매개변수 없음
	fp();
	//함수 실행
	fp = yourFunction;
	//이후에 가리키는 함수 yourfunction으로 바꿈
	fp();
	//즉, 형태가 비슷한 두 함수를 같은 명령어로
	//불러올 수 있다!
	system("pause");

}

//#매개변수 및 반환 자료형이 있는 함수 포인터
#include <stdio.h>


int add(int a, int b) {
	return a + b;
}

int sub(int a, int b) {  //subtract, 빼기함수
	return a - b;
}

int main(void) {
	int(*fp)(int, int) = add;
	//반환자료형 int, 매개변수 int
	//*fp는 add를 가리킴

	printf("%d\n", fp(10, 3));

	fp = sub;

	printf("%d\n", fp(10, 3));
	 
	system("pause");

	//매개변수, 반환 자료형 있어도 똑같이
	//함수 포인터 이용해서
}*/
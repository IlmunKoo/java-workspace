//#재귀함수
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int factorial(int a) {
	if (a == 1) return 1;
	//종료조건 있음, f(5)일경우 f(5)f(4)f(3)f(2)f(1)
	//반복문 이용하지 않고도 재귀함수 사용해서
	//반복문과 유사한 형태 구현 가능
	//반복문보다 짧은 코드=> 유용한 사용 가능
	else return a * factorial(a - 1);
	//factorial함수가 다른 factorial 함수를 불러옴
	// =>재귀함수
	//무한루프 조심(반드시 종료조건 만들기)

}

int main(void) {
	int n;
	printf("n 팩토리얼을 계산합니다. ");
	scanf("%d", &n);
	//사용자로부터 n값 입력받음
	printf("%d\n", factorial(n));
	system("pause");
}

//C언어는 함수로 시작해서 함수로 끝남
//프로그램 시작과 동시에 메인함수 실행
//메인함수는 또다른 함수를 불러오므로
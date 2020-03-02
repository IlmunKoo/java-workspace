//#정적변수: 특정한 블록에서만 접근
//프로그램 실행과 동시에 메모리에 할당되기는 하지만
// 특정블록에서만 접근 가능
//지역변수와 전역변수 특징 모두 가짐
/*
#include <stdio.h>
void process(){

static int a = 5;
//프로그램 실행과 동시에 변수 a가
//메모리 적재
//이후에 process실행할 때마다
//a에 적재된 것 무시하고 1을 더한 값 출력
a = a + 1;
printf("%d\n", a);
}

int main(void) {
	process();
	process();
	process();
	system("pause");

}*/
//#논리 연산자
// !: not의 의미
// &&: 그리고 (모두 참이어야 참)
// ||: and 의 의미(하나라도 참이면 참)
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	printf("%d\n", !a); //not a
	printf("%d\n", a && b); //a,b 둘 다 참값
	printf("%d\n", (a > b) && (b > c));
	//수학에서는  a > b > c로 한번에 연산
	//but 컴퓨터에서는 앞에서부터 연산,
	//a>b 한번 하고 끝내버리므로 
	//참일경우 1 > c 가 되어버림
	system("pause");
} */
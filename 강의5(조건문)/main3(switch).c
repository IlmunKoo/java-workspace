// #switch문
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	printf("학점을 입력하세요.");
	char a;
	scanf("%c", &a); //%c: 문자가 들어가겠다
	switch (a) {
	case 'A' :
		printf("A학점입니다\n"); break;
	case 'B':
		printf("B학점입니다\n"); break;
	case 'C':
		printf("C학점입니다\n"); break;
	default:  
		printf("학점을 바르게 입력하세요.\n");
		//학점을 넣지 않았을 때 or
		//잘못 넣었을 때(else의 느낌) break는 넣지x

	}
	system("pause");

}*/

//switch문은 조건이 만족될 경우 밑으로 쭉 수행됨
// 따라서 조건이 만족되면 switch문을 빠져 나올 수
//있도록 break문을 걸어 줄 필요가 있음
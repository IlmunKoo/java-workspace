//#-1이 입력될 때까지 더하기
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int sum = 0;
	for (; 1;) { 
	//중간에 참(1)값을 넣어 반복, 없더라도 무한루프
		int x;
		scanf("%d", &x);
		if (x == -1) break;
		//조건 만족되었을 경우 for문 나가기
		//프로그램상 오류 없앰
		sum += x;

	}
	//printf는 for문 밖에!
	printf("%d\n", sum);
	system("pause");
}*/
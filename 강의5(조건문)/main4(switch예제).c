#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	printf("월을 입력하세요.");
	int a;
	scanf("%d", &a); //switch case가 특정 조건 만족하면
	// 그 다음조건 다 만족 => 봄이라고 출력
	switch (a) {
	case 1: case 2: case 3:
		printf("봄\n"); break;
	case 4: case 5: case 6:
		printf("여름\n"); break;
	case 7: case 8: case 9:
		printf("가을\n"); break;
	case 10: case 11: case 12:
		printf("겨울\n"); break;


	}
	system("pause");
}
//if문에 비해 코드가 훨씬 간편하다!
//조건의 개수가 적을 때는 if문
//많을 때는 switch
//switch문은 반드시 break; 넣어줘야 함
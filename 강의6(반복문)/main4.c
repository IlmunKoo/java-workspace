/*
//#반복문, 특정 문자를 n번 출력하기
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n;
	char a;
	scanf("%d %c", &n, &a);
	while (n--) { //조건 만족할 동안 반복
		//n을 1씩 줄이면서 반복,(n번만큼 반복)
		//n이 거짓이 될 때까지(0이 될 때 까지)
		printf("%c ", a);
		}
	system("pause");
	return 0;

}


//#특정 숫자의 구구단 출력하기
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n;
	scanf("%d", &n);
	int i = 1;
	while (i <= 9) {
		printf("%d*%d = %d\n", n, i, n * i);
		//"" 안에 뒤에숫자가 차례대로 들어감
		//내부적으로 for문과 while문은 동일하게 동작
		i++;
	}
	system("pause");
}*/
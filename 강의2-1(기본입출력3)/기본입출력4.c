#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


//#한자리씩 끊어서 입력받기

int main(void) {
	int a, b, c;
	scanf("%1d%1d%1d", &a, &b, &c);
	printf("%d %d %d/n", a, b, c);

	system("pause");
	return 0;
}


//정리
//C언어에서 입력받거나 출력할 때는 형식 지정자를
//적절히 따라야 함
//printf()는 단순히 데이터를 넘기기 때문에 &사용x
//scanf()는 입력받을 주소 명확히 해야 하기 때문에 &사용
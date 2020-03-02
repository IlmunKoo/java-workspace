#include <stdio.h>

int main(void) {
	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 ,9 , 10 };
	int* b = a;
	//주소 연산자 붙지 않음, a라는 배열 이름 자체를
	//주소로 사용
	printf("%d\n", b[2]);
	//바로 3으로 접근
	//배열과 포인터는 상호 치환 가능

		system("pause");


}
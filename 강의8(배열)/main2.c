/*
//문자열 = 문자+ 배열
//문자를 여러개 묶어놓는 형태로 제공
//문자열은 사실 배열

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[20];
	scanf("%s", &a);
	printf("%s\n", a);

	system("pause");
	 
}

//# 문자열의 문자를 특정 문자로 바꾸기
#include <stdio.h>

int main(void) {
	char a[20] = "Hello World";
	a[4] = ',';

	printf("%s\n", a);

	system("pause");
}*/

//#문자열에 포함된 'l' 개수 출력하기
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[] = "Hello World";
	//특정 문자열 사전에 정의해 초기화
	//=> 굳이 명시하지 않아도 알아서 
	//문자열 크기에 맞게 인덱스 정해짐 (0~10)
	int count = 0;
	for (int i = 0; i <= 10; i++) {
		if (a[i] == 'l') count++; 
		//l이 아니면 count 그대로 다시 for문의 처음으로
	}
	printf("%d", count);
	system("pause");

}
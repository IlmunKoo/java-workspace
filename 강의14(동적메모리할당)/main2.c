//#동적으로 문자열 처리하기
//memset(포인터, 값, 크기);
//한바이트씩 저장, 문자열 처리방식과 흡사
//memset(멤셋) 함수는 <string.h>
//에 선언(문자열 관련 헤더)
/*
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(void) {
	char* a = malloc(100); //a라는 포인터 만들고, 100바이트 할당
	memset(a, 'A', 100);
	//A라는 문자로 채우도록 할 것임
	for (int i = 0; i < 100; i++) {
		printf("%c", a[i]);
	}
	
	system("pause");
	return 0;

}*/

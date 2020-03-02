//#문자열 입출력 함수
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
/*
int main(void) {
	char a[100]; //100자까지 들어감
	gets(a);
//scanf()함수는 공백 만날 때까지 입력(공백포함x )
//gets() 함수는 공백까지 포함하여 한 줄 입력받음
//gets함수는 배열의 전체 범위 고려x>>보안상 취약
//버퍼의 크기를 벗어나도 입력을 받아버림
//사용자가 임의로 덮어쓰기 해 버릴 수 있음
//실무에서는 gets_s();를 사용(안정적)
	printf("%s\n", a);
	system("pause");

}

//#gets_s함수(버퍼의 크기 철저히 지킴)
int main(void) {
	char a[100];
	gets_s(a, sizeof(a));
	//sizeof: 특정 배열의 전체 크기 알려주는 함수
	//매개변수 두개 들어감
	//두번째는 얼만큼의 크기로 들어갈 건지
	//정확히 정해질 수 있음
	//버퍼의크기(여기선 100) 이상으로 입력받을경우
	//런타임오류나면서 종료
	printf("%s\n", a);
	system("pause");


}*/
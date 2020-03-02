//# 전처리기 구문은 다른 프로그램 영역과 독립적으로 처리
//소스코드 파일 단위로 효력이 존재
//파일 포함 전처리기
//#include 전처리기에서 가장 많이 사용되는 문법
//특정 파일을 라이브러리로서 포함
//외부 파일을 현재 소스코드에 포함시키겠다는 뜻
//필수적 라이브러리들이 시스템 디렉토리에 존재
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include "temp.h"
//#include "temp.h"  => 한번 더 작성할 경우 add함수 두번 작성되는 것과 같음
//한번 참조한 파일을 여러 번 참조하지 않게 주의!!(프로그램 오류 가능)
//동일한 경로에 존재하는 헤더파일이 main.c파일에 불러와 짐


int main(void) {
	printf("%d\n", add(3, 7));
	system("pause");

}

//#매크로 전처리기
//프로그램 내 사용되는 상수나 함수를 매크로 형태로 저장
//매크로는 #define을 이용해서 정의한다는 특징이 있음

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define PI 3.1415926535

int main(void) {
	int r = 10;  //반지름
	printf("원의 둘레: %.2f\n", 2 * PI * r); //공식
	system("pause");
}

//#인자를 가지는 매크로 전처리기
//함수형태로 사용되기 위해 인자 포함 가능

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define POW(x)(x*x)  //power의 약자, 제곱함수
//자주 사용되는 것들은 함수형태로 define을 사용해서 간단히 정의

int main(void) {
	int x = 10;  
	printf("x의 제곱: %d\n", POW(x)); //공식
	system("pause");
	return 0;
}
//define문법은 소스코드의 양을 획기적으로 줄이는데 도움!!
#include <stdio.h>
#define ll long long   //많은 프로그래머가 사용 줄여서 사용하고자 할 때
#define ld long double   //(실수형)

int main(void) {
	ll a = 987654321000;
	ld b = 100.5054;
	printf("%.1f\n", a * b);
	system("pause");

*/


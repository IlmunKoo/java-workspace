//#문자열
//문자열은 메모리 구조상 널(NULL)값을 포함(존재X값)
//항상 마지막자리에 포함, \n으로도 포함
//11자 +null값
//이유: 문자열의 끝을 알리기 위함
//printf함수 실행 시 컴퓨터는
//null값을 만나기 전까지 한 자씩 출력 

//#문자열과 포인터
//포인터변수에 문자열 자체를 상수처럼 넣을 수 있다.
/*
#include <stdio.h>
int main(void) {
	char* a = "Hello World";
	//큰따옴표 안에 문자열 들어가는 구조: 문자열 리터럴
	//컴파일러가 알아서 문자열이 남아있는 메모리에 주소 결정
	//이 주소를포인터가 가지게 됨
	//Hello world라는 문자열 리터럴 
	// 자체는 읽기전용(변경 불가)
	// 굳이 바꿔주고 싶으면 *a에 다른 리터럴 써 준다
	printf("%s\n", a); //%s: 문자'열'
	system("pause");


}
//배열과 포인터는 치환 가능
//포인터로 문자열 선언했다고 하더라도 기존의 배열처럼 
//처리 가능
//#각각 한자씩 처리 (%c)
#include <stdio.h>

int main(void) {
	char* a = "Hello World";
	printf("%c\n", a[1]);
	printf("%c\n", a[4]);
	printf("%c\n", a[8]);
	system("pause");
}*/
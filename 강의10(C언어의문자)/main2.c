//#버퍼
//특정한 데이터의 임시저장
//컴퓨터의 연산속도는 매우 빠르지만
//한번에 모든 데이터를 처리할 수 없기 때문에
//버퍼에 저장했다 처리
//C프로그램 자동으로 버퍼 이용해 입출력을 처리

// #입력 버퍼로 인해 흔히 발생하는 오류

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
/*
int main() {
	int a;
	char c;
	scanf("%d", &a);
	printf("%d\n", a);
	//정수형 데이터 받고 출력
	//이어서 문자형 데이터 받고 출력하는 구조
	//but 컴퓨터는 공백까지 아스키 코드로 관리
	//숫자 후 엔터치면 엔터가 c자리로 들어가게 됨
	//줄바꿈이 C자리에 들어가고 끝남
	scanf("%c", &c);
	printf("%c\n", c);
	system("pause");
}*/

int main(void) {
	int a; char c;
	scanf("%d", &a);
	printf("%d\n", a);
	int  temp;  //모든 문자는 아스키코드(숫자)로 관리, int로 표현 가능
	//문자와 숫자를 동시에 받을 경우 파일의 끝(EndOfFile)이거나
	//개행문자(\n)를
	//만나면 입력을 멈추므로 
	//중간에 항상 입력 버퍼를 비워준다!
	while((temp = getchar()) != EOF&& temp != '\n') {}
	//개행문자\n 써줄 때 ''(홑따옴표 써야 함)
		//getchar()를 통해 문자를 입력받고, 이것이 
		//파일의 끝이거나 줄바꿈(개행)인지 검사(입력버퍼 지워주는 역할)
	
	//끝이거나 개행이면 
	//아무것도 처리하지 않도록 괄호를 비움
	//그다음 while을 통해 남아있는 모든 개행문자/ 파일 끝을
	//없는 것처럼 처리
	//개행이나 파일 끝이 아닐 때 다음으로 넘어갈 수 있음
	scanf("%c", &c);
	printf("%c\n", c);
	system("pause");







}
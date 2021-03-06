//#기본 입출력 강의
//scanf
//VS는 기본적으로 취약한 함수를 사용할 수 없도록 제한(=scanf)
//scanf가 취약한 함수인 것을 알더라도 공부용이니 안다고 명시 후
//사용(VS만 막아놓음)>>유난히 보안에 신경쓴다는 것을 알 수 있음

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int a;
	scanf("%d", &a);
	//&기호를 사용하는 이유
	//&: 주소연산자(특정 변수의 주소), 특정 메모리 주소에 
	//접근하여 데이터를 수정
	//이후에는 메모리 주소에 얼만큼의 크기로 데이터를 쓸 지
	//결정해야 함 =>이 때 사용하는 것이 형식지정자
	
	printf("입력한 숫자는 %d 입니다./n",a);
	//즉, int로 입력 받겠다는 뜻
	system("pause");
		return 0;
} 
//형식지정자: 정수형(int),%d 를 넣어 형식을 정해줌
//int => %d
//long long => %lld
// double => 입력 시 %lf, 출력시 %f로 큰 실수형 데이터 처리
// float => %f를 이용해서 실수형 데이터를 입력 및 출력함
//string => %s를 이용해 문자열 데이터
//char => %c를 이용해서 문자 데이터를 입력 및 출력

//double형: 입력: 특정주소에 특정 크기만큼 입력 정확히
//명시해야(lf, 8바이트)
//출력시: 주소 아닌 값 자체를 이용해 출력하므로 정확한 크기 지정x
//%자체를 출력하고 싶음을 때:  %%
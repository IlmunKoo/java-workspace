#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

//#두 숫자를 입력받아 순서 바꾸어 출력하기
/*
int main(void) {
	int a, b; 
	//변수 여러개 할당
	scanf("%d %d", &a, &b);
	printf("%d %d/n", b, a); 
	//형식지정자에 맞게 값이 넣어짐=> 실제로는 서로 바뀐 값이 출력
	system("pause");
	return 0;
	//&(ampersand)가 scanf에 사용되는 이유
	//- scanf를 사용할 때 내부적으로 구동되는 방식은
	//1. 값을 입력받는다.
	//	2. 그 값을 레지스터에 임시로 저장하고 * 레지스터란 임시의 저장공간이라 생각하면 된다.
	//	3. 변수의 주소로 찾아가 그 주소가 가리키는 메모리에 레지스터에 있는 값(입력한 값)을 저장한다.
	//	4. 레지스터에 있던 값은 지운다.

	
}
	*/
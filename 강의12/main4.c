//#참조에 의한 전달방식(매개변수로 포인터변수를 보낼 뿐! 어렵지x)
//간접참조연산자 이용해 기존 존재 값 자체를 바꿈
//함수의 매개변수로
//값을 전달하는 것이 아니라 변수의 주소로 전달

#include <stdio.h>
void add(int *a) {
	//원래 변수의 값 자체에 접근해서 변경 가능
	(*a) = (*a) + 10; //간접참조연산자 이용
	//int a를 포인터로 받아서 (주소값 자체에) 10을 더함
	
}
int main(void) {
	int a = 7;
	
	add(&a); //add함수 이용시 a변수의 주소값 남겨야
	//포인터변수가 a의 주소값으로 초기화 처리 가능
	printf("%d\n", a);
	//17로 출력 가능
	system("pause");
}
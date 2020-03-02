/*#include <stdio.h>
#include <stdlib.h>
//#동적 메모리 할당
//C언어에서 배열은 사전에 필요한 크기만큼 할당해줘야 함
//필요한 만큼 메모리 할당해 주고 싶을 경우 동적 메모리 할당을 사용
//"동적" = 프로그램 실행 도중에 진행!!
//malloc()함수(멜록)를 통해 할당
//RAM 메모리 할당에 성공하면 주소반환, 아니면 NULL반환
//<stdlib.h>에 있음
//남아있는 공간 알아서 할당 >> 변칙적

int main(void) {
	int *a = malloc(sizeof(int));
	//포인터 a값을 이용해 특정주소값 가리킴
	//malloc함수를 이용해 하나의 int형만큼 sizeof(int) = 4
	printf("%d\n", a);
	
	//a값 메모리 할당 헤제
	//다시 할당
	a = malloc(sizeof(int));
	printf("%d\n", a);
	
	system("pause");
	return 0;

}
//프로그램 여러번 실행할 때 마다 다르게 나올 수 있음
//운영체제가 프로그램 실행 중 동적으로 알아서 저장
//동적 할당 변수는 힙 영역에 저장
//계속 오류뜸 >>LNK1104 파일을 열 수 없음>> 알약끄기!!
//동적으로 할당된 변수(힙에 선언)는 반드시 free()함수로 해제해야 함
//메모리누수(memory leak)이 발생하지 않도록 할당해제 해줘야 함
//프로세스 커져서 갑자기 프로그램 다운되는 주요 원인 중 하나


int main(void) {
	int* a = malloc(sizeof(int));
	//포인터 a값을 이용해 특정주소값 가리킴
	//malloc함수를 이용해 하나의 int형만큼 sizeof(int) = 4
	printf("%d\n", a);
	free(a);
	//a값 메모리 할당 헤제
	//다시 할당
	a = malloc(sizeof(int));
	printf("%d\n", a);
	free(a);
	system("pause");
	return 0;

} 
*/
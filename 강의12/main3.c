//#레지스터 변수
//레지스터가 CPU에 가까우므로
//처리속도 훨씬 빠르다
//but 레지스터는 매우 한정적
// 컴파일러가 담당하는 부분
//실제 레지스터에서 처리될지는 보장x
//빨리 되겠다는 기대만 할 뿐


#include <stdio.h>
int main(void) {
	register int a = 10, i;
	//레지스터 변수
	for (i = 0; i < a; i++) {
		printf("%d", i);
	}
	system("pause");
	   }

//#컴퓨터의 변수 처리 방법
//함수 호출 시 함수에 필요한 데이터를 매개변수로 전달
// 방식은 (1) 값에의한 전달 (2) 참조에 의한 전달(전역변수에 가까움)
//값에 의한 전달방식: 단지 값을 전달하므로 함수 내에서 변수가
//새롭게 생성(지역변수와 유사)

#include <stdio.h>
void add(int a, int b) {
	a = a + b;
	printf("%d\n", a);
	//17
}
int main(void) {
	int a = 7;
	//값에 의한 전달방식
	add(a, 10);
	//함수 내의 a는 함수내에서만 사용
	//int a = 7;에는 영향x
	//함수 안에서는 17이 뜬다
	printf("%d\n", a);
	
	system("pause");
}
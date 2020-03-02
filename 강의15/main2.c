#include <stdio.h>

//#함수 포인터 자체를 반환하여 사용하기

//#함수 포인터 : 특정 함수의 반환 자료형을 지정
//함수 포인터 이용시 형태가 같은 서로 다른기능의 함수
//사용 가능

//반환 자료형(*이름)(매개변수) = 함수명;


int add(int a, int b) {
	return a + b;
}

int (*process(char* a))(int, int) { //process란 이름의 함수 포인터 자체의매개변수
	//??? 무슨형태
	printf("%s\n", a);
	//string이 출력
	return add;
}    //add라는 또다른 함수의 포인터 반환, add는 두개의 매개변수 들어감
     //이러면 매개변수 여러개 출력 가능(str)(10, 20);
int main(void) {
	printf("%d\n", process("10과 20을 더해보겠습니다.")(10, 20));
	//process("10과 20을 더해보겠습니다.")에 해당하는 함수포인터 불러옴
	//=>위에 int *process 호출, "printf("a ")출력, add반환()>>return a + b;
	
	system("pause");

}
//고급문법이기 때문에 잘 사용x
//필요할 때마다 검색해서 알아본다

//알고있으면 컴퓨터 구조 이해하는데 도움
//C언어 프로그램 모든 함수는 내부적으로 포인터 형태로 관리 가능
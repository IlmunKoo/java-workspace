/*
//#for문 사용 1부터 N까지 합 
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n, sum = 0;
	printf("n을 입력하세요");
		// 이 printf는 아무 숫자도 들어가지 않음
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		//i는 조건문 안에서 돎
		sum = sum + i;
	}
	//반복문이 끝난 다음에 printf를 해야 함
		printf("%d\n", sum);
		system("pause");
		   

}

//무한루프 예제, 컴퓨터에 좋지 않음

//예제1
#include <stdio.h>

int main(void){
for(;;;){
// 조건문의 내용이 없으면 항상 참(true)

printf("Hello World!\n");

}
system("pause");
}

//예제2
#include <stdio.h>

int main(void){
	for (int i = 0; i <= 100; i--) {


    printf("Hello World!\n");

}
system("pause");
}
*/

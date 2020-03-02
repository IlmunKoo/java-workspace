//#문자열 처리를 위한 함수 
//문자열 길이(strlen)
/*
#include <stdio.h>
int main(void) {
	char a[20] = "Ilmun Koo";
	printf("문자열의 길이: %d\n", strlen(a));
	//띄어쓰기까지 총 9자리
	//VS는 바로 문자열 함수 부를 수 있음
	system("pause");


}

//# 두 문자열의 사전순서 비교(strcmp)
#include <stdio.h>

int main(void) {
	char a[20] = "Ilmun Koo";
	char b[20] = "Gildong Hong";
	printf("두 배열의 사전 순 비교: %d\n", strcmp(a, b));
    //strcmp(string compare)
	//왼쪽의 문자열이 사전순으로 앞> -1
	//오른쪽 문자열이 앞> 1
	system("pause");
}
//#strcpy()
#include <stdio.h>

int main(void) {
	char a[20] = "My name";
	char b[20] = "Ilmun Koo";
	strcpy(a, b);
	//a 배열을 b로 복사함
	printf("복사된 문자열: %s\n", a);

	system("pause");
}

//#strcat(string concatenate), concatenate: 문자열 연결시키다
//뒤에 있는 문자열을 앞에 있는 문자열의 뒤쪽으로 붙임

#include <stdio.h>

int main(void) {
	char a[30] = "My name is ";
	//두개 합쳐주면 배열 늘어나므로 a배열 늘려줘야 함
	char b[20] = "Ilmun Koo";
	strcat(a, b);
	//a 배열을 b로 복사함
	printf("합쳐진 결과 문자열: %s\n", a);

	system("pause");
}*/

//#strstr()
//긴 문자열에서 짧은 문자열을 찾아 그 위치를 반환
//문자열의 포함 여부 확인 가능

#include <stdio.h>

int main(void) {
	char a[30] = "I like you";
	char b[20] = "like";
	
	printf("찾은 문자열: %s\n", strstr(a, b));
	//strstr(a, b): a에서 b를 찾을 수 있게 함
	//찾은 문자열부터 모두 반환>> like you 반환
	system("pause");
}
//int 형이 10칸=> 40byte
//{0,} => 전체 배열의 원소가 0
//a[index]: index원소에 접근하겠다!

/*
#include <stdio.h>

int main(void) {
	int a[10] = { 6, 5, 4, 3 ,9, 8, 0, 1, 2, 7 };
	int i;
	for (i = 0; i < 10; i++) {
		printf("%d ", a[i]);
		}
	system("pause");
}

//#배열의 원소 중 최댓값 찾기
#include <stdio.h>
#include <limits.h>  
//최댓값, 최솟값 등 한계값 라이브러리
//int로 표현할 수 있는 것중 가장 큰 것?

int main(void) {
	int a[10] = { 6, 5, 4, 3, 9, 8, 0, 1, 2, 7 };
	int i, maxValue = INT_MIN;  
	//약 -20억, 최댓값 구하기 위해 자주 사용
	//가장 작은 값 선택
	//i를 이용해 각 값에 접근
	for (i = 0; i < 10; i++) {
		if (maxValue < a[i]) maxValue = a[i];
		//maxValue보다 현재 보고 있는 값이 클 경우
		//maxValue에 해당 값 넣어줌
		//결과적으로 첫 수부터 마지막값까지 반복
		//가장 큰 값을 출력
	}
	printf("%d\n", maxValue);
	system("pause");

}*/
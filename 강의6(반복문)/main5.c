/*
#include <stdio.h>

int main(void) {
	int i = 1;
	while (i <= 9) {
		int j = 1;
		while (j <= 9) {
			printf("%d*%d = %d\n", i, j, i * j);
			j++;
		}
		printf("\n");
		i++;
	}
	system("pause");
}*/

//짧은 소스코드로 많은 양 출력 가능

//for문으로 똑같이 구현 가능, 사실 더 짧음
#include <stdio.h>

int main(void) {
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			printf("%d*%d = %d\n", i, j, i * j);
		}
		printf("\n");// 단이 끝날 때 띄워줌
	}
	system("pause");
}
//for문과 while문 서로 치환 가능
//C언어 소스코드가 컴파일되면서 기계어로 변형됐을때
//동일하게 동작
//행렬, 그래프 등에 이중 반복문 많이 사용
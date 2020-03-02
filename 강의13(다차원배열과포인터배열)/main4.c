/*
#include <stdio.h>

  
int main(void) {
    int a[5] = {1, 2, 3, 4, 5};
    //a배열 5개까지 넣겠다.
    int i;
    for (i = 0; i < 5; i++) {
       // printf("%d ", a + i);
        //첫번째 원소의 주소값인 a에 i값이 더해짐
        //4바이트만큼 증가해서 출력
         //printf("%d ", *(a + i));
         //1~5까지 값들이 출력: 포인터로 연산시
         //자료형의 크기만큼 이동
          printf("%d ", a[i]);
          //배열: 포인터와 동일하게 출력 
    }
     
    system("pause");


}

//#포인터 배열의 구조분석
//크기가 10인 double형 배열(크기8바이트) =>각각의 원소크기 8
//배열의 시작주소X
//8x9 = 72만큼 시작줄에서 떨어져 있음
//x +72 가 마지막 원소의 주소


#include <stdio.h>


int main(void) {
    double b[10];
    printf("%d %d\n", b, b + 9);
    //결과값은 72만큼 차이

    system("pause");


}

//#배열을 포인터처럼 사용해 각 원소에 접근

#include <stdio.h>

int main(void) {
    int a[5] = {1, 2, 3, 4,5};
    int i;
    for (i = 0; i < 5; i++) {
        printf("%d", *(a + i));
        //아까 했던 것과 동일 *(a + i) = a[i]
    }

    system("pause");


}*/
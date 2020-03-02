//#pragma once: 비주얼 스튜디오에서 지원하는 전처리기, C언어보다는 C++에 가까움
//나만의 헤더파일 만들기

#ifndef _TEMP_H_  //temp.h 파일이 정의돼있지 않다면 add내용 실행!!

#define _TEMP_H_  //if 문 안에서는 define을 사용해 temp.h 정의

int add(int a, int b);

//{	return a + b;}

//라이브러리 만들고자 할 때 c언어 파일과 헤더파일 분리
//(temp.c와 temp.h)


#endif 
//한번 정의될 때 #define을 이용해 TEMP_H 을 정의
//TEMP_H 가 여러번 불러와진다고 하더라도
// ifndef ~ endif 에 의해 한번만 실행
//따라서 오류메시지 더이상 출력x
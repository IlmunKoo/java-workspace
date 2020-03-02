//#연결리스트
//필요성과 쓰임새
//C언어 활용 연결리스트 구현
//배열을 사용하여 데이터를 순차적으로 저장, 나열
//but 이경우 메모리공간이 불필요하게 낭비될 수 있음
//연결리스트를 통해 이를 줄일 수 있음

//배열기반의 리스트
/*
#include<stdio.h>
#define INF 1000   //메모리공간이 무한에 가깝다고 가정

int arr[INF];
int count = 0;   //배열에 몇 개의 원소가 담겼는지

void addBack(int data) {
	arr[count] = data;  //count인덱스에 data를 넣은 뒤에
	count++;  //count 증가 >>하나의 원소가 들어왔다! 의미

}

void addFirst(int data) {  //가장 앞부분에 원소를 담음
	for (int i = count; i >= 1; i--) {   //  {3, 4, 7} 배열에 6이라는 원소를 넣을 경우
		arr[i] = arr[i - 1];    //기존 3 4 7은 한칸씩 뒤로 밀린다! 0번째 원소가 1번째원소가, 1번째 원소가 2번째 원소가...
	}
	arr[0] = data;
	count++;
}

void show() {//현재 배열에 담겨있는 원소 하나씩 출력
for (int i = 0; i < count; i++) {
	printf("%d", arr[i]);
}
}

int main(void) {  //배열기반의 리스트 사용가능
	addFirst(4);
	addFirst(5);
	addFirst(1);
	addBack(7);
	addBack(6);
	addBack(8);
	show();
	system("pause");
	return 0;

}

//특정한 위치의 원소 삭제하는 함수?
//덮어쓰기 하는 방식으로 구현
void removeAt(int index){
	for (int i = index; i < count - 1; i++) {
		arr[i] = arr[i + 1];
		}
	count--;
}
//  5 4 1 7 8 (0 1 2 3 4)
//1 없애고 싶을 때 >> 인덱스 2(1)에 인덱스 3값, 인덱스 3에 인덱스 4 덮어쓰기 하는 방식


//배열 기반 리스트의 특징
//배열로 만들었으므로 특정 위치의 원소에 즉시 접근 가능
//데이터 들어갈 공간을 미리 메모리에 할당해야 한다는 단점
//원하는 위치로의 삽입 혹은 삭제가 비효율적(기존 값들을이동시켜줘야 함)

//포인터 & 구조체 기반 연결리스트
//연결리스트는 리스트 중간지점에 노드 추가/삭제 할 수있어야 함(포인터 사용)
//동적할당 사용>> 필요할 때마다 메모리 공간 할당


//#단일 연결리스트
//하나의 구조체 안에 두 개의 변수
//#연결리스트 구조체 만들기
#include <stdio.h>
#include <stdlib.h>  //동적할당 사용

typedef struct {  //구조체에 데이터
	int data;
	struct Node* next;  //그 다음 노드 가리키는 next 설정
} Node;  //구조체의 이름은 Node라고 설정

Node * head;   //일반적으로 연결리스트는 head노드로부터 출발, head라는 이름의 변수 만들어줌
//Node는 항상 포인터 변수, 동적할당을 이용해 변수 만들수 있도록 함
//필요한 만큼만 메모리 할당!!


int main(void) {
	head = (Node*)malloc(sizeof(Node));
	//malloc을 이용해 필요한 만큼만 할당
	Node* node1 = (Node*)malloc(sizeof(Node));
	//하나의 노드에 들어갈 공간만 할당
	node1->data = 1;  //첫번째 노드의 데이터에 1넣어줌
	Node* node2 = (Node*)malloc(sizeof(Node));
	node2->data = 2;
	//두번째 노드의 데이터에 2 할당
	head->next = node1;  //next를 이용해 데이터연결
	node1->next = node2;  
	node2->next = NULL;
	//끝 노드는 next값으로 NULL을 가짐으로써 뒤에값이 없다는 것알려줘야 함

	Node* cur = head->next;  //하나의 포인터 별도로 만듦, Head가 next를 가리키게 만듦

	while (cur != NULL) {  //current를 이용해 전체 원소의 값 하나씩 출력
		printf("%d", cur->data);
		cur = cur->next;  //바로 그 뒤에 있는 원소로 이동, 즉 뒤의 원소를 포인터로 가질 수 있게 함
	}

	system("pause");
}*/



//위 코드는 연결리스트 구조체와 동일
// Head -> 일반노드 -> 일반노드 -> null
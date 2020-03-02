//#연결리스트 삽입과정
//예제에서는 첫번째 위치에 삽입
// Head의 next가 가리키는 값이 첫 번째 원소
//새롭게 넣을 노드도 동일하게 가리켜야 함
//그 다음 Head의 노드가 삽입할 노드를 가리켜야 함

/*
#include <stdio.h>
#include <stdlib.h>  


typedef struct { 

	int data;
	struct Node* next; 
} Node;  

Node* head;  

//연결리스트 삽입하는 함수 만들 수 있음
void addFront(Node* root, int data) { //어떤 위치에 삽입할지 root를 이용해 위치정해줌
	Node* node = (Node*)malloc(sizeof(Node)); //하나의 노드를 바로 동적할당으로 할당받음
	node->data = data;   //그 노드의 데이터값으로 새롭게 넣을 값을 받음(초기화)
	node->next = root->next;  //노드의 넥스트는 루트가 가리키는 그 다음값
	root->next = node; //루트의 넥스트를 노드로 바꿔줌(루트가 헤드가 됨)
}

int main(void) {
	head = (Node*)malloc(sizeof(Node));
	Node* node1 = (Node*)malloc(sizeof(Node));
	node1->data = 1;  
	Node* node2 = (Node*)malloc(sizeof(Node));
	node2->data = 2;
	head->next = node1; 
	node1->next = node2;
	node2->next = NULL;

	Node* cur = head->next; 

	while (cur != NULL) {  
		printf("%d", cur->data);
		cur = cur->next;  
	}

	system("pause");

	*/

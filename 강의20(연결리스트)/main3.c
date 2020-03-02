//#연결리스트 삭제
// Head 1 2 순으로 있을 때 1번노드 삭제
//Head가 원래 가리키던 1번 노드 대신
// 2번 노드를 가리키도록 만들면 됨
//1번노드는 메모리 할당해제 해주면 됨

#include <stdio.h>
#include <stdlib.h>  


typedef struct {

	int data;
	struct Node* next;
} Node;

Node* head;

void addFront(Node* root, int data) { 
	Node* node = (Node*)malloc(sizeof(Node)); 
	node->data = data;  
	node->next = root->next;
	root->next = node; 
}

void removeFront(Node* root) { //특정 루트 기준
	Node* front = root->next;
	root->next = front->next; //루트의 다음노드가 그 다다음 노드라 할 수 있는 front의 next가 되도록 함
	//코드가 매우 짧다! 기존의 배열기반 리스트에 비해 훨씬 간단

	free(front);
}
//#연결리스트 메모리해제 함수
//한개씩 데이터 거쳐 가며 리스트 전체 원소 확인
//메모리 해제도 원소 하나씩 접근해서 해제

void showAll(Node* root) {  //현재 연결리스트에 존재하는 모든 노드의 데이터출력하는 코드 만듦
	Node* cur = head->next;
	while (cur != NULL) { //cur이용 null만나기 전까지 자신의 값 출력하도록 만듦
		printf("%d", cur->data);
		cur = cur->next;
	}
}





void freeAll(Node* root) {
	Node* cur = head->next;  //cur이용 head의next부터 출발, head자체는 할당해제x
	while (cur != NULL) { //한개씩 원소 순회
		Node* next = cur->next; //먼저 다음원소 기록
		free(cur);  //현재 가리키는 원소 할당해제
		cur = next; //그 포인터를 다음 노드로 이동
		//반복
	}

}

//#완성된 연결리스트 사용
int main(void) {
	head = (Node*)malloc(sizeof(Node));
	head->next = NULL;   //head의 next에null값 넣어줘야함, 초기부터 값이 없기 때문, 연결리스트의 마지막엔 null
	addFront(head, 2);   //연결리스트의 앞쪽부터 값을넣어줌
	addFront(head, 1);
	addFront(head, 7);
	addFront(head, 9);
	addFront(head, 8);
	removeFront(head);//가장 앞쪽에서 원소 삭제
	showAll(head); //남아있는 원소 출력
	freeAll(head);  //전체 원소 할당해제

	//9712 출력

	system("pause");
}



//주의할 점: 삽입 및 삭제 기능에서 예외처리
//ex) 원소 없는데 삭제:"삭제할 원소가 없습니다."
//ex) Head포인터 자체가 잘못된 경우 등 다양한 예외사항 체크

//연결리스트 특징
//삽입과 삭제가 배열에 비해 매우 간단, 포인터만 다르게 연결해주면 되기 때문
// 특정 인덱스로 즉시 접근x, 원소를 차례대로 검색해야 함(배열에 비해 느릴 수 있음)
//추가적인 포인터 변수 사용=>메모리공간 낭비될 수 있음

//연결리스트ㅣ 데이터를 선형적으로 저장&처리
//기존 배열보다 삽입과 삭제 많은 경우 효율적
//특정 인덱스에 바로 참조해야할 때 많다면 배열 이용하는 것이 효율적

//#���Ḯ��Ʈ ���԰���
//���������� ù��° ��ġ�� ����
// Head�� next�� ����Ű�� ���� ù ��° ����
//���Ӱ� ���� ��嵵 �����ϰ� �����Ѿ� ��
//�� ���� Head�� ��尡 ������ ��带 �����Ѿ� ��

/*
#include <stdio.h>
#include <stdlib.h>  


typedef struct { 

	int data;
	struct Node* next; 
} Node;  

Node* head;  

//���Ḯ��Ʈ �����ϴ� �Լ� ���� �� ����
void addFront(Node* root, int data) { //� ��ġ�� �������� root�� �̿��� ��ġ������
	Node* node = (Node*)malloc(sizeof(Node)); //�ϳ��� ��带 �ٷ� �����Ҵ����� �Ҵ����
	node->data = data;   //�� ����� �����Ͱ����� ���Ӱ� ���� ���� ����(�ʱ�ȭ)
	node->next = root->next;  //����� �ؽ�Ʈ�� ��Ʈ�� ����Ű�� �� ������
	root->next = node; //��Ʈ�� �ؽ�Ʈ�� ���� �ٲ���(��Ʈ�� ��尡 ��)
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

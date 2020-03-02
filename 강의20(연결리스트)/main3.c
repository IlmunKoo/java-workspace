//#���Ḯ��Ʈ ����
// Head 1 2 ������ ���� �� 1����� ����
//Head�� ���� ����Ű�� 1�� ��� ���
// 2�� ��带 ����Ű���� ����� ��
//1������ �޸� �Ҵ����� ���ָ� ��

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

void removeFront(Node* root) { //Ư�� ��Ʈ ����
	Node* front = root->next;
	root->next = front->next; //��Ʈ�� ������尡 �� �ٴ��� ���� �� �� �ִ� front�� next�� �ǵ��� ��
	//�ڵ尡 �ſ� ª��! ������ �迭��� ����Ʈ�� ���� �ξ� ����

	free(front);
}
//#���Ḯ��Ʈ �޸����� �Լ�
//�Ѱ��� ������ ���� ���� ����Ʈ ��ü ���� Ȯ��
//�޸� ������ ���� �ϳ��� �����ؼ� ����

void showAll(Node* root) {  //���� ���Ḯ��Ʈ�� �����ϴ� ��� ����� ����������ϴ� �ڵ� ����
	Node* cur = head->next;
	while (cur != NULL) { //cur�̿� null������ ������ �ڽ��� �� ����ϵ��� ����
		printf("%d", cur->data);
		cur = cur->next;
	}
}





void freeAll(Node* root) {
	Node* cur = head->next;  //cur�̿� head��next���� ���, head��ü�� �Ҵ�����x
	while (cur != NULL) { //�Ѱ��� ���� ��ȸ
		Node* next = cur->next; //���� �������� ���
		free(cur);  //���� ����Ű�� ���� �Ҵ�����
		cur = next; //�� �����͸� ���� ���� �̵�
		//�ݺ�
	}

}

//#�ϼ��� ���Ḯ��Ʈ ���
int main(void) {
	head = (Node*)malloc(sizeof(Node));
	head->next = NULL;   //head�� next��null�� �־������, �ʱ���� ���� ���� ����, ���Ḯ��Ʈ�� �������� null
	addFront(head, 2);   //���Ḯ��Ʈ�� ���ʺ��� �����־���
	addFront(head, 1);
	addFront(head, 7);
	addFront(head, 9);
	addFront(head, 8);
	removeFront(head);//���� ���ʿ��� ���� ����
	showAll(head); //�����ִ� ���� ���
	freeAll(head);  //��ü ���� �Ҵ�����

	//9712 ���

	system("pause");
}



//������ ��: ���� �� ���� ��ɿ��� ����ó��
//ex) ���� ���µ� ����:"������ ���Ұ� �����ϴ�."
//ex) Head������ ��ü�� �߸��� ��� �� �پ��� ���ܻ��� üũ

//���Ḯ��Ʈ Ư¡
//���԰� ������ �迭�� ���� �ſ� ����, �����͸� �ٸ��� �������ָ� �Ǳ� ����
// Ư�� �ε����� ��� ����x, ���Ҹ� ���ʴ�� �˻��ؾ� ��(�迭�� ���� ���� �� ����)
//�߰����� ������ ���� ���=>�޸𸮰��� ����� �� ����

//���Ḯ��Ʈ�� �����͸� ���������� ����&ó��
//���� �迭���� ���԰� ���� ���� ��� ȿ����
//Ư�� �ε����� �ٷ� �����ؾ��� �� ���ٸ� �迭 �̿��ϴ� ���� ȿ����

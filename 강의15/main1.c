//#�Լ� ������
//�迭�� �̸��� �޸� �ּҰ��� ��ȯ�ϵ�
//�Լ������͵� ���������� ������ ����


//�Լ��� �ּҰ� ���(��ȯ)
/*
#include <stdio.h>

void function() {
	printf("It's my function.");
}
	int main(void) {
		printf("%d\n", function);
		
		system("pause");

	}

//#�Լ� ������ : Ư�� �Լ��� ��ȯ �ڷ����� ����
//�Լ� ������ �̿�� ���°� ���� ���� �ٸ������ �Լ�
//��� ����

	//��ȯ �ڷ���(*�̸�)(�Ű�����) = �Լ���;
	
	//#�Ű����� �� ��ȯ�ڷ����� ���� �Լ� ������
#include <stdio.h>

void myFunction() {
	printf("It's my function\n");
}

void yourFunction() {
	printf("It's your function\n");
}

int main(void) {
	void(*fp)() = myFunction;
	//�ڷ��� void, �Ű����� ����
	fp();
	//�Լ� ����
	fp = yourFunction;
	//���Ŀ� ����Ű�� �Լ� yourfunction���� �ٲ�
	fp();
	//��, ���°� ����� �� �Լ��� ���� ��ɾ��
	//�ҷ��� �� �ִ�!
	system("pause");

}

//#�Ű����� �� ��ȯ �ڷ����� �ִ� �Լ� ������
#include <stdio.h>


int add(int a, int b) {
	return a + b;
}

int sub(int a, int b) {  //subtract, �����Լ�
	return a - b;
}

int main(void) {
	int(*fp)(int, int) = add;
	//��ȯ�ڷ��� int, �Ű����� int
	//*fp�� add�� ����Ŵ

	printf("%d\n", fp(10, 3));

	fp = sub;

	printf("%d\n", fp(10, 3));
	 
	system("pause");

	//�Ű�����, ��ȯ �ڷ��� �־ �Ȱ���
	//�Լ� ������ �̿��ؼ�
}*/
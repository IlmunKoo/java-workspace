/*
//���ڿ� = ����+ �迭
//���ڸ� ������ ������� ���·� ����
//���ڿ��� ��� �迭

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[20];
	scanf("%s", &a);
	printf("%s\n", a);

	system("pause");
	 
}

//# ���ڿ��� ���ڸ� Ư�� ���ڷ� �ٲٱ�
#include <stdio.h>

int main(void) {
	char a[20] = "Hello World";
	a[4] = ',';

	printf("%s\n", a);

	system("pause");
}*/

//#���ڿ��� ���Ե� 'l' ���� ����ϱ�
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char a[] = "Hello World";
	//Ư�� ���ڿ� ������ ������ �ʱ�ȭ
	//=> ���� ������� �ʾƵ� �˾Ƽ� 
	//���ڿ� ũ�⿡ �°� �ε��� ������ (0~10)
	int count = 0;
	for (int i = 0; i <= 10; i++) {
		if (a[i] == 'l') count++; 
		//l�� �ƴϸ� count �״�� �ٽ� for���� ó������
	}
	printf("%d", count);
	system("pause");

}
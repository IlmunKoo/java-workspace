//#���ڿ� ó���� ���� �Լ� 
//���ڿ� ����(strlen)
/*
#include <stdio.h>
int main(void) {
	char a[20] = "Ilmun Koo";
	printf("���ڿ��� ����: %d\n", strlen(a));
	//������� �� 9�ڸ�
	//VS�� �ٷ� ���ڿ� �Լ� �θ� �� ����
	system("pause");


}

//# �� ���ڿ��� �������� ��(strcmp)
#include <stdio.h>

int main(void) {
	char a[20] = "Ilmun Koo";
	char b[20] = "Gildong Hong";
	printf("�� �迭�� ���� �� ��: %d\n", strcmp(a, b));
    //strcmp(string compare)
	//������ ���ڿ��� ���������� ��> -1
	//������ ���ڿ��� ��> 1
	system("pause");
}
//#strcpy()
#include <stdio.h>

int main(void) {
	char a[20] = "My name";
	char b[20] = "Ilmun Koo";
	strcpy(a, b);
	//a �迭�� b�� ������
	printf("����� ���ڿ�: %s\n", a);

	system("pause");
}

//#strcat(string concatenate), concatenate: ���ڿ� �����Ű��
//�ڿ� �ִ� ���ڿ��� �տ� �ִ� ���ڿ��� �������� ����

#include <stdio.h>

int main(void) {
	char a[30] = "My name is ";
	//�ΰ� �����ָ� �迭 �þ�Ƿ� a�迭 �÷���� ��
	char b[20] = "Ilmun Koo";
	strcat(a, b);
	//a �迭�� b�� ������
	printf("������ ��� ���ڿ�: %s\n", a);

	system("pause");
}*/

//#strstr()
//�� ���ڿ����� ª�� ���ڿ��� ã�� �� ��ġ�� ��ȯ
//���ڿ��� ���� ���� Ȯ�� ����

#include <stdio.h>

int main(void) {
	char a[30] = "I like you";
	char b[20] = "like";
	
	printf("ã�� ���ڿ�: %s\n", strstr(a, b));
	//strstr(a, b): a���� b�� ã�� �� �ְ� ��
	//ã�� ���ڿ����� ��� ��ȯ>> like you ��ȯ
	system("pause");
}
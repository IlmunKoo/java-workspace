//#����Լ�
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int factorial(int a) {
	if (a == 1) return 1;
	//�������� ����, f(5)�ϰ�� f(5)f(4)f(3)f(2)f(1)
	//�ݺ��� �̿����� �ʰ� ����Լ� ����ؼ�
	//�ݺ����� ������ ���� ���� ����
	//�ݺ������� ª�� �ڵ�=> ������ ��� ����
	else return a * factorial(a - 1);
	//factorial�Լ��� �ٸ� factorial �Լ��� �ҷ���
	// =>����Լ�
	//���ѷ��� ����(�ݵ�� �������� �����)

}

int main(void) {
	int n;
	printf("n ���丮���� ����մϴ�. ");
	scanf("%d", &n);
	//����ڷκ��� n�� �Է¹���
	printf("%d\n", factorial(n));
	system("pause");
}

//C���� �Լ��� �����ؼ� �Լ��� ����
//���α׷� ���۰� ���ÿ� �����Լ� ����
//�����Լ��� �Ǵٸ� �Լ��� �ҷ����Ƿ�
//int ���� 10ĭ=> 40byte
//{0,} => ��ü �迭�� ���Ұ� 0
//a[index]: index���ҿ� �����ϰڴ�!

/*
#include <stdio.h>

int main(void) {
	int a[10] = { 6, 5, 4, 3 ,9, 8, 0, 1, 2, 7 };
	int i;
	for (i = 0; i < 10; i++) {
		printf("%d ", a[i]);
		}
	system("pause");
}

//#�迭�� ���� �� �ִ� ã��
#include <stdio.h>
#include <limits.h>  
//�ִ�, �ּڰ� �� �Ѱ谪 ���̺귯��
//int�� ǥ���� �� �ִ� ���� ���� ū ��?

int main(void) {
	int a[10] = { 6, 5, 4, 3, 9, 8, 0, 1, 2, 7 };
	int i, maxValue = INT_MIN;  
	//�� -20��, �ִ� ���ϱ� ���� ���� ���
	//���� ���� �� ����
	//i�� �̿��� �� ���� ����
	for (i = 0; i < 10; i++) {
		if (maxValue < a[i]) maxValue = a[i];
		//maxValue���� ���� ���� �ִ� ���� Ŭ ���
		//maxValue�� �ش� �� �־���
		//��������� ù ������ ������������ �ݺ�
		//���� ū ���� ���
	}
	printf("%d\n", maxValue);
	system("pause");

}*/
/*
//#�ݺ���, Ư�� ���ڸ� n�� ����ϱ�
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n;
	char a;
	scanf("%d %c", &n, &a);
	while (n--) { //���� ������ ���� �ݺ�
		//n�� 1�� ���̸鼭 �ݺ�,(n����ŭ �ݺ�)
		//n�� ������ �� ������(0�� �� �� ����)
		printf("%c ", a);
		}
	system("pause");
	return 0;

}


//#Ư�� ������ ������ ����ϱ�
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n;
	scanf("%d", &n);
	int i = 1;
	while (i <= 9) {
		printf("%d*%d = %d\n", n, i, n * i);
		//"" �ȿ� �ڿ����ڰ� ���ʴ�� ��
		//���������� for���� while���� �����ϰ� ����
		i++;
	}
	system("pause");
}*/
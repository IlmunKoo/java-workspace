/*
#include <stdio.h>

int main(void) {
	int i = 1;
	while (i <= 9) {
		int j = 1;
		while (j <= 9) {
			printf("%d*%d = %d\n", i, j, i * j);
			j++;
		}
		printf("\n");
		i++;
	}
	system("pause");
}*/

//ª�� �ҽ��ڵ�� ���� �� ��� ����

//for������ �Ȱ��� ���� ����, ��� �� ª��
#include <stdio.h>

int main(void) {
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			printf("%d*%d = %d\n", i, j, i * j);
		}
		printf("\n");// ���� ���� �� �����
	}
	system("pause");
}
//for���� while�� ���� ġȯ ����
//C��� �ҽ��ڵ尡 �����ϵǸ鼭 ����� ����������
//�����ϰ� ����
//���, �׷��� � ���� �ݺ��� ���� ���
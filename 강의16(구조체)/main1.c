//#����ü�� Ȱ���� �ڽŸ��� �ڷ��� �����!
//����ü?
//���� ���� ������ ���� �ϳ��� ��ü�� ǥ���ϰ��� �� �� ���
//�迭: ������ Ư���� ���� ������ �Ϸķ� ����
//����ü: ������ ��ü�� ����,ǥ���ϰ��� �� �� ���
//���� ���� ������ ��� �ϳ��� Ư�� ǥ����(���ӿ��� ĳ����, ���� ���� ��)

//����ü�� ���ǿ� ����
//struct ����ü��{
//�ڷ���1 ������;
//�ڷ���2 ������;
//....
//};
/*
//#�� ���� �л��� ���� ������ ��� �ִ� ����ü
#include <stdio.h>
//����ü�� ����
//�л��� ���� �������� ��� �л��̶�� ��ü�� ������ �� �ִ�

struct Student {// �л� ����ü ����
	char studentId[10]; //10�ڱ��� �ްڴ�! �ݵ�� �������� ��
	//���ϸ� ���α׷����� �ȶ�
	char name[10];
	int grade;
	char major[51];
	//���ڿ� ����
	   	} s;    //�̾ ���� �������ָ� ���������� ��� ����
                //�Ϲ������� �ϳ��� ���� or ���������� ����ϰ� ���� ��
                 //���� ����ϴ� ���´�x �̷��� �ֱ���~ ����

//����ü�� ���ǿ� ���ÿ� �������� ���� ����





//����ü ������ ����� ����
int main(void){

//struct Student s;  //����ü ���� ����(����ü ��ü�� �ϳ��� �ڷ����� ��)
strcpy(s.studentId, "201600186"); //����ü ������ ���ٽ� ����(.)����Ѵ�!
strcpy(s.name, "���Ϲ�");
s.grade = 4;
strcpy(s.major, "������");
//������ �ʱ�ȭ
printf("�й� : %s\n", s.studentId);
printf("�̸�: %s\n", s.name);
printf("���� : %d\n", s.grade);
printf("�а� : %s\n", s.major);
//��� ��ü�� �ݺ��� �� �ֱ� ������ �ϳ��� �Լ��� ����
//Ư���� �л� ����ü ����(s)�� ���ؼ� �ֱ������� ȣ��
system("pause");

}



//#����ü�� �ʱ�ȭ
//���� �ʱ�ȭ�� ������ ���� �ʰ�, �ѹ���(���ʴ��!!) �� �� �ִ�!
//����ü �ʱ�ȭ�� �߰�ȣ ���

int main(void) {


	struct Student s = { "201600186", "���Ϲ�", 4, "������" };
		//�ݵ�� ���ʴ��!!! �߰�ȣ �ȿ� ���� ��
	printf("�й� : %s\n", s.studentId);
	printf("�̸�: %s\n", s.name);
	printf("���� : %d\n", s.grade);
	printf("�а� : %s\n", s.major);
	
	system("pause");

}

//����ü�� c���� ���� ��� >>�ҽ��ڵ� ª�� �����ϱ� ����
//�� �� �ϳ��� Type definition


typedef struct Student {  //typedef �� ��� 
	//������ ���� �� ����ü�� struct �� ���̰� student��� �θ��ڴ�!
	//������ �ڷ��� ���� �� �����Ƿ� ������ �� ª����
	char studentId[10];
	char name[10];
	int grade;
	char major[51];
} Student; // typedef : �߰�ȣ �� ��ü�� Student�� ����ϰڴ�! �� ��

    int main(void) {
		Student s = { "201600186", "���Ϲ�", 4 , "������" };
	//struct �� ���� Student�� �ᵵ �л� ����ü ���� ���� �� �ִ�! 
	strcpy(s.studentId, "201600186");
	strcpy(s.name, "���Ϲ�");
	s.grade = 4;
	strcpy(s.major, "������");

	printf("�й� : %s\n", s.studentId);
	printf("�̸�: %s\n", s.name);
	printf("���� : %d\n", s.grade);
	printf("�а� : %s\n", s.major);
	
	system("pause");

}



	//�͸� ����ü ����
	typedef struct {  //Student �� �ᵵ �����Ϸ��� �˾Ƽ� �ν�!
		// �� ª�� �ҽ��ڵ� ���� ����
		char studentId[10];
		char name[10];
		int grade;
		char major[51];
	} Student; 

	int main(void) {
		Student s = { "201600186", "���Ϲ�", 4 , "������" };
	 
		strcpy(s.studentId, "201600186");
		strcpy(s.name, "���Ϲ�");
		s.grade = 4;
		strcpy(s.major, "������");

		printf("�й� : %s\n", s.studentId);
		printf("�̸�: %s\n", s.name);
		printf("���� : %d\n", s.grade);
		printf("�а� : %s\n", s.major);

		system("pause");

	}*/

//#����ü�� ������ ������ ���Ǵ� ���(�����Ҵ� �̿� �����ͷ� ����)
#include <stdio.h>

typedef struct {  
	char studentId[10];
	char name[10];
	int grade;
	char major[51];
} Student;

int main(void) {
	Student* s = malloc(sizeof(Student));
	//�����Ҵ� �̿��� �ϳ��� �л�����ü���� ����� ��
	//�����ͺ���-malloc
	//s�� ������, ����s�� ����Ű�� �޸� �ּҿ� �л�����ü�� �Ҵ�
	//�ű⿡ �����ؼ� �����͸� �ٲٰڴ�! �� �ǹ�

	strcpy(s->studentId, "201600186"); 
	//�����ͺ����� ��� ���κ��� ���� �� ������ �ƴ� ȭ��ǥ!!
	strcpy(s->name, "���Ϲ�");
	s->grade = 4;
	strcpy(s->major, "������");

	printf("�й� : %s\n", s->studentId);
	printf("�̸�: %s\n", s->name);
	printf("���� : %d\n", s->grade);
	printf("�а� : %s\n", s->major);

	system("pause");

}
//������ ���� ���� ������ �ϳ��� �� �л�, ĳ����, ���� ���� ��ü��
//����, ǥ�� ����
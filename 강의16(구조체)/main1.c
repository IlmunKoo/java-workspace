//#구조체를 활용해 자신만의 자료형 만든다!
//구조체?
//여러 개의 변수를 묶어 하나의 객체를 표현하고자 할 때 사용
//배열: 동일한 특성을 가진 변수를 일렬로 나열
//구조체: 일종의 객체를 정의,표현하고자 할 때 사용
//여러 개의 변수를 묶어서 하나의 특성 표현시(게임에서 캐릭터, 몬스터 만들 때)

//구조체의 정의와 선언
//struct 구조체명{
//자료형1 변수명;
//자료형2 변수명;
//....
//};
/*
//#한 명의 학생에 대한 정보를 담고 있는 구조체
#include <stdio.h>
//구조체의 장점
//학생에 대한 정보들을 모아 학생이라는 객체를 정의할 수 있다

struct Student {// 학생 구조체 정의
	char studentId[10]; //10자까지 받겠다! 반드시 명시해줘야 함
	//안하면 프로그램에서 안뜸
	char name[10];
	int grade;
	char major[51];
	//문자열 형태
	   	} s;    //이어서 변수 선언해주면 전역변수로 사용 가능
                //일반적으로 하나의 변수 or 전역변수로 사용하고 싶을 때
                 //많이 사용하는 형태는x 이런게 있구나~ 정도

//구조체는 정의와 동시에 전역변수 선언 가능





//구조체 변수의 선언과 접근
int main(void){

//struct Student s;  //구조체 변수 선언(구조체 자체가 하나의 자료형이 됨)
strcpy(s.studentId, "201600186"); //구조체 변수에 접근시 온점(.)사용한다!
strcpy(s.name, "구일문");
s.grade = 4;
strcpy(s.major, "영문과");
//정보들 초기화
printf("학번 : %s\n", s.studentId);
printf("이름: %s\n", s.name);
printf("성적 : %d\n", s.grade);
printf("학과 : %s\n", s.major);
//출력 자체가 반복될 수 있기 때문에 하나의 함수로 만들어서
//특정한 학생 구조체 변수(s)에 대해서 주기적으로 호출
system("pause");

}



//#구조체의 초기화
//변수 초기화를 일일히 하지 않고, 한번에(차례대로!!) 할 수 있다!
//구조체 초기화는 중괄호 사용

int main(void) {


	struct Student s = { "201600186", "구일문", 4, "영문과" };
		//반드시 차례대로!!! 중괄호 안에 들어가야 함
	printf("학번 : %s\n", s.studentId);
	printf("이름: %s\n", s.name);
	printf("성적 : %d\n", s.grade);
	printf("학과 : %s\n", s.major);
	
	system("pause");

}

//구조체는 c언어에서 많이 사용 >>소스코드 짧게 정의하기 성행
//그 중 하나가 Type definition


typedef struct Student {  //typedef 쓸 경우 
	//앞으로 나는 이 구조체를 struct 안 붙이고 student라고만 부르겠다!
	//임의의 자료형 만들 수 있으므로 선언이 더 짧아짐
	char studentId[10];
	char name[10];
	int grade;
	char major[51];
} Student; // typedef : 중괄호 안 전체를 Student로 사용하겠다! 는 뜻

    int main(void) {
		Student s = { "201600186", "구일문", 4 , "영문과" };
	//struct 안 쓰고 Student만 써도 학생 구조체 변수 만들 수 있다! 
	strcpy(s.studentId, "201600186");
	strcpy(s.name, "구일문");
	s.grade = 4;
	strcpy(s.major, "영문과");

	printf("학번 : %s\n", s.studentId);
	printf("이름: %s\n", s.name);
	printf("성적 : %d\n", s.grade);
	printf("학과 : %s\n", s.major);
	
	system("pause");

}



	//익명 구조체 개념
	typedef struct {  //Student 안 써도 컴파일러가 알아서 인식!
		// 더 짧게 소스코드 구성 가능
		char studentId[10];
		char name[10];
		int grade;
		char major[51];
	} Student; 

	int main(void) {
		Student s = { "201600186", "구일문", 4 , "영문과" };
	 
		strcpy(s.studentId, "201600186");
		strcpy(s.name, "구일문");
		s.grade = 4;
		strcpy(s.major, "영문과");

		printf("학번 : %s\n", s.studentId);
		printf("이름: %s\n", s.name);
		printf("성적 : %d\n", s.grade);
		printf("학과 : %s\n", s.major);

		system("pause");

	}*/

//#구조체가 포인터 변수로 사용되는 경우(동적할당 이용 포인터로 접근)
#include <stdio.h>

typedef struct {  
	char studentId[10];
	char name[10];
	int grade;
	char major[51];
} Student;

int main(void) {
	Student* s = malloc(sizeof(Student));
	//동적할당 이용해 하나의 학생구조체변수 만들어 줌
	//포인터변수-malloc
	//s는 포인터, 변수s가 가리키는 메모리 주소에 학생구조체가 할당
	//거기에 접근해서 데이터를 바꾸겠다! 는 의미

	strcpy(s->studentId, "201600186"); 
	//포인터변수의 경우 내부변수 접근 시 온점이 아닌 화살표!!
	strcpy(s->name, "구일문");
	s->grade = 4;
	strcpy(s->major, "영문과");

	printf("학번 : %s\n", s->studentId);
	printf("이름: %s\n", s->name);
	printf("성적 : %d\n", s->grade);
	printf("학과 : %s\n", s->major);

	system("pause");

}
//이제는 여러 개의 변수가 하나로 모여 학생, 캐릭터, 몬스터 등의 객체를
//정의, 표현 가능
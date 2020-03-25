package polymorphism;
//클래스는 여러 개 일 수 있다! 단, public class는 하나여야 함

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");  //오버라이딩(재정의)
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다."); //Animal 타입이기 때문에 readbooks 보이진 않음, 호출하려면 다시 human으로 돌아가야 함
		
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");		
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 갈아갑니다.");
		//각 클래스에만 있기 때문에 animal에서는 쓸 수 없음
	}
}

class Rabbit extends Animal{
	
}



public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();  //형변환(업캐스팅) => Human, Tiger, Eagle의 클래스는 모두 Animal
		Animal tAnimal = new Tiger();  //Animal class아래 세 가지 하위클래스 존재
		Animal eAnimal = new Eagle();  
		//eagle에서 move가  재정의됐을 때, 인스턴스(eagle)의 move가 호출된다
		
				
		//#다운캐스팅이 필요한 이유: hAnimal에서 readingbooks를 보이게 하려면
		/*Human human = (Human)hAnimal;
		human.readBooks();
		*/
		//Eagle human = (Eagle)hAnimal; //error:Human cannot be cast to polymorphism.Eagle
        //인스턴스는 Human인데 Eagle로 강제캐스팅하려고 함, 오류
		if(hAnimal instanceof Human) {
			//if(hAnimal instanceof Eagle) {
			//Eagle human = (Eagle)hAnimal; 
			//오류나지 않음, instanceof는 true나 false를 반환, hAnimal이 Eagle타입의 인스턴스라고 선언
            Human human = (Human)hAnimal;  //다운캐스팅, Human에서만 쓸 수 있는 메서드 쓰기 위해
            human.readBooks();
		}
		
		
		//#정리
		//#가상함수를 사용해 오버라이딩(재정의) 가능한 경우(다형성)는 오버라이딩 사용 ex)eating의 경우 animal의 공통적메서드
        //readbooks와같은 인간만 할 수 있는 메서드의 경우 다운캐스팅 필요, 안정적으로 하려면 intanceof 써 줄 것				
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		//#다운캐스팅
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal); 
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);  //AnimalList를 넘겨 줌
	
		
		
		/*
		for(Animal animal : animalList) {  //향상된 for문 for(클래스 변수이름 : ArrayList명)
			animal.move();
			//이때 move는 Animal클래스의 move가 아닌 각 인스턴스의 move!, 가상메서드 방식
			//가상메서드에 의해 맵핑되는 함수가 호출, 다양한 구현 이루어짐
			//가상함수: 기본클래스(Animal)에서 선언, 파생클래스(human, tiger, eagle)에서 재정의
		}
		//마찬가지로 다형성(polymorphism), 코드는 하나지만 구현된 내용이 다르게 나옴
		
		//cf) 추상클래스: 실체클래스의 공통적인 부분(변수, 메서드)를 추출해서 선언한 클래스
		//추상클래스는 객체를 생성할 수 없음, 추상클래스와 실체클래스는 상속관계
		//추상클래스: attack
		//실체클래스: gun, canon, sword 등 공격이라는 메서드를 다르게 표현
		
		*/	
	}
	
	public void testDownCasting(ArrayList<Animal> list) {  //ArrayList를 매개변수로, 하나씩 꺼냄
       	for(int i = 0; i < list.size(); i++ ) {
	     	Animal animal = list.get(i);
	     	
	     	if(animal instanceof Human) {  //Animal이 Human의 인스턴스일 경우
	     		Human human = (Human)animal;  //Animal이었던 animal을 다운캐스팅
	     		human.readBooks();
	     	}
	     	else if(animal instanceof Tiger) {
	     		Tiger tiger = (Tiger)animal;
	     		tiger.hunting();
	     	}
	     	else if(animal instanceof Eagle) {
	     		Eagle eagle = (Eagle)animal;
	     		eagle.flying();
	       	}
	     	else {
	     		System.out.println("error");
	     	}	
	}
	
	}
	
		
	public void moveAnimal(Animal animal) {  //매개변수의 타입 Animal (상위클래스 선택, 모두 Animal에 포함되므로)
		animal.move();  
		//다형성: 하나의 코드로 여러 자료형이 구현되어 다른 실행이 이루어지는 것!!
		//따로move함수를 만든다면 세 개의 다른 함수를 만들어야 함
		//다형성을 사용하면 함수 하나만 가지고 다양한 구현이 가능!!
		//세 개의 하위클래스(휴먼, 타이거, 이글)가 모두 Animal타입이기 때문!!
	}
	
	
}

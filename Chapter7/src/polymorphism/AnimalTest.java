package polymorphism;
//Ŭ������ ���� �� �� �� �ִ�! ��, public class�� �ϳ����� ��

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�");  //�������̵�(������)
	}
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�."); //Animal Ÿ���̱� ������ readbooks ������ ����, ȣ���Ϸ��� �ٽ� human���� ���ư��� ��
		
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");		
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
		//�� Ŭ�������� �ֱ� ������ animal������ �� �� ����
	}
}

class Rabbit extends Animal{
	
}



public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();  //����ȯ(��ĳ����) => Human, Tiger, Eagle�� Ŭ������ ��� Animal
		Animal tAnimal = new Tiger();  //Animal class�Ʒ� �� ���� ����Ŭ���� ����
		Animal eAnimal = new Eagle();  
		//eagle���� move��  �����ǵ��� ��, �ν��Ͻ�(eagle)�� move�� ȣ��ȴ�
		
				
		//#�ٿ�ĳ������ �ʿ��� ����: hAnimal���� readingbooks�� ���̰� �Ϸ���
		/*Human human = (Human)hAnimal;
		human.readBooks();
		*/
		//Eagle human = (Eagle)hAnimal; //error:Human cannot be cast to polymorphism.Eagle
        //�ν��Ͻ��� Human�ε� Eagle�� ����ĳ�����Ϸ��� ��, ����
		if(hAnimal instanceof Human) {
			//if(hAnimal instanceof Eagle) {
			//Eagle human = (Eagle)hAnimal; 
			//�������� ����, instanceof�� true�� false�� ��ȯ, hAnimal�� EagleŸ���� �ν��Ͻ���� ����
            Human human = (Human)hAnimal;  //�ٿ�ĳ����, Human������ �� �� �ִ� �޼��� ���� ����
            human.readBooks();
		}
		
		
		//#����
		//#�����Լ��� ����� �������̵�(������) ������ ���(������)�� �������̵� ��� ex)eating�� ��� animal�� �������޼���
        //readbooks�Ͱ��� �ΰ��� �� �� �ִ� �޼����� ��� �ٿ�ĳ���� �ʿ�, ���������� �Ϸ��� intanceof �� �� ��				
		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		//#�ٿ�ĳ����
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal); 
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);  //AnimalList�� �Ѱ� ��
	
		
		
		/*
		for(Animal animal : animalList) {  //���� for�� for(Ŭ���� �����̸� : ArrayList��)
			animal.move();
			//�̶� move�� AnimalŬ������ move�� �ƴ� �� �ν��Ͻ��� move!, ����޼��� ���
			//����޼��忡 ���� ���εǴ� �Լ��� ȣ��, �پ��� ���� �̷����
			//�����Լ�: �⺻Ŭ����(Animal)���� ����, �Ļ�Ŭ����(human, tiger, eagle)���� ������
		}
		//���������� ������(polymorphism), �ڵ�� �ϳ����� ������ ������ �ٸ��� ����
		
		//cf) �߻�Ŭ����: ��üŬ������ �������� �κ�(����, �޼���)�� �����ؼ� ������ Ŭ����
		//�߻�Ŭ������ ��ü�� ������ �� ����, �߻�Ŭ������ ��üŬ������ ��Ӱ���
		//�߻�Ŭ����: attack
		//��üŬ����: gun, canon, sword �� �����̶�� �޼��带 �ٸ��� ǥ��
		
		*/	
	}
	
	public void testDownCasting(ArrayList<Animal> list) {  //ArrayList�� �Ű�������, �ϳ��� ����
       	for(int i = 0; i < list.size(); i++ ) {
	     	Animal animal = list.get(i);
	     	
	     	if(animal instanceof Human) {  //Animal�� Human�� �ν��Ͻ��� ���
	     		Human human = (Human)animal;  //Animal�̾��� animal�� �ٿ�ĳ����
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
	
		
	public void moveAnimal(Animal animal) {  //�Ű������� Ÿ�� Animal (����Ŭ���� ����, ��� Animal�� ���ԵǹǷ�)
		animal.move();  
		//������: �ϳ��� �ڵ�� ���� �ڷ����� �����Ǿ� �ٸ� ������ �̷������ ��!!
		//����move�Լ��� ����ٸ� �� ���� �ٸ� �Լ��� ������ ��
		//�������� ����ϸ� �Լ� �ϳ��� ������ �پ��� ������ ����!!
		//�� ���� ����Ŭ����(�޸�, Ÿ�̰�, �̱�)�� ��� AnimalŸ���̱� ����!!
	}
	
	
}

package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		//Scanner: �Է��� �����ִ� Ŭ����
		//System.in: �Է¿� ��Ʈ��(ǥ���Է�)>> �ֿܼ��� �Է°���
		int age = scanner.nextInt();
		//������ ���߿� ������Ҷ� ��
		
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 1500;
				}
		else if (age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		//else if �� if�� ����: 
		//else if�� ���� if�� ��Ÿ�� ����, ���� if �ٽ� ���x
		//if�� ��Ÿ�����谡 �ƴϹǷ�  ���� if�� �ѹ� �� ���
		//else�� ��������
System.out.println("����: " + age);
System.out.println("���: " + charge);
	}

}
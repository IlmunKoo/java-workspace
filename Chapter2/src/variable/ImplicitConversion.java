package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
byte bNum = 10;
int iNum =bNum;
//int�� 4����Ʈ, byte�� 1����Ʈ >> bNum�� iNum���� ���µ��� �ƹ� ���� ����(������ �� ��ȯ)
//����: byte(1) > short(2) > int(3) > long(4) > �Ǽ� float(4) > double(8)
//ȭ��ǥ �������� ���°��� ������ �� ��ȯ(���� �� - > ū ��, �� ������ �� -> �� ������ ��)

System.out.println(bNum);
System.out.println(iNum);

int iNum2 = 20;
float fNum = iNum2;
//������ �Ǽ��� ���ε�(����)> �ƹ��� ����x
System.out.println(fNum);
//20.0���� ��� >>������ �Ǽ�ȭ�Ǿ� ���Դٴ� ��

double dNum;
dNum = fNum + iNum;
//�������� �켱����>> ���Կ����ڰ� ���� �켱������ ����
//iNum�� ���� �Ǽ�(float, 4����Ʈ)�� �ٲ� �� fNum�� ������>> ���Կ����� ���� �ٽ� double�� �ٲ�, �� 2��  ����ȯ 
System.out.println(dNum);

	}

}

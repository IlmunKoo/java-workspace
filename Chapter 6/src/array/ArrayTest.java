package array;

public class ArrayTest {

	public static void main(String[] args) {
		//int �� �⺻ �ڷ���, ���� �ڷ����� �ٸ�
		//��ü�� �� �ִ� ����� �����Ʈ¥������ �������� �⺻�ڷ������� �� �ִ°Ͱ��� ũ�Ⱑ �ٸ���.
		
		//int[] arr = new int[](1,2,3)
				//����� ���ÿ� �ʱ�ȭ>> int[] arr = (1,2,3)  >>new ��������
				//�ʱ�ȭ�� ���� �ȿ� ���� �ȳ���, 
		
		int[] arr = new int[10];
		int total = 0;
		for(int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

			 //���� ����. System.out.println(arr[i]); 
		
		//i�� �ִµ� �� �����ص� �Ǵ� ����: ���⼭�� ���������� ����, for�� ���� �߰�ȣ������ ��ȿ
		//���������� ���� �����, ��������� �ߺ����� �Ұ�
		for(int i = 0; i <arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		
		double[] dArr = new double[5];
		
		int count = 0;
		//dArr.length�� 5���ε� ��ȿ�� ���� 3���ۿ� ���� ��� count���� �����ؼ� ������
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
				
		//������ �ΰ��� 0.0���� �ʱ�ȭ�ǹǷ� ��°� 0�� ����
		
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);

	}

}

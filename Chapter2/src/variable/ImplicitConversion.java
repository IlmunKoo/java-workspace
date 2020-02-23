package variable;

public class ImplicitConversion {

	public static void main(String[] args) {
byte bNum = 10;
int iNum =bNum;
//int는 4바이트, byte는 1바이트 >> bNum이 iNum으로 들어가는데는 아무 문제 없음(묵시적 형 변환)
//정수: byte(1) > short(2) > int(3) > long(4) > 실수 float(4) > double(8)
//화살표 방향으로 가는것은 묵시적 형 변환(작은 수 - > 큰 수, 덜 정밀한 수 -> 더 정밀한 수)

System.out.println(bNum);
System.out.println(iNum);

int iNum2 = 20;
float fNum = iNum2;
//정수를 실수에 바인딩(대입)> 아무런 문제x
System.out.println(fNum);
//20.0으로 출력 >>정수가 실수화되어 나왔다는 뜻

double dNum;
dNum = fNum + iNum;
//연산자의 우선순위>> 대입연산자가 가장 우선순위가 낮음
//iNum이 먼저 실수(float, 4바이트)로 바뀐 후 fNum과 더해짐>> 대입연산자 통해 다시 double로 바뀜, 총 2번  형변환 
System.out.println(dNum);

	}

}

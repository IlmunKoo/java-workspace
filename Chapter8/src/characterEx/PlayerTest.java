package characterEx;

import java.util.ArrayList;

public class PlayerTest {

	public static void main(String[] args) {
  
		
		Player player = new Player();
		player.play(1);
		
		IntermediateLevel iLevel = new IntermediateLevel();
		player.upgradeLevel(iLevel);
		//iLevel.play(2); �������� ����: IntermediateLevel�� play�� ���� ���ǵ����� ����!! Play�޼���� Player������ ���ǵ�����
		//���� play �޼���� player�Լ����� ���ǵž� ��, �ٸ� player�� ������ ������ ��½�ų �ʿ� �����Ƿ� ������ ���� ��Ű��, �׿� ���� ��� ������ �ؾ� �� 
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
		//player�� upgradeLevel�Լ��� �Ű����� Ÿ��: PlayerLevel
		//���ڸ��� PlayerLevel�� �ڽ�Ŭ������ IntermediateLevel�� �����Ƿ�
		//PlayerLevel�� �ν��Ͻ��� level�� Ŭ������ �ش� �Ű������� Ŭ����(IntermediateLevel)�� ��ȭ!!
		//���� play�� ������ ���� ����/ �޸��⸦ ����� �� �ִ�!
		//if���� �ϳ��� �Ⱦ��� ����
		
	}

}

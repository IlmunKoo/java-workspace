package abstractEx;

public class MainBoardPlayer {

	public static void main(String[] args) {

		Player player = new Player();   //Player�����ڿ� ���ʷ����� ���� ����
	    player.play(1);
	    
	    AdvancedLevel aLevel = new AdvancedLevel();
	    player.upgradeLevel(aLevel);
	    player.play(2);  //jump�ι�!!(count��ŭ)
	    
	    SuperLevel sLevel = new SuperLevel();
	    player.upgradeLevel(sLevel);
	    player.play(3);
	}

}

//if�� ���� �ʰ� �������� ���� �ν��Ͻ��� �Ҹ�!! 
//���� �߰��� Ŭ������ �߰����ָ� ��
//�����߰��� ����Ŭ������ PlayerLevel���� �߰����ָ� ������ �߰��ؼ� ���� ����
//���׷��̵�/ �������� ���� 
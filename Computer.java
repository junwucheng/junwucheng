package cn.jbit.Match;

/**
 * Person������
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */

public class Computer {
	String name = "����";		//����
	int Score;			//����
	int random = (int)(1+Math.random()*(3-1+1));	//����0~3�����������ʾ���Գ�ȭ
	/**
	 * showFist��ʾ���Գ�ȭ����ķ���
	 * @return 1������ 2�� ʯͷ 3�� ��
	 */
	public int showFist() {
		//�����ȭ���
		if(random == 1) {
			System.out.println("���Գ�ȭ������");
		} else if(random == 2) {
			System.out.println("���Գ�ȭ��ʯͷ");
		} else if(random == 3) {
			System.out.println("���Գ�ȭ����");
		}
		return random;
	}
	
}

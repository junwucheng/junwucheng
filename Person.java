package cn.jbit.Match;

import java.util.Scanner;

/**
 * Person�û���
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */

public class Person {
	Scanner input = new Scanner(System.in);
	String name = "����";		//�û���
	int Score;			//����
	
	/**
	 * ��ʾ�û���ȭ����ķ���
	 * @return 1������ 2�� ʯͷ 3�� ��
	 */
	public int showFist() {
		System.out.print("���ȭ��1.����2.ʯͷ3.��(������Ӧ����)��");
		int no = input.nextInt();		//�û���������
		//�жϲ���ʾ���
		if(no == 1) {
			System.out.println("���ȭ������");
		} else if(no == 2) {
			System.out.println("���ȭ��ʯͷ");
		} else if(no == 3) {
			System.out.println("���ȭ����");
		}
		//����no
		return no;
	}

}

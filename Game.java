package cn.jbit.Match;

import java.util.Scanner;

/**
 * Game��Ϸ��
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */
public class Game {
	Person person;			//�û�
	Computer computer;		//����
	int count;		//��ս����
	
	/**
	 * ��ʼ��
	 */
	public void initial() {
		person = new Person();
		computer = new Computer();
		count = 0;
	}	
	/**
	 * ��ʼ��Ϸ
	 */
	public void startGame() {
			initial();
			System.out.println("------��ӭ������Ϸ------");
			System.out.println("\t******************");
			System.out.println  ("\t**  ��ȭ, ��ʼ    **");
			System.out.println  ("\t******************");
			System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
			/*ѡ���ս��ɫ*/	
			System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3���ܲ٣��� ");
			Scanner input = new Scanner(System.in);
			int role = input.nextInt();
			if(role == 1) {
				computer.name = "����";
			} else if(role == 2) {
				computer.name = "��Ȩ";
			} else if(role == 3) {
				computer.name = "�ܲ�";
			}
			System.out.println("��ѡ����"+computer.name+"��ս");
			
			/*��ʼ��Ϸ*/
			System.out.print("Ҫ��ʼ��(y/n)��");
			String con = input.next();	//�û������Ƿ�ʼ
			int perFist;		//�û�����ȭ
			int compFist;		//���Գ���ȭ
			//�����û���ѡ���Ƿ�ѭ����Ϸ
			while("y".equals(con)) {
				/*��ȭ*/
				perFist = person.showFist();
				compFist = computer.showFist();
					/*�þ�*/
					if((perFist  == 1 && compFist == 1) || (perFist  == 2 && compFist == 2) || (perFist  == 3 && compFist == 3)) {
						System.out.println("������;֣���˥!");
					} else if((perFist  == 1 && compFist == 3) || (perFist  == 2 && compFist == 1) ||(perFist  == 3 && compFist == 2)) {
						System.out.println("�������ϲ����Ӯ�ˣ�");
						person.Score++;			//�û������ۼ�
					} else {
						System.out.println("����������ˣ��汿");
						computer.Score++;		//���Ի����ۼ�
					}
					count++;		//�����ۼ�
					System.out.print("\n�Ƿ�ʼ��һ��(y/n)��");
					con = input.next();		//�û������Ƿ����
					/*��ʾ���*/
					showResult();
			} 
			System.out.print("\n�����˳���Ϸ���������������");
			
	}
	/**
	 * ��ʾ�������
	 */
	public void showResult() {
		System.out.println("-------------------------------------");
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("��ս������"+count);
		int result = calcResult();
		if(result == 1) {
			System.out.println("�������ƽ�֣��´��ٺ���һ�����£�");
		} else if(result == 2) {
			System.out.println("�������ϲ��ϲ��");		//�û���ʤ
		} else {
			System.out.println("������Ǻǣ��������´μ��Ͱ���");		//���Ի�ʤ
		}
		System.out.println("-------------------------------------");
	}
	/**
	 * ����������
	 * @return 1��ƽ�� 2���û�Ӯ 3������Ӯ
	 */
	public int calcResult(){
		if(person.Score == computer.Score) {
			return 1;		//ƽ��
		} else if(person.Score > computer.Score) {
			return 2;		//�û�Ӯ
		} else {
			return 3;		//����Ӯ
		}
	}
}

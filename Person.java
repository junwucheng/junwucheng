package cn.jbit.Match;

import java.util.Scanner;

/**
 * Person用户类
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */

public class Person {
	Scanner input = new Scanner(System.in);
	String name = "匿名";		//用户名
	int Score;			//积分
	
	/**
	 * 显示用户出拳结果的方法
	 * @return 1：剪刀 2： 石头 3： 布
	 */
	public int showFist() {
		System.out.print("请出拳：1.剪刀2.石头3.布(输入相应数字)：");
		int no = input.nextInt();		//用户输入数字
		//判断并显示结果
		if(no == 1) {
			System.out.println("你出拳：剪刀");
		} else if(no == 2) {
			System.out.println("你出拳：石头");
		} else if(no == 3) {
			System.out.println("你出拳：布");
		}
		//返回no
		return no;
	}

}

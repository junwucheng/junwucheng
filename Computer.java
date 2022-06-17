package cn.jbit.Match;

/**
 * Person电脑类
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */

public class Computer {
	String name = "电脑";		//名字
	int Score;			//积分
	int random = (int)(1+Math.random()*(3-1+1));	//产生0~3的随机数，表示电脑出拳
	/**
	 * showFist显示电脑出拳结果的方法
	 * @return 1：剪刀 2： 石头 3： 布
	 */
	public int showFist() {
		//输出出拳结果
		if(random == 1) {
			System.out.println("电脑出拳：剪刀");
		} else if(random == 2) {
			System.out.println("电脑出拳：石头");
		} else if(random == 3) {
			System.out.println("电脑出拳：布");
		}
		return random;
	}
	
}

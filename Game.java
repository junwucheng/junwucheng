package cn.jbit.Match;

import java.util.Scanner;

/**
 * Game游戏类
 * @author dust_free_jun
 * @since jdk1.8
 * @version 1.0	2022/06/11
 *
 */
public class Game {
	Person person;			//用户
	Computer computer;		//电脑
	int count;		//对战次数
	
	/**
	 * 初始化
	 */
	public void initial() {
		person = new Person();
		computer = new Computer();
		count = 0;
	}	
	/**
	 * 开始游戏
	 */
	public void startGame() {
			initial();
			System.out.println("------欢迎进入游戏------");
			System.out.println("\t******************");
			System.out.println  ("\t**  猜拳, 开始    **");
			System.out.println  ("\t******************");
			System.out.println("出拳规则：1.剪刀 2.石头 3.布");
			/*选择对战角色*/	
			System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）： ");
			Scanner input = new Scanner(System.in);
			int role = input.nextInt();
			if(role == 1) {
				computer.name = "刘备";
			} else if(role == 2) {
				computer.name = "孙权";
			} else if(role == 3) {
				computer.name = "曹操";
			}
			System.out.println("您选择了"+computer.name+"对战");
			
			/*开始游戏*/
			System.out.print("要开始吗(y/n)：");
			String con = input.next();	//用户输入是否开始
			int perFist;		//用户出的拳
			int compFist;		//电脑出的拳
			//根据用户的选择是否循环游戏
			while("y".equals(con)) {
				/*出拳*/
				perFist = person.showFist();
				compFist = computer.showFist();
					/*裁决*/
					if((perFist  == 1 && compFist == 1) || (perFist  == 2 && compFist == 2) || (perFist  == 3 && compFist == 3)) {
						System.out.println("结果：和局，真衰!");
					} else if((perFist  == 1 && compFist == 3) || (perFist  == 2 && compFist == 1) ||(perFist  == 3 && compFist == 2)) {
						System.out.println("结果：恭喜，您赢了！");
						person.Score++;			//用户积分累加
					} else {
						System.out.println("结果：您输了，真笨");
						computer.Score++;		//电脑积分累加
					}
					count++;		//局数累加
					System.out.print("\n是否开始下一轮(y/n)：");
					con = input.next();		//用户输入是否继续
					/*显示结果*/
					showResult();
			} 
			System.out.print("\n您以退出游戏，程序结束！！！");
			
	}
	/**
	 * 显示比赛结果
	 */
	public void showResult() {
		System.out.println("-------------------------------------");
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("对战次数："+count);
		int result = calcResult();
		if(result == 1) {
			System.out.println("结果：打车平手，下次再和你一绝高下！");
		} else if(result == 2) {
			System.out.println("结果：恭喜恭喜！");		//用户获胜
		} else {
			System.out.println("结果：呵呵，笨笨，下次加油啊！");		//电脑获胜
		}
		System.out.println("-------------------------------------");
	}
	/**
	 * 计算比赛结果
	 * @return 1：平局 2：用户赢 3：电脑赢
	 */
	public int calcResult(){
		if(person.Score == computer.Score) {
			return 1;		//平局
		} else if(person.Score > computer.Score) {
			return 2;		//用户赢
		} else {
			return 3;		//电脑赢
		}
	}
}

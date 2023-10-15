package unit05;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		// 需求：
			// 请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
			// a 表示星期一，b 表示星期二 …
			// 根据用户的输入显示相应的信息.要求使用 switch 语句完成
		
		
		// 代码：
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入字符：");
		
		char chars = myScanner.next().charAt(0);
		
		switch(chars) {
			case 'a':
				System.out.println("今天星期一~~");
				break;
			case 'b':
				System.out.println("今天星期二~~");
				break;
			case 'c':
				System.out.println("今天星期三~~");
				break;
			case 'd':
				System.out.println("今天星期四~~");
				break;
			case 'e':
				System.out.println("今天星期五~~");
				break;
			case 'f':
				System.out.println("今天星期六~~");
				break;
			case 'g':
				System.out.println("今天星期天~~");
				break;
			default :
				System.out.println("你输入的字符不正确，没有匹配的");
		}
		
		System.out.println("退出了 switch ,继续执行程序");
	}
}

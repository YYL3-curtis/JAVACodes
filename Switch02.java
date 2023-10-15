package unit05;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		//  需求：
			// 使用 switch 把小写类型的 char 型转为大写(键盘输入)。
			// 只转换 a, b, c, d, e. 其它的输出"other"
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入字符：");
		
		char chars = myScanner.next().charAt(0);
		
		switch(chars) {
		case 'a' :
			System.out.println("A");
			break;
		case 'b' :
			System.out.println("B");
			break;
		case 'c' :
			System.out.println("C");
			break;
		case 'd' :
			System.out.println("D");
			break;
		case 'e' :
			System.out.println("E");
			break;
		default : 
			System.out.println("other~~");
		}
	}
}

package unit06;
import java.util.Scanner;
public class Homework02 {
	public static void main(String[] args) {
		// 需求：
			// 实现判断一个整数，属于哪个范围：大于0，小于0，等于0
		
		
		// 分析：
			// if-else if-else
		
		// 代码：
		Scanner myScanenr = new Scanner(System.in);
		System.out.println("请输入数字：");
		int guess_num = myScanenr.nextInt();
		if(guess_num > 0) {
			System.out.println("该数大于0~~~");
		}else if(guess_num < 0) {
			System.out.println("该数小于0~~~");
		}else if(guess_num == 0) {
			System.out.println("该数等于0~~~");
		}else {
			System.out.println("输入有误，请重新输入!!!");
		}
		
	}
}

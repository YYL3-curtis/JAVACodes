package unit05;
// 导包
import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// 需求：
		// 编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁,
		// 则输出 "你年龄大于 18,要对自己的行为负责,送入监狱"
	
	
	// 分析：
		// 定义Scanner对象，以接收要输入的年龄
		// 将接收的年龄利用if语句进行判断
		// 如果年龄大于18岁，则输出 "你年龄大于 18,要对自己的行为负责,送入监狱"
		// 否则输出"你的年龄不大这次放过你了"
	
	
	// 代码：
		// 定义Scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
		}else {
			System.out.println("你的年龄不大这次放过你了");
		}
		
		System.out.println("程序继续....");
	}
}

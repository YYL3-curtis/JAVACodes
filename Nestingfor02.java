package unit06;
import java.util.Scanner;

public class Nestingfor02 {
	public static void main(String[] args) {
		// 需求：
			// 1) 统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
			// 2) 统计三个班及格人数，每个班有 5 名同学。
		
		// 分析：
			// 利用嵌套for循坏依次接收学生成绩
		
		
		// 代码：
		Scanner myScanner = new Scanner(System.in);
		int Total_score = 0;
		int score= 0 ;
		int passNum = 0;
		for (int i = 1; i <= 3; i++) {	// 循环班级
			int sum = 0;
			for(int j = 1; j <= 5; j++) {
				System.out.println("请输入第 " + i + "个班级，第" + j + "个学生的成绩：");	// 循环学生成绩
				score = myScanner.nextInt();
				if(score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("成绩为： " + score);
			}
			Total_score += sum;
		}
		System.out.println("三个班总分="+ Total_score+ " 平均分=" + Total_score / (3*5));
		System.out.println("及格人数=" + passNum);

	}
}

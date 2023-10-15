package unit05;

import java.util.Scanner;

public class Ifelseif03 {
	public static void main(String[] args) {
	// 需求：
		// 参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。
		// 并且根据性别提示进入男子组或女子组。
		// double score; char gender;
		// 接收字符: char gender = scanner.next().charAt(0)
		
	// 分析：
		// 定义Scanner对象，接收输入
		// 定义变量score，并进行判断(if-else if- else)
		// 如果初赛成绩大于80，进入决赛，负责提示淘汰
		// 再用选手输入性别gender，进行男女分组
		
	// 代码:
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入选手成绩：");
		double score = myScanner.nextDouble();
		if(score >= 8.0) {
			System.out.println("请输入选手性别：");
			char gender = myScanner.next().charAt(0);
			if(gender == '男') {
				System.out.println("恭喜进入男子组决赛~~");
			}else if(gender == '女') {
				System.out.println("恭喜进入女子组决赛~~");
			}else {
				System.out.println("您输入的性别有误，请从重输入~~");
			}
		}else {
			System.out.println("抱歉，您被淘汰了~~");
		}
}
}

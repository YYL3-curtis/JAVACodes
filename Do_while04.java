package unit06;
import java.util.Scanner;

public class Do_while04 {
	public static void main(String[] args) {
		//  需求：
			// 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
		
		// 分析：
			// 导包Scanner，用于接收李三的回答
			// 不停第问还钱
			// 利用do-while语句进行判断
		
		
		// 代码：
			Scanner youScanner = new Scanner(System.in);
			char answer = ' ';
			do {
				System.out.println("老韩：还钱 ！！  y/n");
				System.out.println("老韩一直使出五连鞭~~");
				answer = youScanner.next().charAt(0);
				System.out.println("李三的回答是：" + answer);
			}while(answer != 'y'); // 李三答应还钱
			System.out.println("李三还钱~~~");
	}
}

package unit05;

public class Ifelseif04 {
	public static void main(String[] args) {
		// 出票系统:根据淡旺的月份和年龄，打印票价
		// 4-10 旺季：
			// 成人(18-60): 60
			// 儿童(<18):半价
			// 老人(>60):1/3;
		
		// 11-3 淡季：
			// 成人：40
			// 其他：20
		
		// 分析：
			// 利用if-else判断淡旺季，用嵌套分支判断年龄
		
		
		// 代码：
		int money = 60;
		int gender = 16;
		String season = "旺";
		if(season == "旺") {
			if(gender > 18 & gender < 60) {
				System.out.println("票价：" + money);
			}else if(gender < 18) {
				System.out.println("票价：" + money / 2);
			}else if(gender > 60) {
				System.out.println("票价：" + money / 3);
			}
		}else if(season == "淡"){
			System.out.println("票价：" + (money- 20));
		}else {
			System.out.println("票价：" + (money - 40));
		}
	}
}

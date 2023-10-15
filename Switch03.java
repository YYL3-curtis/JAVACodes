package unit05;

public class Switch03 {
	public static void main(String[] args) {
		// 需求：
			// 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。
			// 提示： 提示成绩 / 60
		
		
		// 代码：
		double fraction = 60;
		if(fraction <= 100 & fraction >= 0) {
			switch((int)(fraction / 60.0)) {
			case 0:
				System.out.println("不鸡格~~");
				break;
			case 1:
				System.out.println("鸡格~~");
				break;
			default:
				System.out.println("输入有误~~");
			}
		}else {
			System.out.println("输入的数值只能在1-100之间~~");
		}
			
	}
}

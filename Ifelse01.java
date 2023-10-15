package unit05;

public class Ifelse01 {
	public static void main(String[] args) {
		// 需求：
			// 编写程序，声明 2 个 double 型变量并赋值。
			// 判断第一个数大于 10.0，且第 2 个数小于20.0，打印两数之和。
		
		// 分析：
			// 声明 2 个 double 型变量并赋值
			// 利用if-else语句进行判断
			// 如果第一个数大于 10.0，且第 2 个数小于20.0
			// 则打印两数之和
		
		// 代码：
		double num1 = 23.0;
		double num2 = 18.0;
		if(num1 > 10.0 & num2 < 20.0) {
			System.out.println("两数之和:：" + (num1 + num2));
		}
	}
}

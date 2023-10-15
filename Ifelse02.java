package unit05;

public class Ifelse02 {
	public static void main(String[] args) {
		// 需求：
			// 定义两个变量 int，判断二者的和
			// 是否能被 3 又能被 5 整除，打印提示信息
		// 代码：
		int num1 = 10;
		int num2 = 45;
		int num3 = num1 + num2;
		if(num3 % 3 == 0 & num3 % 5 == 0) {
			System.out.println(num3 + "  可以被3和5 整除");
		}else {
			System.out.println(num3 + "  不可以被3和5 整除");
		}
	}
}

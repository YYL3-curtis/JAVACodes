package unit05;

public class Ifelse03 {
	public static void main(String[] args) {
		// 需求：
			// 判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
			// (1)年份能被 4 整除，但不能被100 整除；
			// (2)能被400整除
		// 代码：
		int year = 2028;
		if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " 是闰年");
		}else {
			System.out.println(year + " 不是闰年");
		}
	}
}

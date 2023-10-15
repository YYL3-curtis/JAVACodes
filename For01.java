package unit06;

public class For01 {
	public static void main(String[] args) {
		// 需求:
			// 打印 1~100 之间所有是 9 的倍数的整数，统计个数 及 总和.
		
		// 编程思想：
			// [化繁为简,先死后活]
		
		
		// 代码：
		
		int count = 0;
		int sum = 0;
		
		// 先死后活
		int start = 1;
		int end = 100;
		int t = 9;
		for (int i = start; i <= end; i++) {
			if(i % t == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("整数的个数为：" + sum);
		System.out.println("整数的总和为：" + count);
	}
}

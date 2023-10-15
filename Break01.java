package unit06;

public class Break01 {
	public static void main(String[] args) {
		// 1-100 以内的数求和，求出 当和 第一次大于 20 的当前数(break)
		
		// 代码：
		int sum = 0;
		int n = 0;
		for (int i = 1; i < 100; i++) {
			sum += i;
			if(sum > 20	) {
				System.out.println("和>20时， i为：" + i);
				n = i;
				break;
			}
		}
		System.out.println("当前n为：" + n);
	}
}

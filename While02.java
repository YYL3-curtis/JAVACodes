package unit06;

public class While02 {
	public static void main(String[] args) {
		// 打印 40—200 之间所有的偶数 (使用 while)
		int i = 40;
		int endNum = 200;
		while(i <= endNum) {
			if(i % 2 == 0) {
				System.out.println("偶数：" + i);
			}
			i++;
		}
	}
}

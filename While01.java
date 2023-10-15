package unit06;

public class While01 {
	public static void main(String[] args) {
		// 打印 1—100 之间所有能被 3 整除的数 (使用 while)
		// 先死后活
		int endNum = 100;
		int i = 1;
		while(i <= endNum) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}

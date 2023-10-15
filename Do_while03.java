package unit06;

public class Do_while03 {
	public static void main(String[] args) {
		// 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
		int startNum = 1;
		int count = 0;
		do {
			if(startNum % 5 ==0 & startNum % 3 != 0) {
				count ++;
			}
			startNum++;
		}while(startNum <= 200);
		System.out.println("能被 5 整除但不能被 3 整除的个数：" + count);
	}
}

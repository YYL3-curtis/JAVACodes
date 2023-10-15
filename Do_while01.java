package unit06;

public class Do_while01 {
	public static void main(String[] args) {
		// 打印 1—100
		
		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i <= 100); // 先执行，再判断，至少执行一次
	}
}

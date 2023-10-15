package unit06;

public class Do_while02 {
	public static void main(String[] args) {
		// 计算 1—100 的和
		int sum = 0;
		int i = 1;
		// 先死后活
		int Num = 100;
		do {
			sum += i;
			i++;
		}while(i <= Num);
		System.out.println("1—100 的和："+ sum);
	}
}

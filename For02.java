package unit06;

public class For02 {
	public static void main(String[] args) {
		// 0+5=5
		// 1+4=5
		// 2+3=5
		// 3+2=5
		// 4+1=5
		// 5+0=5
		
		// 编程思想：
			// [化繁为简,先死后活]
		
		int n = 9;
		for(int  i = 0; i <= n; i++) {
			System.out.println(i + "+" + (n-i) + "=" + n);
		}
	}
}

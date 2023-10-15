package unit06;

public class Continue01 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			i++;
			if(i == 2) {
				continue;
			}
			System.out.println(i);	// 3, 4, 5
		}
	}
}

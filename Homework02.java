package unit06;
import java.util.Scanner;
public class Homework02 {
	public static void main(String[] args) {
		// ����
			// ʵ���ж�һ�������������ĸ���Χ������0��С��0������0
		
		
		// ������
			// if-else if-else
		
		// ���룺
		Scanner myScanenr = new Scanner(System.in);
		System.out.println("���������֣�");
		int guess_num = myScanenr.nextInt();
		if(guess_num > 0) {
			System.out.println("��������0~~~");
		}else if(guess_num < 0) {
			System.out.println("����С��0~~~");
		}else if(guess_num == 0) {
			System.out.println("��������0~~~");
		}else {
			System.out.println("������������������!!!");
		}
		
	}
}

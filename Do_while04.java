package unit06;
import java.util.Scanner;

public class Do_while04 {
	public static void main(String[] args) {
		//  ����
			// �����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
		
		// ������
			// ����Scanner�����ڽ��������Ļش�
			// ��ͣ���ʻ�Ǯ
			// ����do-while�������ж�
		
		
		// ���룺
			Scanner youScanner = new Scanner(System.in);
			char answer = ' ';
			do {
				System.out.println("�Ϻ�����Ǯ ����  y/n");
				System.out.println("�Ϻ�һֱʹ��������~~");
				answer = youScanner.next().charAt(0);
				System.out.println("�����Ļش��ǣ�" + answer);
			}while(answer != 'y'); // ������Ӧ��Ǯ
			System.out.println("������Ǯ~~~");
	}
}

package unit05;

import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		// ����
			// ���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
			// a ��ʾ����һ��b ��ʾ���ڶ� ��
			// �����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch ������
		
		
		// ���룺
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("�������ַ���");
		
		char chars = myScanner.next().charAt(0);
		
		switch(chars) {
			case 'a':
				System.out.println("��������һ~~");
				break;
			case 'b':
				System.out.println("�������ڶ�~~");
				break;
			case 'c':
				System.out.println("����������~~");
				break;
			case 'd':
				System.out.println("����������~~");
				break;
			case 'e':
				System.out.println("����������~~");
				break;
			case 'f':
				System.out.println("����������~~");
				break;
			case 'g':
				System.out.println("����������~~");
				break;
			default :
				System.out.println("��������ַ�����ȷ��û��ƥ���");
		}
		
		System.out.println("�˳��� switch ,����ִ�г���");
	}
}

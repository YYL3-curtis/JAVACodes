package unit05;

import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		//  ����
			// ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��
			// ֻת�� a, b, c, d, e. ���������"other"
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("�������ַ���");
		
		char chars = myScanner.next().charAt(0);
		
		switch(chars) {
		case 'a' :
			System.out.println("A");
			break;
		case 'b' :
			System.out.println("B");
			break;
		case 'c' :
			System.out.println("C");
			break;
		case 'd' :
			System.out.println("D");
			break;
		case 'e' :
			System.out.println("E");
			break;
		default : 
			System.out.println("other~~");
		}
	}
}

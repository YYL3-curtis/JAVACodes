package unit05;

import java.util.Scanner;

public class Ifelseif03 {
	public static void main(String[] args) {
	// ����
		// �μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭��
		// ���Ҹ����Ա���ʾ�����������Ů���顣
		// double score; char gender;
		// �����ַ�: char gender = scanner.next().charAt(0)
		
	// ������
		// ����Scanner���󣬽�������
		// �������score���������ж�(if-else if- else)
		// ��������ɼ�����80�����������������ʾ��̭
		// ����ѡ�������Ա�gender��������Ů����
		
	// ����:
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ѡ�ֳɼ���");
		double score = myScanner.nextDouble();
		if(score >= 8.0) {
			System.out.println("������ѡ���Ա�");
			char gender = myScanner.next().charAt(0);
			if(gender == '��') {
				System.out.println("��ϲ�������������~~");
			}else if(gender == 'Ů') {
				System.out.println("��ϲ����Ů�������~~");
			}else {
				System.out.println("��������Ա��������������~~");
			}
		}else {
			System.out.println("��Ǹ��������̭��~~");
		}
}
}

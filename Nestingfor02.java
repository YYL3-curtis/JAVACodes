package unit06;
import java.util.Scanner;

public class Nestingfor02 {
	public static void main(String[] args) {
		// ����
			// 1) ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
			// 2) ͳ�������༰��������ÿ������ 5 ��ͬѧ��
		
		// ������
			// ����Ƕ��forѭ�����ν���ѧ���ɼ�
		
		
		// ���룺
		Scanner myScanner = new Scanner(System.in);
		int Total_score = 0;
		int score= 0 ;
		int passNum = 0;
		for (int i = 1; i <= 3; i++) {	// ѭ���༶
			int sum = 0;
			for(int j = 1; j <= 5; j++) {
				System.out.println("������� " + i + "���༶����" + j + "��ѧ���ĳɼ���");	// ѭ��ѧ���ɼ�
				score = myScanner.nextInt();
				if(score >= 60) {
					passNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ�� " + score);
			}
			Total_score += sum;
		}
		System.out.println("�������ܷ�="+ Total_score+ " ƽ����=" + Total_score / (3*5));
		System.out.println("��������=" + passNum);

	}
}

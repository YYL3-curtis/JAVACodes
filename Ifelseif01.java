package unit05;

import java.util.Scanner;

public class Ifelseif01 {
	public static void main(String[] args) {
		// ���뱣��ͬ־��֥�����÷֣�
		// �����
		// ���÷�Ϊ 100 ��ʱ����� ���ü��ã�
		// ���÷�Ϊ(80��99]ʱ����� �������㣻
		// ���÷�Ϊ[60,80]ʱ����� ����һ�㣻
		// ������� ����� ���� ������
		// ��Ӽ������뱣����֥�����÷֣��������ж�
		// �ٶ����÷���Ϊ in
		
		
		// ����
		Scanner mbgScanner = new Scanner(System.in);
		System.out.println("������֥�����÷֣�");
		
		int grade = mbgScanner.nextInt();
		
		if(grade >=1 && grade <= 100) {
			//��Ϊ�� 4 �����������ʹ�ö��֧
			if(grade == 100) {
			System.out.println("���ü���");
			} else if (grade > 80 && grade <= 99) { //���÷�Ϊ(80��99]ʱ����� ��������
			} else if (grade >= 60 && grade <= 80) {//���÷�Ϊ[60,80]ʱ����� ����һ��
			System.out.println("����һ��");
			} else {//������� ����� ���� ������
			System.out.println("���ò�����");
			}
			} else {
			System.out.println("���÷���Ҫ�� 1-100,����������:)");
			}
		
	}
}

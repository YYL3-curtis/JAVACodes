package unit05;
// ����
import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// ����
		// ��дһ������,���������˵�����,�����ͬ־��������� 18 ��,
		// ����� "��������� 18,Ҫ���Լ�����Ϊ����,�������"
	
	
	// ������
		// ����Scanner�����Խ���Ҫ���������
		// �����յ���������if�������ж�
		// ����������18�꣬����� "��������� 18,Ҫ���Լ�����Ϊ����,�������"
		// �������"������䲻����ηŹ�����"
	
	
	// ���룺
		// ����Scanner����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������䣺");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("��������� 18,Ҫ���Լ�����Ϊ����,�������");
		}else {
			System.out.println("������䲻����ηŹ�����");
		}
		
		System.out.println("�������....");
	}
}

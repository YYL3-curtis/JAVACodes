package unit05;

public class Switch03 {
	public static void main(String[] args) {
		// ����
			// ��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��
			// ��ʾ�� ��ʾ�ɼ� / 60
		
		
		// ���룺
		double fraction = 60;
		if(fraction <= 100 & fraction >= 0) {
			switch((int)(fraction / 60.0)) {
			case 0:
				System.out.println("������~~");
				break;
			case 1:
				System.out.println("����~~");
				break;
			default:
				System.out.println("��������~~");
			}
		}else {
			System.out.println("�������ֵֻ����1-100֮��~~");
		}
			
	}
}

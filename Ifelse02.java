package unit05;

public class Ifelse02 {
	public static void main(String[] args) {
		// ����
			// ������������ int���ж϶��ߵĺ�
			// �Ƿ��ܱ� 3 ���ܱ� 5 ��������ӡ��ʾ��Ϣ
		// ���룺
		int num1 = 10;
		int num2 = 45;
		int num3 = num1 + num2;
		if(num3 % 3 == 0 & num3 % 5 == 0) {
			System.out.println(num3 + "  ���Ա�3��5 ����");
		}else {
			System.out.println(num3 + "  �����Ա�3��5 ����");
		}
	}
}

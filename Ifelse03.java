package unit05;

public class Ifelse03 {
	public static void main(String[] args) {
		// ����
			// �ж�һ������Ƿ������꣬����������Ƿ����������֮һ��
			// (1)����ܱ� 4 �����������ܱ�100 ������
			// (2)�ܱ�400����
		// ���룺
		int year = 2028;
		if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " ������");
		}else {
			System.out.println(year + " ��������");
		}
	}
}

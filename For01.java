package unit06;

public class For01 {
	public static void main(String[] args) {
		// ����:
			// ��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� �� �ܺ�.
		
		// ���˼�룺
			// [����Ϊ��,�������]
		
		
		// ���룺
		
		int count = 0;
		int sum = 0;
		
		// �������
		int start = 1;
		int end = 100;
		int t = 9;
		for (int i = start; i <= end; i++) {
			if(i % t == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("�����ĸ���Ϊ��" + sum);
		System.out.println("�������ܺ�Ϊ��" + count);
	}
}

package unit06;

public class Break01 {
	public static void main(String[] args) {
		// 1-100 ���ڵ�����ͣ���� ���� ��һ�δ��� 20 �ĵ�ǰ��(break)
		
		// ���룺
		int sum = 0;
		int n = 0;
		for (int i = 1; i < 100; i++) {
			sum += i;
			if(sum > 20	) {
				System.out.println("��>20ʱ�� iΪ��" + i);
				n = i;
				break;
			}
		}
		System.out.println("��ǰnΪ��" + n);
	}
}

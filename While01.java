package unit06;

public class While01 {
	public static void main(String[] args) {
		// ��ӡ 1��100 ֮�������ܱ� 3 �������� (ʹ�� while)
		// �������
		int endNum = 100;
		int i = 1;
		while(i <= endNum) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}

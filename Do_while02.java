package unit06;

public class Do_while02 {
	public static void main(String[] args) {
		// ���� 1��100 �ĺ�
		int sum = 0;
		int i = 1;
		// �������
		int Num = 100;
		do {
			sum += i;
			i++;
		}while(i <= Num);
		System.out.println("1��100 �ĺͣ�"+ sum);
	}
}

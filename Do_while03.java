package unit06;

public class Do_while03 {
	public static void main(String[] args) {
		// ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ���
		int startNum = 1;
		int count = 0;
		do {
			if(startNum % 5 ==0 & startNum % 3 != 0) {
				count ++;
			}
			startNum++;
		}while(startNum <= 200);
		System.out.println("�ܱ� 5 ���������ܱ� 3 �����ĸ�����" + count);
	}
}

package unit06;

public class While02 {
	public static void main(String[] args) {
		// ��ӡ 40��200 ֮�����е�ż�� (ʹ�� while)
		int i = 40;
		int endNum = 200;
		while(i <= endNum) {
			if(i % 2 == 0) {
				System.out.println("ż����" + i);
			}
			i++;
		}
	}
}

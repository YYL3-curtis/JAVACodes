package unit06;

public class Homework01 {
	public static void main(String[] args) {
//		ĳ����100,000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
//		1) ���ֽ�>50000ʱ��ÿ�ν�5%
//		2)���ֽ�<=50000ʱ��ÿ�ν�1000
//		Ҫ��:������˿��Ծ������ٴ�   ==>   while + break
		
		
		// ���룺
		double money = 100000;
		int frequency = 0;
		while(true) {
			if(money > 50000) {
				money *= 0.95;
				frequency++;
			}else if(money >= 1000 && money <= 50000){
				money -= 1000;
				frequency++;
			}else {
				System.out.println("Ǯ������~~~ ");
				break;
			}
		}
		System.out.println("100000���Թ�" + frequency + " ��·�ڣ����ʣ" + money); 
	}
}

package unit05;

public class Ifelseif04 {
	public static void main(String[] args) {
		// ��Ʊϵͳ:���ݵ������·ݺ����䣬��ӡƱ��
		// 4-10 ������
			// ����(18-60): 60
			// ��ͯ(<18):���
			// ����(>60):1/3;
		
		// 11-3 ������
			// ���ˣ�40
			// ������20
		
		// ������
			// ����if-else�жϵ���������Ƕ�׷�֧�ж�����
		
		
		// ���룺
		int money = 60;
		int gender = 16;
		String season = "��";
		if(season == "��") {
			if(gender > 18 & gender < 60) {
				System.out.println("Ʊ�ۣ�" + money);
			}else if(gender < 18) {
				System.out.println("Ʊ�ۣ�" + money / 2);
			}else if(gender > 60) {
				System.out.println("Ʊ�ۣ�" + money / 3);
			}
		}else if(season == "��"){
			System.out.println("Ʊ�ۣ�" + (money- 20));
		}else {
			System.out.println("Ʊ�ۣ�" + (money - 40));
		}
	}
}

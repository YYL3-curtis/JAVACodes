package unit06;
import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		// ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���
		// ������ʾ���м��λ��ᣬ��ʹ��for+break���
		
		
		
		// ���룺
		String name = " ";
		String pass = " ";
		int chance = 3;	// ���Ƶ�¼����
		for (int i = 1; i <= 3; i++) {	// ģ���¼,����ѭ������
			Scanner dlScanner = new Scanner(System.in);
			System.out.println("�������û�����");
			name = dlScanner.next();
			System.out.println("���������룺");
			pass = dlScanner.next();
			if("����".equals(name) & "666".equals(pass)) {
				System.out.println("��ϲ�㣬��¼�ɹ�~");
				break;
			}
			chance--;
			System.out.println("�㻹��" + chance + "�ε�¼����");
		}
	}
}

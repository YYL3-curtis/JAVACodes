package unit06;

public class Homework03 {
	public static void main(String[] args) {
		// ˮ�ɻ�
		
		// ������
			// ���� % �� / 
		
		// ���룺
		int Bits = 0;
		int Ten = 0;
		int Hundred = 0;
		int count = 0;
	    for(int i = 100; i <1000; i++) {
	    	Bits = i % 10;
	    	Ten = i /10 % 10;
	    	Hundred =i / 100;
	    	if(Bits * Bits * Bits + Ten * Ten * Ten + Hundred * Hundred * Hundred == i) {
	    		count++;
	    		System.out.println("ˮ�ɻ���" + i);
	    	}
	    }
	    System.out.println("ˮ�ɻ��У�" + count + "��");
	}
}

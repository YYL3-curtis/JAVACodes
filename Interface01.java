package Implements_;

public class Interface01 {
	public static void main(String[] args) {
		//�����ֻ����������
		//Camera ʵ���� UsbInterface
		Camera camera = new Camera();
		
		//Phone ʵ���� UsbInterface
		Phone phone = new Phone();
		
		//���������
		Computer computer = new Computer();
		computer.work(phone);//���ֻ����뵽�����
		
		System.out.println("===============");
		computer.work(camera);//��������뵽�����
	}
}

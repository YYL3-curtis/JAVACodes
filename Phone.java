package Implements_;

public class Phone implements UsbInterface{
	public void start() {
		System.out.println("手机开始工作...");
	}

	public void stop() {
		System.out.println("手机停止工作.....");
	}
}

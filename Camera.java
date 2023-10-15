package Implements_;

public class Camera implements UsbInterface{	//实现接口,就是把接口方法实现
	public void start() {
		System.out.println("相机开始工作...");
	}
	
	public void stop() {
		System.out.println("相机结束工作...");
	}
}

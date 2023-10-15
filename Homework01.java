package unit06;

public class Homework01 {
	public static void main(String[] args) {
//		某人有100,000元，每经过一次路口，需要交费，规则如下：
//		1) 当现金>50000时，每次交5%
//		2)当现金<=50000时，每次交1000
//		要求:计算该人可以经过多少次   ==>   while + break
		
		
		// 代码：
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
				System.out.println("钱不够了~~~ ");
				break;
			}
		}
		System.out.println("100000可以过" + frequency + " 次路口，最后还剩" + money); 
	}
}

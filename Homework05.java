package unit06;

import java.util.Iterator;

public class Homework05 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			for(int j = 0; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println("sum:" + sum);
	}
}

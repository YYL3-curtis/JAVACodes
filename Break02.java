package unit06;
import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		// 实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，
		// 否则提示还有几次机会，请使用for+break完成
		
		
		
		// 代码：
		String name = " ";
		String pass = " ";
		int chance = 3;	// 控制登录次数
		for (int i = 1; i <= 3; i++) {	// 模拟登录,控制循环次数
			Scanner dlScanner = new Scanner(System.in);
			System.out.println("请输入用户名：");
			name = dlScanner.next();
			System.out.println("请输入密码：");
			pass = dlScanner.next();
			if("丁真".equals(name) & "666".equals(pass)) {
				System.out.println("恭喜你，登录成功~");
				break;
			}
			chance--;
			System.out.println("你还有" + chance + "次登录机会");
		}
	}
}

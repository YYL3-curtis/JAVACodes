package unit05;

public class Ifelseif02 {
	public static void main(String[] args) {
		boolean b = true;
		if(b == false) {	// b == false
			System.out.println("a");
		}else if(b) {
			System.out.println("b");	// ¡Ì
		}else if(!b) {
			System.out.println("c");	
		}else{
			System.out.println("d");
		}
		
		
		if(b = false) {	// b = false
			System.out.println("a");
		}else if(b) {
			System.out.println("b");
		}else if(!b) {
			System.out.println("c");	// ¡Ì
		}else{
			System.out.println("d");
		}
	}
}

public class MyClass04 {
	
	public static void main(String [] args) {
		
		int a = 100;
		int b = 200;
		/*
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		*/
		int max = a > b ? a : b;
		int sign = a > 0 ? 1 : a == 0 ? 0 : -1;
		
	}
	
}
		
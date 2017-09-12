public class Wow { 
	public static void main(String [] args) { 
		double x = 2.0 - 1.1; 
		double y = 0.9; 
		System.out.println(x);
		System.out.println(y);
		final double e = 1e-9; //0.0000000001;
		System.out.println(Math.abs(x - y) < e);
	}
}
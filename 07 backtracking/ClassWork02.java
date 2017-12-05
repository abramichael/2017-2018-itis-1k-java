public class ClassWork02 {
	
	public static void fibonacciRec(int n, long [] a) {
		if (n == 0) {
			a[n] = 1;
		}
		else {
			fibonacciRec(n - 1, a);
			if (n == 1) {
				a[n] = 1;
			}
			else {
				a[n] = a[n - 1] + a[n - 2];
			}
		}
	}
	
	public static long fib(int n) {
		
		long [] a = new long[n + 1];
		fibonacciRec(n, a);
		return a[n];
	}
	
	public static void main(String [] args) {
		
		int n = 50;
		
		long t1 = System.nanoTime();
		long f = fib(n);
		long t2 = System.nanoTime();
		
		System.out.println(t2 - t1);
		System.out.println(f);
		
	}
	
}
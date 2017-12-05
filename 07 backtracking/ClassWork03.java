public class ClassWork03 {
	
	public final static int L = 5;
	public final static int D = 10;
	public static void bruteForce() {
		String s = "";
		for (char c = 'a'; c <= 'z'; c += 1) {
			for (char c2 = 'a'; c2 <= 'z'; c2 += 1) {
				for (char c3 = 'a'; c3 <= 'z'; c3 += 1) {
					for (char c4 = 'a'; c4 <= 'z'; c4 += 1) {
						for (char c5 = 'a'; c5 <= 'z'; c5 += 1) {
							s = s + c + c2 + c3 + c4 + c5;
		}}}}}
	}
	public static void backTracking(String s) {
		if (s.length() == L) {
			//System.out.println(s);
		} else if (s.length() == 0) {
			for (char c = 'a'; c <= 'z'; c += 1) {
				backTracking(s + c);
			}
		} else {
			for (char c = 'a'; c <= 'z'; c += 1) {
				char c2 = s.charAt(s.length() - 1);
				if (Math.abs(c - c2) > D) {
					backTracking(s + c);
				}
			}
		}
	}
	
	public static void main(String [] args) {
		
		String s = "";
		long t1 = System.nanoTime();
		backTracking(s);
		long t2 = System.nanoTime();
		bruteForce();
		long t3 = System.nanoTime();
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
		
	}	
	
}
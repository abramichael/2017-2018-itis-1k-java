public class Main {
	
	public static void main(String [] args) {
		
		Raven r = new Raven();
		Nightingale n = new Nightingale();
		Cage cage = new Cage(n);
		Cage cage2 = new Cage(r);
		
		int n = 10;
		Bird [] birds = new Bird[n];
		for (int i = 0; i < n; i += 2) {
			birds[i] = new Raven();
			birds[i + 1] = new Nightingale();
		}
		
		for (Bird bird : birds) {
			bird.produceSound();
		}
		
		
	}
	
}
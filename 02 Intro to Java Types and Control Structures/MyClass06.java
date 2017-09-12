import java.util.Scanner;
public class MyClass06 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		/*
		int i = 1;
		while (i <= n) {
			s += i * i;
			i++;
		}
		*/
		for (int i = 1; i <= n; i++) {
			s += i * i;
		}
		
		
	}
	
}
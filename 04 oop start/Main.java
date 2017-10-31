import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		Hospital h = new Hospital("University Clinic");
		
		while (true) {
			
			String cmnd = sc.nextLine();
			if (cmnd.equals("exit")) {
				break;
			}
			
			else if (cmnd.equals("new p")) {
				System.out.println("Enter name of Patient");
				String name = sc.nextLine();
				h.addPatient(new Patient(name));
			}
			else if (cmnd.equals("show all p")) {
				System.out.println(Arrays.toString(h.getPatients()));
			}
			
		}
		
	}
	
	
}
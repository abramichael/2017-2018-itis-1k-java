import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class HospitalSingleton {
	private static Hospital hospital;
	public static getHospital() {
		if (hospital == null) {
			hospital = App.loadHospital("hospital.txt");
		}
		return hospital;
	}
}

public class App {	
	public static void main(String [] args) {
		
		App app = new App();
		app.init();
		app.start();
		app.save();
		
	}
	
	public void init() {
		//loadPatients();
	}
	
	public static Hospital loadHospital(String filename) {
		Hospital hospital;
		try {
			Scanner sc = new Scanner(new File(filename));
			hospital = new Hospital(
				sc.nextLine(),
				sc.nextLine(),
				Integer.parseInt(sc.nextLine()),
				Integer.parseInt(sc.nextLine()),
			);
		}
		catch (FileNotFoundException e) {
			hospital = new Hospital("Dummy Hospital");
		}
		return hospital;
	}
	
	public void save() {
		try {
			PrintWriter pw = new PrintWriter("patients.txt");
			
			Patient [] patients = HospitalSingleton.getHospital().getPatients();
			for (Patient patient: patients) {
				
				patient.dumpToWriter(pw);
				
			}
			
			pw.close();
		} 
		catch (FileNotFoundException e) {
			
		}
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		Hospital hospital = HospitalSingleton.getHospital();
		while (true) {
			
			String cmnd = sc.nextLine();
			
			if (cmnd.equals("exit")) {
				break;
			}
			
			else if (cmnd.equals("new p")) {
				System.out.println("Enter name of Patient");
				String name = sc.nextLine();
				hospital.addPatient(new Patient(name));
			}
			else if (cmnd.equals("show all p")) {
				System.out.println(Arrays.toString(hospital.getPatients()));
			}
			
		}
		
	}
	
	
}
public class Hospital {
	
	private String title;
	private Address address;
	private final int CAPACITY;
	private int numberOfPatients;
	private Patient [] patients;
	
	public Hospital(String title) {
		this.title = title;
		this.CAPACITY = 2000;
		patients = new Patient[CAPACITY];
		numberOfPatients = 0;
		System.out.println("Hospital " + title + " created");
	}
	
	public void addPatient(Patient patient) {
		patients[numberOfPatients] = patient;
		numberOfPatients++;
		System.out.println("Patient " + patient.getFio() +  " added to the hospital");
	}
	
	public Patient [] getPatients() {
		Patient [] realPatients = new Patient[numberOfPatients];	
		for (int i = 0; i < numberOfPatients; i++) {
			realPatients[i] = patients[i];
		}
		return realPatients;
	}
	
	
}
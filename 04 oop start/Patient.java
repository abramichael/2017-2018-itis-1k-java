import java.util.Date;

public class Patient {

	private String fio;
	private Date dateOfBirth;
	private Address address;
	private String passportInfo;
	private char gender;
	private String [] anamnesis;
	
	public String getFio() {
		return this.fio;
	}
	
	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public Patient(String fio) {
		setFio(fio);
		System.out.println("Patient " + fio + " created");
	}
	
	public String toString() {
		return "{patient: {name: " + fio + "}}";
	}
}
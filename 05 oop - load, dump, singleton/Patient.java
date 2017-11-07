import java.io.PrintWriter;
import java.util.Date;

public class Patient {

	private String fio;
	private Date dateOfBirth;
	private Address address;
	private String passportInfo;
	private char gender;
	private String [] anamnesis = new String[20];
	private int nAnamnesisNotes = 0;
	
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
	
	public void dumpToWriter(PrintWriter pw) {
		pw.println("#PATIENT");
		pw.println(fio);
		pw.println(dateOfBirth == null ? "" : dateOfBirth);
		pw.println(address == null ? "" : address);
		pw.println(passportInfo == null ? "" : passportInfo);
		pw.println(gender == 0 ? "" : gender);
		pw.println(nAnamnesisNotes);
		for (int i = 0; i < nAnamnesisNotes; i++) {
			pw.println(anamnesis[i]);
		}
	}
}
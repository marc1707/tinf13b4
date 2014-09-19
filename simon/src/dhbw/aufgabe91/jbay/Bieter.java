package dhbw.aufgabe91.jbay;

public class Bieter {
	
	private String vorname;
	private String nachname;

	public Bieter(String vorname, String nachname) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}	
	
	public String getFullName(){
		return this.vorname + " " + this.nachname;
	}
	
}

package model;

public class Internaute {
    public String Email;
    public String MotPasse;
	public Internaute() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMotPasse() {
		return MotPasse;
	}
	public void setMotPasse(String motPasse) {
		MotPasse = motPasse;
	}
	public Internaute(String email, String motPasse) {
		super();
		Email = email;
		MotPasse = motPasse;
	}

}

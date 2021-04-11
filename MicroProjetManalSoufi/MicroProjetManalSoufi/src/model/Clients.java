package model;

import java.sql.SQLException;
import java.util.List;

public class Clients extends Internaute{
    private int id;
    public String Email;
    public String Nom;
    public String Prenom;
    public String Adresse;
    public String CodePostal;
    public String Ville;
    public String Tel;
    public String MotPasse;
	public Clients() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getMotPasse() {
		return MotPasse;
	}
	public void setMotPasse(String motPasse) {
		MotPasse = motPasse;
	}
	public Clients(String email, String nom, String prenom, String adresse, String codePostal2, String ville,
			String tel, String motPasse) {
		super();
		Email = email;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		CodePostal = codePostal2;
		Ville = ville;
		Tel = tel;
		MotPasse = motPasse;
	}
	
   
}

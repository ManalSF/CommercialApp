package model;

public class Commandes {
    private double NumCommande;
    public String CodeClient;
    public String DateCommande;
	public Commandes() {
		// TODO Auto-generated constructor stub
	}
	public double getNumCommande() {
		return NumCommande;
	}
	public void setNumCommande(double numCommande) {
		NumCommande = numCommande;
	}
	public String getCodeClient() {
		return CodeClient;
	}
	public void setCodeClient(String codeClient) {
		CodeClient = codeClient;
	}
	public String getDateCommande() {
		return DateCommande;
	}
	public void setDateCommande(String dateCommande) {
		DateCommande = dateCommande;
	}
	public Commandes(double numCommande, String codeClient, String dateCommande) {
		super();
		NumCommande = numCommande;
		CodeClient = codeClient;
		DateCommande = dateCommande;
	}

}

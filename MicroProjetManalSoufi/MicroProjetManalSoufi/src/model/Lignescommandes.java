package model;

public class Lignescommandes {
    private double NumCommande;
    private String CodeArticle;
    public  float QteCde;
	public Lignescommandes() {
		// TODO Auto-generated constructor stub
	}
	public double getNumCommande() {
		return NumCommande;
	}
	public void setNumCommande(double numCommande) {
		NumCommande = numCommande;
	}
	public String getCodeArticle() {
		return CodeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		CodeArticle = codeArticle;
	}
	public float getQteCde() {
		return QteCde;
	}
	public void setQteCde(float qteCde) {
		QteCde = qteCde;
	}
	public Lignescommandes(double numCommande, String codeArticle, float qteCde) {
		super();
		NumCommande = numCommande;
		CodeArticle = codeArticle;
		QteCde = qteCde;
	}
    
}

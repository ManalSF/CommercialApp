package model;

public class Articles {
    private String CodeArticle;
    public String Designation;
    public float Prix;
    public int Stock;
    public String Categorie;
    public String photo;
	public Articles() {
		// TODO Auto-generated constructor stub
	}
	public String getCodeArticle() {
		return CodeArticle;
	}
	public void setCodeArticle(String codeArticle) {
		CodeArticle = codeArticle;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getPrix() {
		return Prix;
	}
	public void setPrix(float prix) {
		Prix = prix;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Articles(String codeArticle, String designation, float prix, int stock, String categorie, String photo) {
		super();
		CodeArticle = codeArticle;
		Designation = designation;
		Prix = prix;
		Stock = stock;
		Categorie = categorie;
		this.photo = photo;
	}
	

}

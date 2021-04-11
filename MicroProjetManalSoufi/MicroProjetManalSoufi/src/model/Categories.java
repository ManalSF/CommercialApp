package model;

public class Categories {
    private String RefCat;
    public String Cat;
	public Categories() {
		// TODO Auto-generated constructor stub
	}
	public String getRefCat() {
		return RefCat;
	}
	public void setRefCat(String refCat) {
		RefCat = refCat;
	}
	public String getCat() {
		return Cat;
	}
	public void setCat(String cat) {
		Cat = cat;
	}
	public Categories(String refCat, String cat) {
		super();
		RefCat = refCat;
		Cat = cat;
	}

}

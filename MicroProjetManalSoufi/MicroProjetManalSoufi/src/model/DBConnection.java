package model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.mysql.cj.xdevapi.Client;

import model.Articles;
import model.Clients;

public class DBConnection {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private PreparedStatement pstmt;
	
    public DBConnection() {
		 try{
	         Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection("jdbc:mysql://mysql-25433-0.cloudclusters.net:25472/bdarticle","manal","qwerty2011");
	         stmt = conn.createStatement();    
	      }
		 catch(SQLException se){
	         se.printStackTrace();
	      }
		 catch(Exception e){
	         e.printStackTrace();
	      }
	}
	
	public void ajoutClt(String Email, String Nom, String Prenom, String Adresse, String codePostal, String Ville,
			String Tel, String MotPasse) {
		String sql="INSERT INTO clients(Email,Nom,Prenom,Adresse,CodePostal,Ville,Tel,MotPasse) values('"+Email+"','"+Nom+"','"+Prenom+"','"+Adresse+"','"+codePostal+"','"+Ville+"','"+Tel+"','"+MotPasse+"')";
		try {
			stmt.executeUpdate(sql);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Clients MontrerClient(String Email,String MotPasse) {
		Clients clt=null; 
		try{
	         pstmt= conn.prepareStatement("select * from clients where Email=? and MotPasse=?");
	         pstmt.setString(1,Email);
	         pstmt.setString(2, MotPasse);
	         rs=pstmt.executeQuery();
	        
	         if(rs.next()){
	        	int id = rs.getInt("id");
	            String nom = rs.getString("Nom");
	            String prenom = rs.getString("Prenom");
	            String ville= rs.getString("Ville");
	            String codePostal= rs.getString("CodePostal");
	            String tel= rs.getString("Tel");
	            String adresse= rs.getString("Adresse");
	            clt=new Clients(Email,nom,prenom,adresse,codePostal,ville,tel,MotPasse);
	         }
	         rs.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
		return clt;
	}

	public List<Articles> MontrerArticles(){
		
		List<Articles> articles=new ArrayList<Articles>();
		try{
	         pstmt= conn.prepareStatement("select * from articles");
	         //pstmt.setString(1,Categorie);
	         rs=pstmt.executeQuery();
	         
	         while(rs.next()){
	        	    String CodeArticle = rs.getString("CodeArticle");
	        	    String designation = rs.getString("Designation");
		            float prix = (float) rs.getDouble("Prix");
		            int stock=rs.getInt("Stock");
		            String photo= rs.getString("Photo");
		            String categorie=rs.getString("Categorie");
	            Articles ar=new Articles(CodeArticle,designation,prix,stock,categorie,photo);
	            articles.add(ar);
	            
	         }
	         rs.close();
	      }catch(SQLException e){
	         e.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
		
		
		return articles;
	}
	
	public Articles MontrerArticle(String CodeArticle) {
		
		Articles ar=null;
		
		try{
	         pstmt= conn.prepareStatement("select * from articles where CodeArticle=?");
	         pstmt.setString(1,CodeArticle);
	         rs=pstmt.executeQuery();
	         
	         if(rs.next()){
	            String designation = rs.getString("Designation");
	            float prix = (float) rs.getDouble("Prix");
	            int stock=rs.getInt("Stock");
	            String photo= rs.getString("Photo");
	            String categorie=rs.getString("Categorie");
	            ar=new Articles(CodeArticle,designation,prix,stock,categorie,photo);
	            System.out.println("gsdv");
	         }
	         rs.close();
	      }catch(SQLException e){
	         e.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
	      }
		return ar;
		
	}

}

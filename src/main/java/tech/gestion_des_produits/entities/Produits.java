package tech.gestion_des_produits.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Produits {

	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id ;
	
	private double price ;
	private String nom ;
	private int quantity ;
	
	@ManyToOne 
	private Categories c ;
	
	public Categories getC() {
		return c;
	}
	public void setC(Categories c) {
		this.c = c;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

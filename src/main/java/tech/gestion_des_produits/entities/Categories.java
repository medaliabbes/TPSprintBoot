package tech.gestion_des_produits.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity 
@Data @NoArgsConstructor @AllArgsConstructor
public class Categories {
	
	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id ;
	private String nom ;
	
	@OneToMany(mappedBy = "c" , cascade = CascadeType.ALL)
	List<Produits> productList = new ArrayList<Produits>() ;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

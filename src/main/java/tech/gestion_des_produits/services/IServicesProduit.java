package tech.gestion_des_produits.services;

import java.util.List;

import tech.gestion_des_produits.entities.Produits;

public interface IServicesProduit {

	public void addProduit(Produits p);
	
	public List<Produits> getAllProduit();
	
	public Produits Produit_getProducts(Integer id) ;
	
	public void updateProduit(Produits p);
	
	public void deleteProduit(int id) ;
	
	
	
}

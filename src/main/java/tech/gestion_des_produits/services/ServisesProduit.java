package tech.gestion_des_produits.services;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tech.gestion_des_produits.Dao.ProduitsRepository;
import tech.gestion_des_produits.entities.Produits;


@Service
@AllArgsConstructor
public class ServisesProduit implements IServicesProduit {
	
	//@Autowired
	ProduitsRepository pr ;
	
	@Override
	public void addProduit(Produits p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public List<Produits> getAllProduit() {
		// TODO Auto-generated method stub
		
 		return pr.findAll() ;
	}

	@Override
	public void updateProduit(Produits p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public void deleteProduit(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public Produits Produit_getProducts(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

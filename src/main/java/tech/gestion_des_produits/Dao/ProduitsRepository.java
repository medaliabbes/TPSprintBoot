package tech.gestion_des_produits.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import tech.gestion_des_produits.entities.*;

public interface ProduitsRepository extends JpaRepository<Produits ,Integer> {
	

}

package tech.gestion_des_produits.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.gestion_des_produits.entities.Categories;


public interface CategorieRepository extends JpaRepository<Categories ,Integer> {

}

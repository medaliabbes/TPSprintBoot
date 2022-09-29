package tech.gestion_des_produits.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import tech.gestion_des_produits.entities.Produits;
import tech.gestion_des_produits.services.ServisesProduit;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProduitsController {

	ServisesProduit productService ;
	
	@GetMapping("/all")
	public String getAll(Model m)
	{
		List<Produits> ProductsList = productService.getAllProduit() ;
		
		m.addAttribute("ProductsList", ProductsList) ;
		
		
		//returun the name of jsp page
		return "products" ;
	}
}

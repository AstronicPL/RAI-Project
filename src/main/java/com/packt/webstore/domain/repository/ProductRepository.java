package com.packt.webstore.domain.repository;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();  //atrapa repozytorium przechowywuj¹ca obiekty w pamiêci RAM
	Product getProductById(String productId);
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}

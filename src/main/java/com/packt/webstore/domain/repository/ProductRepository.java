package com.packt.webstore.domain.repository;
import java.util.List;
import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();  //atrapa repozytorium przechowywująca obiekty w pamięci RAM
	Product getProductById(String productId);
	List<Product> getProductsByCategory(String category);
	
}

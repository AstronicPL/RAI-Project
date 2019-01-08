package com.packt.webstore.domain.repository;
import java.util.List;
import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();  //atrapa repozytorium przechowywuj¹ca obiekty w pamiêci RAM
	Product getProductById(String productId);
}

package com.packt.webstore.domain.repository;
import java.util.List;
import com.packt.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();  //atrapa repozytorium przechowywuj�ca obiekty w pami�ci RAM
	Product getProductById(String productId);
}

package com.agile.repository;

import com.agile.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long>{
	Optional<Product> findByName(String name);
	List<Product> findByProductOwnerId(Long productOwnerId);
}

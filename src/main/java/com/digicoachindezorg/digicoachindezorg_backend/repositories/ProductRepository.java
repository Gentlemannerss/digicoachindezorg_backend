package com.digicoachindezorg.digicoachindezorg_backend.repositories;

import com.digicoachindezorg.digicoachindezorg_backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

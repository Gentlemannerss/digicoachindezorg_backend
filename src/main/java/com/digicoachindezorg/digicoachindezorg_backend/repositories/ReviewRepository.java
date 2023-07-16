package com.digicoachindezorg.digicoachindezorg_backend.repositories;

import com.digicoachindezorg.digicoachindezorg_backend.models.Product;
import com.digicoachindezorg.digicoachindezorg_backend.models.Review;
import com.digicoachindezorg.digicoachindezorg_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByProductProductId(Long productId);
    List<Review> findByProductAndCustomer(Product product, User user);
    List <Review> findByCustomer(User user);
}

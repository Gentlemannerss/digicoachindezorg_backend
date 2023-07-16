package com.digicoachindezorg.digicoachindezorg_backend.repositories;

import com.digicoachindezorg.digicoachindezorg_backend.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query("SELECT i FROM Invoice i  WHERE i.user.id = :userId")
    List<Invoice> findByUserUserId(Long userId);

    @Query("SELECT i FROM Invoice i WHERE i.user.id = :userId")
    List<Invoice> findAllByUserUserId(Long userId);
}

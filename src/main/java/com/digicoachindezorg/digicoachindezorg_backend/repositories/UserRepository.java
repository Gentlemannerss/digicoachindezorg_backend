package com.digicoachindezorg.digicoachindezorg_backend.repositories;

import com.digicoachindezorg.digicoachindezorg_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        User findByPrivateEMail(String privateEMail);
        User findByUsername(String username);
        boolean existsByUsername(String username);
}

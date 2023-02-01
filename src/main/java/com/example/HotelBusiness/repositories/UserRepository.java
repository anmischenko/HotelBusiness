package com.example.HotelBusiness.repositories;

import com.example.HotelBusiness.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

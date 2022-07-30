package com.example.staybooking.repository;

import com.example.staybooking.model.Stay;
import com.example.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StayRepository extends JpaRepository<Stay, Long> {
    List<Stay> findByHost(User User);

    Stay findByIdAndHost(Long id, User host);
}

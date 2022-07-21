package com.example.staybooking.repository;

import com.example.staybooking.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityRepository extends JpaRepository<Authority, String> {

}

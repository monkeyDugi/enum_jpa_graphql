package com.example.enum_jpa_graphql.repository;

import com.example.enum_jpa_graphql.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long> {
}

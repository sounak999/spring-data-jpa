package com.practice.jpa.jpa_practice.repositories;

import com.practice.jpa.jpa_practice.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<ProductEntity, Long> {

}

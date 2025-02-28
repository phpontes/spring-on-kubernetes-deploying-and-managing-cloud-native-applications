package com.paulopontes.wisdom.data.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopontes.wisdom.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
  Optional<Product> findByName(String name);
}
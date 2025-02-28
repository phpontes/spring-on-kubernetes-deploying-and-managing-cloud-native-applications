package com.paulopontes.wisdom.data.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID productId;
  @Column(unique = true)
  private String name;
  private BigDecimal price;
  private UUID vendorId;
}

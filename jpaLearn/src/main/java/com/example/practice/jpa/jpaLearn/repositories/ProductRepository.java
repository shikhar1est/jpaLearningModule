package com.example.practice.jpa.jpaLearn.repositories;

import com.example.practice.jpa.jpaLearn.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//entity
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
